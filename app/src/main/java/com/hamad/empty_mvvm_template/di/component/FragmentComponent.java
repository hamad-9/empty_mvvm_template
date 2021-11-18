package com.hamad.empty_mvvm_template.di.component;

import com.hamad.empty_mvvm_template.di.module.FragmentModule;
import com.hamad.empty_mvvm_template.di.scope.FragmentScope;
import dagger.Component;

@FragmentScope
@Component(modules = FragmentModule.class, dependencies = AppComponent.class)
public interface FragmentComponent {

}
