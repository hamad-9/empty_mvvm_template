package com.hamad.empty_mvvm_template.di.component;

import com.hamad.empty_mvvm_template.di.module.ActivityModule;
import com.hamad.empty_mvvm_template.di.scope.ActivityScope;

import com.hamad.empty_mvvm_template.ui.login.LoginActivity;
import com.hamad.empty_mvvm_template.ui.main.MainActivity;
import com.hamad.empty_mvvm_template.ui.splash.SplashActivity;

import dagger.Component;


@ActivityScope
@Component(modules = ActivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent {



    void inject(LoginActivity activity);

    void inject(MainActivity activity);

    void inject(SplashActivity splashActivity);

}
