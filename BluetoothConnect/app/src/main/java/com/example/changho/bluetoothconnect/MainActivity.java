package com.example.changho.bluetoothconnect;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private String TAG = "Bluetooth Connect";
    private final int REQUEST_ENABLE_BT = 1;
    private EditText receivedData;
    private EditText sendData;
    private Button btn_bluetoothConnect;
    private BluetoothAdapter mBluetoothAdapter;

    //message maker
    private void dMessage(String message){
        Log.d(TAG,message);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendData = (EditText)findViewById(R.id.sendData);
        receivedData = (EditText)findViewById(R.id.receivedData);
        btn_bluetoothConnect = (Button)findViewById(R.id.button);
        mBluetoothAdapter = MakeBluetoothConnect.getmBluetoothAdapter();



        btn_bluetoothConnect.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(mBluetoothAdapter  == null) {
                    //장치가 블루투스를 지원하지 않는 경우.
                    Toast.makeText(getApplicationContext(),
                            "This device is not supply for blooth", Toast.LENGTH_LONG).show();
                }

                else {
                    // 장치가 블루투스를 지원하는 경우.
                    if(!mBluetoothAdapter.isEnabled()) {
                        // 블루투스를 지원하지만 비활성 상태인 경우
                        // 블루투스를 활성 상태로 바꾸기 위해 사용자 동의 요첨
                        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);

                        MakeBluetoothConnect.selectDevice(MainActivity.this);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"bluetooth is already activating",Toast.LENGTH_LONG).show();
                        MakeBluetoothConnect.selectDevice(MainActivity.this);
                    }
                }
            }
        });

    } //end of onCreate

    //

    ///
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case REQUEST_ENABLE_BT:
                if(resultCode == RESULT_OK) {
                    // 블루투스가 활성 상태로 변경됨
                    Toast.makeText(getApplicationContext(),"bluetooth is activating for choice result",Toast.LENGTH_LONG).show();
                }

                else if(resultCode == RESULT_CANCELED) {
                    // 블루투스가 비활성 상태임
                    Toast.makeText(getApplicationContext(),"bluetooth is not activated for choice result",Toast.LENGTH_LONG).show();
                }
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
