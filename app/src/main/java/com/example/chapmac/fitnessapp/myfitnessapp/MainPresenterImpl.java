

package com.example.chapmac.fitnessapp.myfitnessapp;

import android.content.Intent;

import java.util.List;

public class MainPresenterImpl implements MainPresenter, FindItemsInteractor.OnFinishedListener {

    private MainView mainView;
    private FindItemsInteractor findItemsInteractor;

    public MainPresenterImpl(MainView mainView, FindItemsInteractor findItemsInteractor) {
        this.mainView = mainView;
        this.findItemsInteractor = findItemsInteractor;
    }

    @Override
    public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }

        findItemsInteractor.findItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        String str = "";
        if (mainView != null) {
            if(position == 0) str = "Abs";
            if(position == 1) str = "Back";
            if(position == 2) str = "Biceps";
            if(position == 3) str = "Calf";
            if(position == 4) str = "Chest";
            if(position == 5) str = "Forearms";
            if(position == 6) str = "Legs";
            if(position == 7) str = "Shoulders";
            if(position == 8) str = "Triceps";
            mainView.navigateToPosture(str);
        }
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void onFinished(List<Workout> items) {
        if (mainView != null) {
            mainView.setItems(items);
            mainView.hideProgress();
        }
    }

    public MainView getMainView() {
        return mainView;
    }
}
