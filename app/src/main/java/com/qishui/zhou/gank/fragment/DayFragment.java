package com.qishui.zhou.gank.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qishui.zhou.gank.R;
import com.qishui.zhou.gank.adapter.BaseRecyclerAdapter;
import com.qishui.zhou.gank.adapter.BaseViewHolder;
import com.qishui.zhou.gank.bean.DayBean;
import com.qishui.zhou.gank.utils.Constant;
import com.qishui.zhou.gank.utils.UiUtils;
import com.qishui.zhou.gank.view.LoadingPage;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

/**
 * 作者：Created by zhou on 2017/7/25 21:10
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class DayFragment extends BaseFragment {
    BaseRecyclerAdapter adapter;
    List<DayBean> mList = new ArrayList<DayBean>();

    @Override
    public View createSuccessView() {
        //如果有数据的话返回显示的页面
        View view = View.inflate(getActivity(), R.layout.updateday, null);
        //处理recycler事件
        final XRecyclerView mRecyclerView = (XRecyclerView) view.findViewById(R.id.xrv_updateday);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));

        mRecyclerView.setAdapter(adapter = new BaseRecyclerAdapter<DayBean>(getActivity(), mList, R.layout.updatedayitem) {
            @Override
            public void convert(BaseViewHolder holder, final DayBean item) {


                holder.setOnIntemClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                    }
                });

            }

        });
        //设置上拉刷新、下拉加载
        mRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                UiUtils.postDelayed(new Runnable() {
                    public void run() {
                        //添加更新数据,保存数据库
                        //刷新数据
                        adapter.notifyDataSetChanged();
                        mRecyclerView.refreshComplete();
                    }

                }, 1000);

            }

            @Override
            public void onLoadMore() {
                // load more data here
                UiUtils.postDelayed(new Runnable() {
                    public void run() {

                        adapter.notifyDataSetChanged();
                        mRecyclerView.loadMoreComplete();
                        // mRecyclerView.setNoMore(true);

                    }

                }, 1000);
            }
        });

        return view;
    }

    @Override
    protected LoadingPage.LoadResult load() {


        return LoadingPage.LoadResult.success;
    }

    @Override
    protected void lazyLoad() {

        getDay("07","21");
    }


    public void getDay(String month, String day) {

        String url = Constant.DAY + month + "/" + day;
        OkHttpUtils.get().url(url).build().execute(new ListDayCallback() {

            @Override
            public void onError(Call call, Exception e, int id) {

                Log.e("Tag",e.toString());
            }

            @Override
            public void onResponse(DayBean response, int id) {

                Log.e("Tag","onResponse:"+response.getCategory()+"\n\n"+response.getResults()+"::"+response.getResults().getAndroid()+"\n\n"+response.getResults().get前端()+"::"+response.getResults().getIOS()+"\n\n"+response.getResults().get福利());

            }
        });
    }


    public abstract class ListDayCallback extends Callback<DayBean> {
        @Override
        public DayBean parseNetworkResponse(Response response, int id) throws IOException {
            return new Gson().fromJson(response.body().string(), DayBean.class);
        }


    }


}
