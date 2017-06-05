package com.example.chapmac.fitnessapp.myfitnessapp.Data;

import com.example.chapmac.fitnessapp.myfitnessapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class MockData {

    private List<Workout> workoutList;
    private List<Posture> postureList;

    public MockData(){
        workoutList = new ArrayList<>();
        postureList = new ArrayList<>();
    }

    public List<Workout> getMockWorkout(){
        workoutList.add(new Workout("Abs", R.mipmap.abs));
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

    public List<Posture> getAbsList(){
        postureList.add(new Posture("Incline Bench Sit-Ups",R.mipmap.abs1,"bar bar bar..."));
        postureList.add(new Posture("Hanging Leg Raises",R.mipmap.abs2,"bar bar bar..."));
        postureList.add(new Posture("Dumbbell Side Bends",R.mipmap.abs3,"bar bar bar..."));
        postureList.add(new Posture("Crunchs",R.mipmap.abs4,"bar bar bar..."));
        postureList.add(new Posture("Sit-Ups",R.mipmap.abs5,"bar bar bar..."));
        postureList.add(new Posture("Leg Raises",R.mipmap.abs6,"bar bar bar..."));
        return postureList;
    }

}
