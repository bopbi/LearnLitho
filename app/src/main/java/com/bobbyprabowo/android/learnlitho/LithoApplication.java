package com.bobbyprabowo.android.learnlitho;

import android.app.Application;

import com.facebook.soloader.SoLoader;

/**
 * Created by bobbyadiprabowo on 11/05/17.
 */

public class LithoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, false);
    }
}
