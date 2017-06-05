
package com.example.chapmac.fitnessapp.myfitnessapp;

import java.util.List;

public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<Workout> items);

    void navigateToPosture(String str);
}
