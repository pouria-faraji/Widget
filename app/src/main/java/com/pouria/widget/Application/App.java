package com.pouria.widget.Application;

import android.app.Application;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Pouria on 2/23/2018.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
        Fabric.with(this, new Answers());
        Answers.getInstance().logCustom(new CustomEvent("Played Song"));
    }
}
