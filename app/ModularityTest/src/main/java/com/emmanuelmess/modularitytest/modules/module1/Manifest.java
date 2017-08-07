package com.emmanuelmess.modularitytest.modules.module1;

import android.content.Context;

import com.emmanuelmess.modularitytest.Module;

/**
 * @author Emmanuel
 *         on 7/6/2017, at 18:48.
 */

public class Manifest extends com.emmanuelmess.modularitytest.modules.Manifest implements Module {

    @Override
    public String getName() {
        return "Module1";
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
    public String onLoad(Context context) {
        super.onLoad(context);
        return "dsfsdafssfsdfs";
    }

}
