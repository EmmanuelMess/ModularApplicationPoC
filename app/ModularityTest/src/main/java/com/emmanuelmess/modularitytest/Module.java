package com.emmanuelmess.modularitytest;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;

/**
 * @author Emmanuel
 *         on 12/5/2017, at 21:35.
 */

public interface Module {

    String getName();

    String getAuthor();

    String getDescription();

    String onLoad(Context context);

    void onShow();

    void onHide();

    void onUnload();
}
