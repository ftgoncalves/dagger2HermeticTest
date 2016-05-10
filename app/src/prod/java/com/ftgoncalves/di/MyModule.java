package com.ftgoncalves.di;

import com.ftgoncalves.Background;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Provides
    @Singleton
    Background privideBackground() {
        return new Background();
    }
}
