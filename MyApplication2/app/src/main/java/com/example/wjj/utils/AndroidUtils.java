package com.example.wjj.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;

import java.util.List;

/**
 * Created by wjj on 2016/10/25.
 */
public class AndroidUtils {

    public static String getTopActivity(Activity context) {
        Log.d("TAG","context:"+context.getLocalClassName());
        ActivityManager manager = (ActivityManager) context.getSystemService(context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> runningTaskInfos = manager.getRunningTasks(1);
        if (runningTaskInfos != null) {
            return (runningTaskInfos.get(0).topActivity.getClassName()).toString();
        }else{
            return null;
        }
    }

    public static void getTopActivity_New(Context context)
    {
        String packageName;
        ActivityManager mActivityManager = (ActivityManager)context.getSystemService(context.ACTIVITY_SERVICE) ;
        if (Build.VERSION.SDK_INT > 21) {
            List<ActivityManager.AppTask> tasks = mActivityManager.getAppTasks();
            if (null != tasks && tasks.size() > 0) {
                for (ActivityManager.AppTask task:tasks){
                    packageName = task.getTaskInfo().baseIntent.getComponent().getClassName();
                    Log.d("TAG","包名11111："+packageName);
                }
            }
        }else{
            List<ActivityManager.RunningTaskInfo> infos = mActivityManager.getRunningTasks(1);
            packageName = infos.get(0).topActivity.getClassName();
            Log.d("TAG","包名22222："+packageName);
        }
    }
}
