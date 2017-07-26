package com.qishui.zhou.gank.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/**
 * 作者：Created by zhou on 2017/6/11 10:15
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class ViewUtils {
    public static void removeParent(View v){
        //  先找到爹 在通过爹去移除孩子
        ViewParent parent = v.getParent();
        //所有的控件 都有爹  爹一般情况下 就是ViewGoup
        if(parent instanceof ViewGroup){
            ViewGroup group=(ViewGroup) parent;
            group.removeView(v);
        }
    }
}

