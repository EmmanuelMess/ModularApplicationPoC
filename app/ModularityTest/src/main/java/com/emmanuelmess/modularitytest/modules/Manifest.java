package com.emmanuelmess.modularitytest.modules;

import android.content.Context;
import android.widget.Toast;

import com.emmanuelmess.modularitytest.Module;

/**
 * @author Emmanuel
 *         on 7/6/2017, at 18:48.
 */

public class Manifest implements Module {

    private Context context;

    public Manifest() {

    }

    @Override
    public String getName() {
        throw new IllegalStateException("Stub");
    }

    @Override
    public String getAuthor() {
        throw new IllegalStateException("Stub");
    }

    @Override
    public String getDescription() {
        throw new IllegalStateException("Stub");
    }

    private Context getContext() {
        return context;
    }

    @Override
    public String onLoad(Context context) {
        this.context = context;
        Toast.makeText(context, getName() + ":onLoad()", Toast.LENGTH_SHORT).show();
        return null;
    }

    @Override
    public void onShow() {
        Toast.makeText(context, getName() + ":onShow()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onHide() {
        Toast.makeText(context, getName() + ":onHide()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUnload() {
        Toast.makeText(context, getName() + ":onUnload()", Toast.LENGTH_SHORT).show();
    }
}
