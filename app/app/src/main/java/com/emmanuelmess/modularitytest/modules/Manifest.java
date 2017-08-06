package com.emmanuelmess.modularitytest.modules;

import android.content.Context;
import android.view.View;

import com.emmanuelmess.modularitytest.Module;

/**
 * @author Emmanuel
 *         on 7/6/2017, at 18:48.
 */

public class Manifest implements Module {

    public Manifest() {

    }

    @Override
    public String getName() {
        return "Normal module";
    }

    @Override
    public String getAuthor() {
        return "Emmanuel";
    }

    @Override
    public String getDescription() {
        return "Basic functionality";
    }

    @Override
    public View onLoad(Context context) {
        throw new IllegalStateException("Stub");
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
