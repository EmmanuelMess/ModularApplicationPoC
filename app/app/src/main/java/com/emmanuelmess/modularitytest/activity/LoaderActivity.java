package com.emmanuelmess.modularitytest.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.emmanuelmess.modularitytest.Loader;
import com.emmanuelmess.modularitytest.Module;

import java.util.ArrayList;

/**
 * @author Emmanuel
 *         on 7/6/2017, at 19:25.
 */

public class LoaderActivity extends AppCompatActivity {

    private ArrayList<Module> modules = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        modules = Loader.loadAllModules(this);
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

}
