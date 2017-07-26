package com.qishui.zhou.gank.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.qishui.zhou.gank.R;
import com.qishui.zhou.gank.adapter.BasePagerAdapter;
import com.qishui.zhou.gank.utils.StatusBarUtils;
import com.qishui.zhou.gank.utils.V;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends BaseActivity {

    List<View> mData = new ArrayList<>();
    int[]guide_view={R.drawable.guide1,R.drawable.guide2};

    @Override
    public void initData() {


        for (int i = 0; i < guide_view.length; i++) {
            ImageView iv = new ImageView(this);
            iv.setImageResource(guide_view[i]);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            mData.add(iv);
        }
    }

    @Override
    public void initView() {
        setContentView(R.layout.activity_login);
        StatusBarUtils.setFullScreen(this);

        ViewPager login_vp = V.find(this, R.id.login_vp);
        login_vp.setAdapter(new BasePagerAdapter() {
            @Override
            protected List<View> setViews() {
                return mData;
            }
        });

    }

    @Override
    public void initListener() {
        Button login_a = V.find(this, R.id.login_a);
        login_a.setOnClickListener(this);
        Button login_q = V.find(this, R.id.login_q);
        login_q.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.login_a:
                startActivity(new Intent(context,MainActivity.class));
                finish();
                break;
            case R.id.login_q:
                //弹出对话框，选择登录方式
                break;
        }
    }
}
