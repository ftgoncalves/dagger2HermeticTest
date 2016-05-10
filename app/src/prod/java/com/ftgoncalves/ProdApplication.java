package com.ftgoncalves;

import com.ftgoncalves.di.DaggerApplicationComponent;
import com.ftgoncalves.javarxandroid.MyApplication;

public class ProdApplication extends MyApplication {

    @Override
    protected void createComponent() {
        component = DaggerApplicationComponent.create();
    }
}
