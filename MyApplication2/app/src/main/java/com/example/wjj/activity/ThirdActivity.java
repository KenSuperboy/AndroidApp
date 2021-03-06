package com.example.wjj.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;

import com.example.wjj.base.BaseActivity;

import java.util.List;

/**
 * Created by wjj on 2016/10/25.
 */
public class ThirdActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdlayout);

        findViewById(R.id.thirdButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdActivity.this,FourActivity.class));
            }
        });

        findViewById(R.id.thirdDelete).setOnClickListener(new View.OnClickListener() {
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
        Log.d("TAG","onDestroy=======ThirdActivity");
    }
}
