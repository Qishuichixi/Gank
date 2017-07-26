package com.qishui.zhou.gank.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.LinkedList;
import java.util.List;

/**
 * 作者：Created by zhou on 2017/7/25 10:47
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    protected static LinkedList<BaseActivity>mList=new LinkedList<>();

    public Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context=this;
        mList.add(this);

        initData();
        initView();
        initListener();

    }


    public void initData() {
    }

    public void initView() {

    }

    public void initListener() {
        //在这里设置初始化
    }

    @Override
    public void onClick(View v) {
        //点击响应
    }

    public static  void killAll() {
        // 复制了一份mActivities 集合
        List<BaseActivity> copy;
        synchronized (mList) {
            copy = new LinkedList<BaseActivity>(mList);
        }
        for (BaseActivity activity : copy) {
            activity.finish();
        }
        // 杀死当前的进程
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
