package com.example.chapmac.fitnessapp.myfitnessapp.Data;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class Posture {
    private String title;
    private int icon;
    private String Descrip;

    public Posture (String title,int icon,String Descrip){
        this.title = title;
        this.icon = icon;
        this.Descrip = Descrip;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String descrip) {
        Descrip = descrip;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}

