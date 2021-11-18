package com.hamad.empty_mvvm_template.ui.login;



public interface LoginNavigator {

    void handleError(Throwable throwable);

    void login();

    void openMainActivity();
}
