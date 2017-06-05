package com.example.chapmac.fitnessapp.myfitnessapp.Posture;

import com.example.chapmac.fitnessapp.myfitnessapp.Data.Posture;


import java.util.List;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public interface PostureView {

    void showProgress();

    void hideProgress();

    void setItems(List<Posture> items);

    void navigateToPosture(String str);
}
