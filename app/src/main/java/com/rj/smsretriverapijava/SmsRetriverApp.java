package com.rj.smsretriverapijava;

import android.app.Application;

public class SmsRetriverApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppSignatureHelper appSignature = new AppSignatureHelper(this);
        appSignature.getAppSignatures();
    }
}
