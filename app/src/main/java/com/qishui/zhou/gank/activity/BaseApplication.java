package com.qishui.zhou.gank.activity;

import android.content.Context;
import android.os.Handler;

import com.zhy.http.okhttp.OkHttpUtils;

import org.litepal.LitePalApplication;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * 作者：Created by zhou on 2017/7/25 10:47
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class BaseApplication extends LitePalApplication {

    private static BaseApplication application;
    private static int mainTid;
    private static Handler handler;

    @Override
    // 在主线程运行的
    public void onCreate() {
        super.onCreate();
        application = this;
        mainTid = android.os.Process.myTid();
        handler = new Handler();

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                .build();

        OkHttpUtils.initClient(okHttpClient);

    }

    public static Context getApplication() {
        return application;
    }

    public static int getMainTid() {
        return mainTid;
    }

    public static Handler getHandler() {
        return handler;
    }

}
