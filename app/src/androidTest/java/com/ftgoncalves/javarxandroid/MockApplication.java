package com.ftgoncalves.javarxandroid;

import com.ftgoncalves.di.MockModule;

public class MockApplication extends MyApplication {

    @Override
    protected void createComponent() {
        component = DaggerMainActivityTest_MockComponent.builder()
                .mockModule(new MockModule())
                .build();
    }
}
