package com.minutetale;

import android.app.Application;

import com.minutetale.papyha.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by jBhattacharya on 03/02/17.
 */

public class MinuteTaleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/AvenirNext-Medium.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
