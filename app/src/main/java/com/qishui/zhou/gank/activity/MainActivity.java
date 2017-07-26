package com.qishui.zhou.gank.activity;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.qishui.zhou.gank.R;
import com.qishui.zhou.gank.fragment.FragmentFactory;
import com.qishui.zhou.gank.utils.Constant;
import com.qishui.zhou.gank.utils.StatusBarUtils;
import com.qishui.zhou.gank.utils.ToastUtil;
import com.qishui.zhou.gank.utils.V;
import com.qishui.zhou.gank.view.ViewPagerIndicator;

import static com.qishui.zhou.gank.R.id.left_iv_user_photo;

public class MainActivity extends BaseActivity {

    private DrawerLayout home_dl;
    private ViewPager home_vp;
    private ViewPagerIndicator home_indicator;

    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        StatusBarUtils.setColor(this,0x3F51B5,1);

        home_dl = V.find(this, R.id.home_dl);
        home_vp = V.find(this, R.id.home_vp);
        home_indicator = V.find(this, R.id.home_vpi);

        home_indicator.setTabItemTitles(Constant.getList());

        FragmentPagerAdapter mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return FragmentFactory.getFragment(position);
            }

            @Override
            public int getCount() {
                return Math.max(FragmentFactory.map.size(), Constant.getList().size());
            }
        };
        home_vp.setAdapter(mAdapter);

        home_indicator.setViewPager(home_vp, 0);


    }

    @Override
    public void initListener() {


        ImageView left_iv_user_photo = V.find(this, R.id.left_iv_user_photo);
        left_iv_user_photo.setOnClickListener(this);
        TextView left_tv_aboutme = V.find(this, R.id.left_tv_aboutme);
        left_tv_aboutme.setOnClickListener(this);
        TextView left_tv_day = V.find(this, R.id.left_tv_day);
        left_tv_day.setOnClickListener(this);
        TextView left_tv_android = V.find(this, R.id.left_tv_android);
        left_tv_android.setOnClickListener(this);
        TextView left_tv_ios = V.find(this, R.id.left_tv_ios);
        left_tv_ios.setOnClickListener(this);
        TextView left_tv_js = V.find(this, R.id.left_tv_js);
        left_tv_js.setOnClickListener(this);
        TextView left_tv_meizi = V.find(this, R.id.left_tv_meizi);
        left_tv_meizi.setOnClickListener(this);
        TextView left_tv_mrgx = V.find(this, R.id.left_tv_mrgx);
        left_tv_mrgx.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case left_iv_user_photo:
                break;
            case R.id.left_tv_mrgx:
                home_dl.closeDrawer(Gravity.START);
                home_indicator.setViewPager(home_vp, 0);
                break;
            case R.id.left_tv_meizi:
                home_dl.closeDrawer(Gravity.START);
                home_indicator.setViewPager(home_vp, 1);
                break;
            case R.id.left_tv_android:
                home_dl.closeDrawer(Gravity.START);
                home_indicator.setViewPager(home_vp, 2);
                break;
            case R.id.left_tv_ios:
                home_dl.closeDrawer(Gravity.START);
                home_indicator.setViewPager(home_vp, 3);
                break;
            case R.id.left_tv_js:
                home_dl.closeDrawer(Gravity.START);
                home_indicator.setViewPager(home_vp, 4);
                break;
            case R.id.left_tv_aboutme:
                break;
            case R.id.left_tv_day:
                break;
        }


    }


    /**
     * 点击返回键退出程序
     */
    private static Boolean isExit = false;

    @Override
    public void onBackPressed() {

        if (isExit == false) {
            isExit = true;
            ToastUtil.show(this, "再按一次退出程序");

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    isExit = false;
                }
            }, 3000);

        } else {
            //退出程序
            BaseActivity.killAll();
        }
    }
}
