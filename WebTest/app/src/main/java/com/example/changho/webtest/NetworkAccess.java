package com.example.changho.webtest;
////////////////////////////////////////////////////
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkAccess extends AppCompatActivity implements View.OnClickListener{
    TextView testView;
    Button btn_test;
    //@SuppressLint({ "NewApi", "NewApi", "NewApi" })

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_access);

        testView = (TextView) findViewById(R.id.testView);
        btn_test = (Button) findViewById(R.id.btn_test);

        Log.e("button clicked","button clicked");

//        try {
//            Class.forName("android.os.AsyncTask");
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        //따로 클래스를 구현하지 않고 웹을 이용하는 방법
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);

        btn_test.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        Log.i("button clicked","button clicked");
        AsyncTaskTest async = new AsyncTaskTest();
        async.execute("test");
    }

    //AsyncTask는 inner class로
    private class AsyncTaskTest extends AsyncTask<String , String , String>{
        int HttpResult;
        Intent intent = new Intent(NetworkAccess.this, DataView.class);
        @Override
        protected void onPreExecute() {
            //super.onPreExecute();
            Log.i("preExecute 호출","call");
        }
        @Override
        protected String doInBackground(String... strings) {
            Log.i("doInBackground call","call");
            String url = "http://192.168.0.75:7070/Testing/receivedData.jsp";
            BufferedReader br;
            try {
                URL object = new URL(url);
                HttpURLConnection con = (HttpURLConnection) object.openConnection();

                con.setDoOutput(true);
                con.setDoInput(true);
                con.setRequestProperty("Content-Type", "application/json");
                con.setRequestProperty("Accept", "application/json");
                con.setRequestMethod("POST");

                JSONObject parent = new JSONObject();
                parent.put("name", "Amanda8");
                //
                parent.put("id", "2238");
                parent.put("password", "1234");

                OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
                wr.write(parent.toString());
                Log.i("json: ",parent.toString());
                wr.flush();
                HttpResult = con.getResponseCode();


                if (HttpResult == HttpURLConnection.HTTP_OK) {
                    br = new BufferedReader(
                            new InputStreamReader(con.getInputStream(), "utf-8"));
                    String line = null;
                    String str = "";
                    while ((line = br.readLine()) != null) {
                        str += (line + "\n");
                    }
                    br.close();
                    Log.i("check", "" + str);
                    //

                    //
                    return str;
                } else {
                    //System.out.println(con.getResponseMessage());
                    Log.i("HTTP fail", "" + con.getResponseMessage());
                    return null;
                }
            }catch(Exception e){
                e.printStackTrace();
                Log.i("e.getMessage",e.getMessage());
                Log.i("e.toString",e.toString());
                return null;}
        }
        @Override
        protected void onPostExecute(String result) {
            //super.onPostExecute(result);
            Log.i("postExecute call","call");
            Log.i("result: ",result);



            //String myJSONString = "{'test': '100.00'}";
            //JSONObject jobj = new Gson().fromJson(myJSONString, JSONObject.class);
            try {

                JSONObject obj = new JSONObject(result);
                String name = (String) obj.get("name");
                String password = (String) obj.get("password");


                intent.putExtra("name", name);
                intent.putExtra("password", password);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);


            }catch (Exception e){}
        }


    } //end of test

}
