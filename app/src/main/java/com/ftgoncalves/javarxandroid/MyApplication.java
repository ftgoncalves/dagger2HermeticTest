package com.ftgoncalves.javarxandroid;

import android.app.Application;

import com.ftgoncalves.javarxandroid.di.BaseComponent;

public abstract class MyApplication extends Application {
    private static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static MyApplication getApplication() {
        return application;
    }

    protected BaseComponent component;

    protected abstract void createComponent();

    public BaseComponent getComponent() {
        return component;
    }
}