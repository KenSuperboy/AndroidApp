package com.example.wjj.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;

import com.example.wjj.base.BaseActivity;

import java.util.List;

/**
 * Created by wjj on 2016/10/25.
 */
public class SecondActivity extends BaseActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);

        findViewById(R.id.secondButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
            }
        });

        findViewById(R.id.secondDelete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG","id:"+android.os.Process.myPid());
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }


    @Override
    public void processMessage(Message message) {

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","SecondActivity===onDestroy:"+baseActivity);
        baseActivity=null;

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","SecondActivity===onStop:"+baseActivity);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","SecondActivity===onResume:"+baseActivity);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","SecondActivity===onPause:"+baseActivity);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","SecondActivity=====onStart:"+baseActivity);
    }
}
