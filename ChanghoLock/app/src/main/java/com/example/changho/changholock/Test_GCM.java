package com.example.changho.changholock;


/**
 * Created by changho on 2016-04-12.
 */


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gcm.GCMRegistrar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class Test_GCM extends AppCompatActivity {
    public final static String SENDER_ID = "886264074426";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_gcm);
        Context context = getApplicationContext();

        // 디바이스 체크
        GCMRegistrar.checkDevice(context);

        // AndroidManifest.xml 체크
        GCMRegistrar.checkManifest(context);

        // Registration ID 발급 요청
        GCMRegistrar.register(context, SENDER_ID);

    }

}

