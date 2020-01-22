package com.samsung.myitschool.recyclerviewexample.model;

import android.content.Context;

public class City {

    public String name;
    public String description;
    public String imageName;

    public int getImageResourceId(Context context)
    {
        try {
            return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}