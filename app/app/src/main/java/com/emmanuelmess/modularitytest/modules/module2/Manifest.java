package com.emmanuelmess.modularitytest.modules.module2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.emmanuelmess.modularitytest.Module;

/**
 * @author Emmanuel
 *         on 7/6/2017, at 18:48.
 */

public class Manifest extends com.emmanuelmess.modularitytest.modules.Manifest implements Module {

    public Manifest() {

    }

    @Override
    public String getName() {
        return "Module 2";
    }

    @Override
    public String getAuthor() {
        return "Emmanuel";
    }

    @Override
    public String getDescription() {
        return "Secondary functionality";
    }

    @Override
    public View onLoad(Context context) {
        TextView test = new TextView(context);
        test.setText("000000000001");
        return test;
    }

    @Override
    public void onShow() {

    }

    @Override
    public void onHide() {

    }

    @Override
    public void onUnload() {

    }
}
