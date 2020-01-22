package com.samsung.myitschool.recyclerviewexample;


import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CityDetail extends AppCompatActivity {
    private TextView tvCityName;
    private TextView tvCityDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_view);

        LinearLayout lr = findViewById(R.id.lr);
        lr.setBackground(getResources().getDrawable(getResources().getIdentifier(getIntent().getStringExtra("image"), "drawable", getPackageName())));

        tvCityName = findViewById(R.id.tv_city_name);
        tvCityName.setText(getIntent().getStringExtra("city"));
        tvCityDesc = findViewById(R.id.tv_city_desc);
        tvCityDesc.setText(getIntent().getStringExtra("desc"));

    }
}