package com.samsung.myitschool.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.samsung.myitschool.recyclerviewexample.model.City;
import com.samsung.myitschool.recyclerviewexample.model.CityManager;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView mRecyclerView;
    private CityAdapter mAdapter;
    private List<City> cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cities = CityManager.getInstance(this.getApplicationContext()).getCites();
        mRecyclerView = findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        Log.i("hello",cities.toString());
        mAdapter = new CityAdapter(cities, R.layout.row_city, this);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int position) {

        final City city = cities.get(position);
        Intent i = new Intent(this, CityDetail.class);
        i.putExtra("city", city.name);
        i.putExtra("desc", city.description);
        i.putExtra("image", city.imageName);
        Log.i("hello", city.name);
        startActivity(i);
    }
}
