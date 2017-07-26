package com.qishui.zhou.gank.fragment;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qishui.zhou.gank.R;
import com.qishui.zhou.gank.adapter.BaseRecyclerAdapter;
import com.qishui.zhou.gank.adapter.BaseViewHolder;
import com.qishui.zhou.gank.bean.MZBean;
import com.qishui.zhou.gank.utils.Constant;
import com.qishui.zhou.gank.utils.UiUtils;
import com.qishui.zhou.gank.utils.V;
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

public class MZFragment extends BaseFragment {

    BaseRecyclerAdapter adapter;
    List<MZBean.ResultsBean> mList = new ArrayList<MZBean.ResultsBean>();
    int page = 1;
    boolean flag = false;

    @Override
    public View createSuccessView() {
        //如果有数据的话返回显示的页面
        View view = View.inflate(getActivity(), R.layout.mzfragment, null);
        FloatingActionButton fab = V.find(view, R.id.fab);


        //处理recycler事件
        final XRecyclerView mRecyclerView = (XRecyclerView) view.findViewById(R.id.xrv_mz);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        mRecyclerView.setAdapter(adapter = new BaseRecyclerAdapter<MZBean.ResultsBean>(getActivity(), mList, R.layout.mzfragmentitem) {
            @Override
            public void convert(BaseViewHolder holder, MZBean.ResultsBean item) {

                ImageView iv = holder.getView(R.id.mz_iv);
                Glide.with(getActivity()).load(item.getUrl()).into(iv);
                holder.setText(R.id.mz_author, "贡献者："+item.getWho());

            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!flag) {
                    flag=true;
                    mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
                } else {
                    flag=false;
                    mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
                }

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

                        getMZ(++page);
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
        Log.e("MZ", "load");

        return checkData(mList);
    }

    @Override
    protected void lazyLoad() {

        Log.e("MZ", "lazyLoad");
        getMZ(page);
    }


    public void getMZ(int page) {

        String url = Constant.MZ + page;

        OkHttpUtils.get().url(url).build().execute(new ListDayCallback() {

            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onResponse(MZBean response, int id) {


                mList.addAll(response.getResults());
                if(adapter!=null)
                adapter.notifyDataSetChanged();


            }
        });
    }


    public abstract class ListDayCallback extends Callback<MZBean> {
        @Override
        public MZBean parseNetworkResponse(Response response, int id) throws IOException {
            return new Gson().fromJson(response.body().string(), MZBean.class);
        }


    }
}
