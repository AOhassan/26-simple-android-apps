package com.example.ahmedosman.imageinfoapp.models;
import android.graphics.drawable.Drawable;

public class Places {
    public String location;
    public int drawableId;
    public String description;

    public Places(String location, int drawableId, String description){
        this.location = location;
        this.drawableId = drawableId;
        this.description = description;
    }
}
