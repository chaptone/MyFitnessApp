
package com.example.chapmac.fitnessapp.myfitnessapp.Login;

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
