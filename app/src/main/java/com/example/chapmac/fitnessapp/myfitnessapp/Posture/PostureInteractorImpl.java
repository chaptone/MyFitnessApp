package com.example.chapmac.fitnessapp.myfitnessapp.Posture;

import android.os.Handler;

import com.example.chapmac.fitnessapp.myfitnessapp.Data.MockData;
import com.example.chapmac.fitnessapp.myfitnessapp.Data.Posture;


import java.util.List;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class PostureInteractorImpl implements PostureInteractor{

    private MockData mockData;

    @Override
    public void findItems(final PostureInteractor.OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(createArrayList());
            }
        }, 200);
    }

    private List<Posture> createArrayList() {
        mockData = new MockData();
        return mockData.getAbsList();
    }
}
