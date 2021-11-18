package com.hamad.empty_mvvm_template.ui.splash;

import com.hamad.empty_mvvm_template.data.DataManager;
import com.hamad.empty_mvvm_template.ui.base.BaseViewModel;
import com.hamad.empty_mvvm_template.utils.rx.SchedulerProvider;


public class SplashViewModel extends BaseViewModel<SplashNavigator> {

    public SplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void startSeeding() {

        decideNextActivity();
    }

    private void decideNextActivity() {
        if (getDataManager().getCurrentUserLoggedInMode() == DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType()) {
            getNavigator().openLoginActivity();
        } else {
            getNavigator().openMainActivity();
        }
    }
}
