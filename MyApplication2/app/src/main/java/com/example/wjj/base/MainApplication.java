package com.example.wjj.base;

import android.app.Application;
import android.util.Log;

/**
 * Created by wjj on 2016/10/25.
 */
public class MainApplication extends Application{

    public static MainApplication mainApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("TAG","id:"+android.os.Process.myPid());

    }

    public synchronized static MainApplication getInstance()
    {
        if(mainApplication==null)
        {
            mainApplication=new MainApplication();
        }
        return mainApplication;
    }
}
