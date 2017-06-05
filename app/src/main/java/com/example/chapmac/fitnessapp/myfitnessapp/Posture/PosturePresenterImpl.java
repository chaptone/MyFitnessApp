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
            if(position == 0) str = "Abs";
            if(position == 1) str = "Back";
            if(position == 2) str = "Biceps";
            if(position == 3) str = "Calf";
            if(position == 4) str = "Chest";
            if(position == 5) str = "Forearms";
            if(position == 6) str = "Legs";
            if(position == 7) str = "Shoulders";
            if(position == 8) str = "Triceps";
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
