package com.qishui.zhou.gank.utils;

import android.app.Activity;
import android.view.View;

/**
 * 作者：Created by zhou on 2017/7/25 11:21
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class V {

    public static <T> T find(Activity activity, int id) {

        return (T) activity.findViewById(id);
    }

    public static <T> T find(View view, int id) {

        return (T) view.findViewById(id);
    }

}
