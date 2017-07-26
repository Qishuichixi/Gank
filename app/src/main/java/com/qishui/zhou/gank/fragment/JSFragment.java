package com.qishui.zhou.gank.fragment;

import android.view.View;
import android.widget.TextView;

import com.qishui.zhou.gank.view.LoadingPage;

/**
 * 作者：Created by zhou on 2017/7/25 21:10
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class JSFragment extends BaseFragment {
    @Override
    public View createSuccessView() {
        TextView tv=new TextView(getActivity());
        tv.setText("js");
        return tv;
    }

    @Override
    protected LoadingPage.LoadResult load() {
        return LoadingPage.LoadResult.success;
    }

    @Override
    protected void lazyLoad() {

    }
}
