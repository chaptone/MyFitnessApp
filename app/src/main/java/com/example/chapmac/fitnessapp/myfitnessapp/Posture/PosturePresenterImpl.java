package com.example.chapmac.fitnessapp.myfitnessapp.Posture;

import com.example.chapmac.fitnessapp.myfitnessapp.Data.Posture;



import java.util.List;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class PosturePresenterImpl implements PosturePresenter , PostureInteractor.OnFinishedListener {

    private PostureView postureView;
    private PostureInteractor postureInteractor;

    public PosturePresenterImpl(PostureView postureView, PostureInteractor postureInteractor) {
        this.postureView = postureView;
        this.postureInteractor = postureInteractor;
    }

    @Override
    public void onResume() {
        if (postureView != null) {
            postureView.showProgress();
        }

        postureInteractor.findItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        String str = "";
        if (postureView != null) {
            if(position == 0) str = "Incline Bench Sit-Ups";
            if(position == 1) str = "Hanging Leg Raises";
            if(position == 2) str = "Dumbbell Side Bends";
            if(position == 3) str = "Crunchs";
            if(position == 4) str = "Sit-Ups";
            if(position == 5) str = "Leg Raises";
            postureView.navigateToPosture(str);
        }
    }

    @Override
    public void onDestroy() {
        postureView = null;
    }

    @Override
    public void onFinished(List<Posture> items) {
        if (postureView != null) {
            postureView.setItems(items);
            postureView.hideProgress();
        }
    }

    public PostureView getPostureView() {
        return postureView;
    }

}
