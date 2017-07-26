package com.qishui.zhou.gank.activity;

import android.content.Intent;
import android.os.SystemClock;
import android.widget.ImageView;

import com.qishui.zhou.gank.R;
import com.qishui.zhou.gank.utils.StatusBarUtils;
import com.qishui.zhou.gank.utils.V;

public class SplashActivity extends BaseActivity {


    @Override
    public void initView() {

        setContentView(R.layout.activity_splash);
        StatusBarUtils.setFullScreen(this);

        ImageView splash_iv = V.find(this, R.id.splash_iv);

        new Thread(){
            @Override
            public void run() {

                SystemClock.sleep(2000);

                startActivity(new Intent(SplashActivity.this,LoginActivity.class));
                finish();
            }
        }.start();

    }
}
