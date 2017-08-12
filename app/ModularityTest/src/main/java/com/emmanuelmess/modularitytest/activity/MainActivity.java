package com.emmanuelmess.modularitytest.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.emmanuelmess.modularitytest.R;

import java.lang.ref.WeakReference;

public class MainActivity extends LoaderActivity {

    public static WeakReference<MainActivity> mainActivity;

    private TextView textView;

    private int shownModuleIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        mainActivity = new WeakReference<>(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textView);

        super.onCreate(savedInstanceState);//this here is a brutal hack, but this isn't going to be shipped
    }

    public void onClickNone(View view){
        if(shownModuleIndex != -1) {
            textView.setText("Hello World!");
            getModules().get(shownModuleIndex).onHide();
            shownModuleIndex = -1;
        }
    }

    public void onClickModule1(View view){
        textView.setText(getModuleStrings().get(0));

        getModules().get(0).onShow();
        shownModuleIndex = 0;
    }

    public void onClickModule2(View view){
        textView.setText(getModuleStrings().get(1));

        getModules().get(1).onShow();
        shownModuleIndex = 1;
    }
}
