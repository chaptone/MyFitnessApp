package com.example.chapmac.fitnessapp.myfitnessapp.Data;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class Workout {
    private String title;
    private int icon;

    public Workout(String title , int icon){
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
