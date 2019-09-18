package org.huaiangg.wanandroid.frags.system;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import org.huaiangg.wanandroid.R;
import org.huaiangg.wanandroid.network.RetrofitUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 体系页面
 * A simple {@link Fragment} subclass.
 *
 * @author huaian
 */
public class SystemFragment extends Fragment {

    private static final String TAG = SystemFragment.class.getSimpleName();

    private static SystemFragment fragment;
    private Spinner parentSpinner;
    private Spinner childSpinner;
    private RecyclerView rvSystemArticle;

    private Map<String, Integer> parentChapterInfo = new HashMap<>();
    private List<Map<String, Integer>> parentChapterInfoList = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_system, container, false);
        initView(view);
        return view;
    }

    public static SystemFragment getInstance() {
        if (fragment == null) {
            fragment = new SystemFragment();
        }
        return fragment;
    }

    private void initView(View view) {
        parentSpinner = view.findViewById(R.id.parent_spinner);
        childSpinner = view.findViewById(R.id.child_spinner);
        rvSystemArticle = view.findViewById(R.id.rv_system_article);

        // 获取文章列表导航数据
        getSystemArticleNavigationSpinner();
    }

    /**
     * 获取页面导航信息
     */
    private void getSystemArticleNavigationSpinner() {
        RetrofitUtil.getInstance().getApiService()
                .getSystemArticleNavigationData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SystemArticleBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SystemArticleBean bean) {
                        Log.d(TAG, "onNext: " + bean.getData().toString());
                        int len = bean.getData().getSize();
                        for (int i = 0; i < len; i++) {

                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: ", e);
                    }

                    @Override
                    public void onComplete() {
                        Log.e(TAG, "onComplete: 完成体系文章导航请求！" );
                    }
                });
    }
}
