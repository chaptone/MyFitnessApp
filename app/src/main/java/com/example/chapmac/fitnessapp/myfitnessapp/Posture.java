package com.example.chapmac.fitnessapp.myfitnessapp;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class Posture {
    private String title;
    private int icon;

    public Posture (String title , int icon){
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
