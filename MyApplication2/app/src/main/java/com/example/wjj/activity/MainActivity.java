package com.example.wjj.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.wjj.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private View mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG","id:"+android.os.Process.myPid());
        findViewById(R.id.firstButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        findViewById(R.id.showButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG","1111:"+baseActivity);
            }
        });

        initView();
        initListener();
    }

    //控件初始化
    private void initView()
    {
        mView=(View)findViewById(R.id.view);
    }

    private void initListener()
    {

    }

    @Override
    public void processMessage(Message message) {

    }

    private long currentTime;

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - currentTime > 3000) {
            currentTime = System.currentTimeMillis();
            Toast.makeText(MainActivity.this, "再按一次退出应用", Toast.LENGTH_SHORT).show();
        } else {
            android.os.Process.killProcess(android.os.Process.myPid());
            //System.exit(0);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","MainActivityonDestroy:"+baseActivity);
        baseActivity=null;

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","MainActivityonStop:"+baseActivity);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","MainActivityonResume:"+baseActivity);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","MainActivityonPause:"+baseActivity);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("TAG","MainActivityonStart:"+baseActivity);
    }


}
