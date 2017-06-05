package com.example.chapmac.fitnessapp.myfitnessapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class MockData {


    private Workout workout;
    private List<Workout> workoutList;

    public MockData(){
        workoutList = new ArrayList<>();
    }

    public List<Workout> getMockWorkout(){
        workoutList.add(new Workout("Abs",R.mipmap.abs));
        workoutList.add(new Workout("back",R.mipmap.back));
        workoutList.add(new Workout("Biceps",R.mipmap.bicep));
        workoutList.add(new Workout("Calf",R.mipmap.calf));
        workoutList.add(new Workout("Chest",R.mipmap.chest));
        workoutList.add(new Workout("Forearms",R.mipmap.forearm));
        workoutList.add(new Workout("Legs",R.mipmap.legs));
        workoutList.add(new Workout("Shoulders",R.mipmap.shoulder));
        workoutList.add(new Workout("Triceps",R.mipmap.tricep));

        return workoutList;
    }

}
