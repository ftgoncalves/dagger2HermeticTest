package com.ftgoncalves.javarxandroid;


import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.ftgoncalves.Background;
import com.ftgoncalves.di.MockModule;
import com.ftgoncalves.javarxandroid.di.BaseComponent;

import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends BaseActivityTestCase {

    @Inject
    Background background;

    @Singleton
    @Component(modules = MockModule.class)
    public interface MockComponent extends BaseComponent {
        void inject(MainActivityTest mainActivityTest);
    }

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        MockApplication app
                = (MockApplication) instrumentation.getTargetContext().getApplicationContext();
        MockComponent component = (MockComponent) app.getComponent();
        component.inject(this);
    }
}
