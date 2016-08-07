package com.example.changho.webtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataView extends AppCompatActivity {
    TextView name;
    TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_view);

        Intent intent = getIntent();
        String receivedName = intent.getStringExtra("name");
        String receivedPassword = intent.getStringExtra("password");

        name = (TextView)findViewById(R.id.name);
        password = (TextView)findViewById(R.id.password);

        name.setText(receivedName );
        password.setText(receivedPassword);

    }
}
