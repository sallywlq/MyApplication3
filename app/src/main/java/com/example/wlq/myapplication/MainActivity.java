package com.example.wlq.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private Button lifengbt;
    private Button wlqbt;
    private Button activitybt;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lifengbt = (Button) findViewById(R.id.button1);
        wlqbt = (Button) findViewById(R.id.button2);
        activitybt = (Button)findViewById(R.id.button3_activity);
        lifengbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.print("你点击了李峰按钮！");
                Toast.makeText(MainActivity.this, lifengbt.getText().toString(), 1).show();
            }
        });
        wlqbt.setOnClickListener(new MyOnClickListener() {
            @Override
            public void onClick(View v) {
                super.onClick(v);
                Toast.makeText(MainActivity.this, "你点击了" + wlqbt.getText().toString(), 1).show();
            }
        });

        activitybt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecendActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });


    }
}
class  MyOnClickListener implements View.OnClickListener{


    @Override
    public void onClick(View v) {
        Log.i("tag", "父类的方法！");
    }
}