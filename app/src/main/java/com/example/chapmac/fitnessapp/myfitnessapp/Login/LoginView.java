package com.example.chapmac.fitnessapp.myfitnessapp.Login;

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
