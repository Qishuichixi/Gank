package com.qishui.zhou.gank.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * 作者：Created by zhou on 2017/7/25 18:10
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class ToastUtil {

    private static Toast mToast;

    public static void show(Context context, String msg) {

        if (mToast == null)
            mToast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        else {
            mToast.setText(msg);
        }
        mToast.show();
    }
}
