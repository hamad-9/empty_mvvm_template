package com.hamad.empty_mvvm_template.di.component;

import android.app.Application;
import com.hamad.empty_mvvm_template.MvvmApp;
import com.hamad.empty_mvvm_template.data.DataManager;

import com.hamad.empty_mvvm_template.di.module.AppModule;
import com.hamad.empty_mvvm_template.utils.rx.SchedulerProvider;

import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;


@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MvvmApp app);

    DataManager getDataManager();

    SchedulerProvider getSchedulerProvider();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
