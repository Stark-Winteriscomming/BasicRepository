package com.example.changho.changholock;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gcm.GCMRegistrar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    //testing variables
    ArrayList<String> mPackageFilter;
    public static boolean mStop;
    public static boolean mPassApp=false;
   public Button btn_show_app;
    //cgm variables
    public final static String SENDER_ID = "886264074426";
    // to now
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //gcm 설정
        Context context = getApplicationContext();

        // 디바이스 체크
        GCMRegistrar.checkDevice(context);

        // AndroidManifest.xml 체크
        GCMRegistrar.checkManifest(context);

        // Registration ID 발급 요청
        GCMRegistrar.register(context, SENDER_ID);

        //


        //디바이스 매니저 테스트
        Button b;
        b = (Button) findViewById(R.id.btn_DM);
        //Intent for starting service
        final Intent DMIntent = new Intent(this, Controller.class);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "터치시 뜨는말", 0).show();
                //Start Service
                startActivity(DMIntent);
            }

        });
        //디바이스 매니저 테스트 end
        // 앱보기 버튼
        btn_show_app = (Button) findViewById(R.id.btn_TargetedAppShow);
        final Intent showAppIntent = new Intent(MainActivity.this, TargetedApp.class);

        btn_show_app.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "터치시 뜨는말", 0).show();
                startActivity(showAppIntent);
            }

        });


    //
    }// end of onCreate
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //
    public void registerGcm() {
        GCMRegistrar.checkDevice(this);
        GCMRegistrar.checkManifest(this);

        String regId = GCMRegistrar.getRegistrationId(this);

        if (regId.equals("")) {
            GCMRegistrar.register(this, "Sender ID");
            regId = GCMRegistrar.getRegistrationId(this);
            System.out.println("ID : "+regId);
        } else {
            Log.e("id", regId);
        }

    }
    //

    /****************
     * test for reading a log
     ******************/
    //me : private to public


}
