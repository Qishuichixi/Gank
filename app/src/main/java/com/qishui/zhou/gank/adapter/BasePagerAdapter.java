package com.qishui.zhou.gank.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：Created by zhou on 2017/7/25 12:04
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public abstract class BasePagerAdapter extends PagerAdapter {

    private List<View> mList = new ArrayList<View>();

    protected BasePagerAdapter() {
        this.mList = setViews();
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = mList.get(position);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View) object);
    }

    protected abstract List<View> setViews() ;
}
