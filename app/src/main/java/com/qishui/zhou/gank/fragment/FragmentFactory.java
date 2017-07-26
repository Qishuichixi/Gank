package com.qishui.zhou.gank.fragment;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：Created by zhou on 2017/6/7 21:21
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class FragmentFactory {

    public static Map<Integer, BaseFragment> map = new HashMap<Integer, BaseFragment>();

    public static BaseFragment getFragment(int position) {

        BaseFragment fragment = map.get(position);
        if (fragment == null) {

            switch (position) {
                case 0:
                    fragment = new DayFragment();
                    break;
                case 1:
                    fragment = new MZFragment();
                    break;
                case 2:
                    fragment = new AndroidFragment();
                    break;
                case 3:
                    fragment = new IOSFragment();
                    break;
                case 4:
                    fragment = new JSFragment();
                    break;

            }
            if (fragment != null) {
                map.put(position, fragment);
            }
        }

        return fragment;
    }



}
