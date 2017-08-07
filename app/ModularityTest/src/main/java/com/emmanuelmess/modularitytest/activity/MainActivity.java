package com.emmanuelmess.modularitytest.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.emmanuelmess.modularitytest.R;

public class MainActivity extends LoaderActivity {

    private TextView textView;

    private int shownModuleIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textView);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
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
