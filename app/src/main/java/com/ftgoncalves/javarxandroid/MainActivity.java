package com.ftgoncalves.javarxandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.ftgoncalves.Background;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Background background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.back);
        if (layout != null) {
            layout.setBackgroundResource(background.getColor());
        }
    }
}
