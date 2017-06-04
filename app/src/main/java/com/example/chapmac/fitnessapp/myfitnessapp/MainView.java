
package com.example.chapmac.fitnessapp.myfitnessapp;

import java.util.List;

public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<Posture> items);

    void showMessage(String message);
}
