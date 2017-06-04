package com.example.chapmac.fitnessapp.myfitnessapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class MockData {


    private Posture posture;
    private List<Posture> postureList;

    public MockData(){
        postureList = new ArrayList<>();
    }

    public List<Posture> getMockPosture(){
        postureList.add(new Posture("Shoulder",R.mipmap.shoulder));
        postureList.add(new Posture("Abs",R.mipmap.shoulder));
        return postureList;
    }

}
