package com.example.changho.changholock;

/**
 * Created by changho on 2016-03-27.
 */
import android.app.ActivityManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainService extends Service {
    Thread mThread;
    Thread network_thread;
    ArrayList<String> list;
    ArrayList<String> dList;
    static Boolean check = false;

    //네트워크 부분 변수
//    private Socket socket;
//    BufferedReader socket_in;
//    PrintWriter socket_out;
//    String ip = "192.168.0.75";
//    private int port = 6000;
//    String data=null;
    //변수 끝

    public MainService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate(){
        Toast.makeText(this, "Service start", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
    //me: onStratCommand에 주 수행 작업을 코딩하는 듯
    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        //intent값 받기
        super.onStartCommand(intent, flags, startId);
        //list = intent.getStringArrayListExtra("list");

        dList = intent.getStringArrayListExtra("dList");
        if(dList != null)
        Log.i("dList 값" , dList.get(0));
        //디바이스매니저 잠금 테스팅

//        if(list != null) {
//            list.add("com.google.android.apps.adm");
//            for (int i = 0; i < list.size(); i++) {
//                String target = list.get(i);
//                Log.e("확인", target);
//            }

        if(SharedData.targetedList != null) {
            SharedData.targetedList.add("com.google.android.apps.adm");
            for (int i = 0; i < SharedData.targetedList.size(); i++) {
                String target = SharedData.targetedList.get(i);
                Log.e("확인", target);
            }


            //confirm process
            mThread = new Thread(worker);
            mThread.setDaemon(true);
            mThread.start();
        }
        // network 메세지 수신 감지 시작
        //network_thread = new Thread(network_worker);
        //network_thread.setDaemon(true);
        //network_thread.start();

        return START_REDELIVER_INTENT;
    }
    Runnable worker = new Runnable()
    {
        public void run()
        {
            runLog();
        }
    };




    //

    ///////runLog 부분
    private void runLog() {
        // TODO Auto-generated method stub
        // target app name
        //testing
                boolean exitFlag = true;
                List<ActivityManager.RunningTaskInfo> info;
                //잠금 화면 intent
                Intent intent = new Intent(this, LockScreen.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                //Intent intent = new Intent(getApplicationContext(), LockScreen.class);
                while (exitFlag) {
                    ActivityManager activityManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
                    info = activityManager.getRunningTasks(1);

                    // 현재 액티비티
                    String str = info.get(0).topActivity.getPackageName();



                    //testing --- class name???
                    String deviceAdmin = info.get(0).topActivity.getClassName();
                    //Log.e("현재 실행중인 액티비티 : ",deviceAdmin);
                    for (int i = 0; i < SharedData.targetedList.size(); i++) {
                        String target = SharedData.targetedList.get(i);
                        if (str.equals(target) || deviceAdmin.equals("com.android.settings.DeviceAdminAdd")) {
                            //testing
                            // 잠기기 전 현재 액티비티 공유데이터에 저장
                            SharedData.currentActivity = str;
                            startActivity(intent);
                        }
                    }
                } //end of while
    }

}

