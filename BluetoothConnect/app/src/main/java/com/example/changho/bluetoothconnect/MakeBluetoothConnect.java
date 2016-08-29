package com.example.changho.bluetoothconnect;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Toast;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Changho on 2016-08-23.
 */
public class MakeBluetoothConnect extends Thread{
    private String TAG = "Bluetooth Connect";
    private static BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    private static MakeBluetoothConnect makeBluetoothConnect;
    private static BluetoothSocket mSocket;
    private static InputStream mInputStream;
    private static OutputStream mOutputStream;
    private static boolean connected = false;
    //private static Context s_context;

    //message maker
    private void dMessage(String message){
        Log.d(TAG,message);
    }


    public static BluetoothAdapter getmBluetoothAdapter() {
        return mBluetoothAdapter;
    }

    public static void selectDevice(Context context){
        //s_context  = context;
        final Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();
        if(pairedDevices.size() > 0) {
            // 페어링 된 장치가 있는 경우.
            Log.i("pairing device exist","pairing device exist");

            if(context != null)
                Log.i("MainAcitivity value: ","not null");

            if(context == null)
                Log.i("MainAcitivity value: ","null");

            // adding items
            List<String> listItems = new ArrayList<String>();
            for(BluetoothDevice device: pairedDevices){
                listItems.add(device.getName());
            }
            listItems.add("cancel");

            AlertDialog.Builder builder = new AlertDialog.Builder(context);

            builder.setTitle("select device");

            final CharSequence[] items = listItems.toArray(new CharSequence[listItems.size()]);
            builder.setItems(items, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if(i == pairedDevices.size()){
                        Log.i("canceled","canceled");
                    }
                    else{
                        connectSelectedDevice(items[i].toString());
                    }
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }
        else {
            // 페어링 된 장치가 없는 경우.
            Toast.makeText(context, "paired device not exitsts", Toast.LENGTH_SHORT).show();
        }
    }
    //
    public static BluetoothDevice getDeviceFromBondedList(String name) {
        BluetoothDevice selectedDevice = null;
        Set<BluetoothDevice>  mDevices = mBluetoothAdapter.getBondedDevices();

        for(BluetoothDevice device : mDevices) {
            if(name.equals(device.getName())) {
                selectedDevice = device;
                break;
            }
        }
        return selectedDevice;
    }



    //

    public static void connectSelectedDevice(String selectedDeviceName) {
        Log.i("selectedDeviceName",selectedDeviceName);
        BluetoothDevice mRemoteDevice = getDeviceFromBondedList(selectedDeviceName);
        UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");

        try {
            // 소켓 생성
            mSocket = mRemoteDevice.createRfcommSocketToServiceRecord(uuid);
            // RFCOMM 채널을 통한 연결
            mSocket.connect();
            if(mSocket.isConnected()){
                Log.i("bluetooth socket","socket connected");
            }
            // 데이터 송수신을 위한 스트림 열기
            mOutputStream = mSocket.getOutputStream();
            mInputStream = mSocket.getInputStream();
            write();
            connected = true;
            // 객체 생성 문제없음???
            startThread();

        }catch(Exception e) {
            // 블루투스 연결 중 오류 발생
            Log.i("connect error :",e.getMessage());   // 어플 종료
        }
    }
    // start a thread
    public void startThread(){
        this.start();
    }
    // operation
    @Override
    public void run() {
        read();
    }

    // read method
    public static void read(){
//        int i = 0;
//        Byte[] buffer = new Byte[1024];
//        Byte readChar;
//        String msg;
        BufferedReader br = new BufferedReader(new InputStreamReader(mInputStream));
        StringBuffer sb  = new StringBuffer();
        String line;
        while(connected) {
            try {
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append('\r');
                }
                Log.d("readed Message",sb.toString());
            } catch (IOException e) {
                Log.e("read error",e.getMessage());
            }
        }

    }
    // wirte method
    public static void write(){
        OutputStreamWriter osw = new OutputStreamWriter(mOutputStream);
        String str = new String("Hello by anroid");
        try {
            osw.write(str, 0, str.length());
        }catch(IOException e ){
            Log.e("write error",e.getMessage());
        }
    }
}
