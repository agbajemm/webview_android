package com.greenrepublic.app;

import android.app.Application;
import com.onesignal.OneSignal;
public class ApplicationClass extends Application {
    private static final String ONESIGNAL_APP_ID = "4444444444444444444444444";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId("44444444444444444444");
    }
}
