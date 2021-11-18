package com.hamad.empty_mvvm_template.utils.rx;

import io.reactivex.Scheduler;



public interface SchedulerProvider {

    Scheduler computation();

    Scheduler io();

    Scheduler ui();
}
