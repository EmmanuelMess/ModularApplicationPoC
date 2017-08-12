package com.emmanuelmess.modularitytest.modules;

import android.content.Context;
import android.widget.TextView;

import com.emmanuelmess.modularitytest.Module;
import com.emmanuelmess.modularitytest.R;
import com.emmanuelmess.modularitytest.activity.MainActivity;

/**
 * @author Emmanuel
 *         on 7/6/2017, at 18:48.
 */

public class Manifest implements Module {

    private Context context;
    private TextView log;

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
        log = ((TextView) MainActivity.mainActivity.get().findViewById(R.id.textView2));

        addTextToLog(getName() + ":onLoad()");
        return null;
    }

    @Override
    public void onShow() {
        addTextToLog(getName() + ":onShow()");
    }

    @Override
    public void onHide() {
        addTextToLog(getName() + ":onHide()");
    }

    @Override
    public void onUnload() {
        addTextToLog(getName() + ":onUnload()");
    }

    private void addTextToLog(String l){
        log.append("\n" + l);
    }
}
