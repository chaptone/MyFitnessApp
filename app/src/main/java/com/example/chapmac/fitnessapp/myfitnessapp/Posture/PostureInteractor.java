package com.example.chapmac.fitnessapp.myfitnessapp.Posture;

import com.example.chapmac.fitnessapp.myfitnessapp.Data.Posture;


import java.util.List;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public interface PostureInteractor {

    interface OnFinishedListener {
        void onFinished(List<Posture> items);
    }

    void findItems(OnFinishedListener listener);
}
