package com.example.changho.changholock;

/**
 * Created by Changho on 2016-05-23.
 */
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gcm.GCMBaseIntentService;
public class GCMIntentService extends GCMBaseIntentService {

    public final static String SENDER_ID = "886264074426";

    public GCMIntentService() {
        super(SENDER_ID);
    }

    @Override
    protected void onError(Context context, String errorId) {

    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onMessage(Context context, Intent intent) {
        String action = intent.getAction();


        if ("com.google.android.c2dm.intent.RECEIVE".equals(action)) {



            String target = intent.getStringExtra("target");
            String time = intent.getStringExtra("time");



            //
            Intent notifyIntent = new Intent(this, NotificationActivity.class);
            notifyIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            notifyIntent.putExtra("targetName", target);
            notifyIntent.putExtra("LimitedTime", time);
            NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);


            Notification.Builder mBuilder = new Notification.Builder(this);
            mBuilder.setSmallIcon(R.drawable.ic_launcher);
            mBuilder.setTicker("Notification.Builder");
            mBuilder.setWhen(System.currentTimeMillis());
            mBuilder.setNumber(10);
            mBuilder.setContentTitle("잠금 리스트 도착!");
            mBuilder.setContentText(target);
            mBuilder.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE);
            mBuilder.setContentIntent(pendingIntent);
            mBuilder.setAutoCancel(true);

            //mBuilder.setPriority(NotificationCompat.PRIORITY_MAX);

            nm.notify(111, mBuilder.build());


        }

    }

    @Override
    protected void onRegistered(Context context, String registrationId) {
        Log.e("키를 등록합니다.", registrationId);
    }


    @Override
    protected void onUnregistered(Context context, String registrationId) {
        Log.e("키를 제거합니다.", "제거되었습니다.");
    }
}



