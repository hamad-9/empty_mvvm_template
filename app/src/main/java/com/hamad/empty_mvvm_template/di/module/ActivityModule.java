package com.hamad.empty_mvvm_template.di.module;
import androidx.core.util.Supplier;
import androidx.lifecycle.ViewModelProvider;

import com.hamad.empty_mvvm_template.ViewModelProviderFactory;
import com.hamad.empty_mvvm_template.data.DataManager;
import com.hamad.empty_mvvm_template.ui.base.BaseActivity;
import com.hamad.empty_mvvm_template.ui.login.LoginViewModel;
import com.hamad.empty_mvvm_template.ui.main.MainViewModel;
import com.hamad.empty_mvvm_template.ui.splash.SplashViewModel;
import com.hamad.empty_mvvm_template.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module //I don't own Activity class so i have to create a module to it if i want to
        //inject its instances inside my classes.
public class ActivityModule {
    private BaseActivity<?, ?> activity;

    public ActivityModule(BaseActivity<?, ?> activity) {
        this.activity = activity;
    }


    @Provides
    MainViewModel provideMainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<MainViewModel> supplier = () -> new MainViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<MainViewModel> factory = new ViewModelProviderFactory<>(MainViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(MainViewModel.class);
    }

    @Provides
    LoginViewModel provideLoginViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<LoginViewModel> supplier = () -> new LoginViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<LoginViewModel> factory = new ViewModelProviderFactory<>(LoginViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(LoginViewModel.class);
    }

    @Provides
    SplashViewModel provideSplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        Supplier<SplashViewModel> supplier = () -> new SplashViewModel(dataManager, schedulerProvider);
        ViewModelProviderFactory<SplashViewModel> factory = new ViewModelProviderFactory<>(SplashViewModel.class, supplier);
        return new ViewModelProvider(activity, factory).get(SplashViewModel.class);
    }

}
