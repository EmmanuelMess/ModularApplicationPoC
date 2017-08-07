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
    private ArrayList<String> moduleStrings = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        modules = Loader.loadAllModules(this);

        moduleStrings = new ArrayList<>();

        for (Module m : modules) {
            String s = m.onLoad(getApplicationContext());
            moduleStrings.add(s);
        }
    }

    @Override
    public void onPause() {
        super.onPause();

        for (Module m : modules) {
            m.onUnload();
        }
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<String> getModuleStrings() {
        return moduleStrings;
    }

}
