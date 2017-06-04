
package com.example.chapmac.fitnessapp.myfitnessapp;

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
