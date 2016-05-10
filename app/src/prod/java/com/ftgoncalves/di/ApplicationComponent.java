package com.ftgoncalves.di;

import com.ftgoncalves.javarxandroid.di.BaseComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface ApplicationComponent extends BaseComponent {}