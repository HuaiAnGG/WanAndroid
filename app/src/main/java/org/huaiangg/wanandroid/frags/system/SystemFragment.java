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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import org.huaiangg.wanandroid.R;
import org.huaiangg.wanandroid.network.RetrofitUtil;
import org.huaiangg.wanandroid.utils.ToastUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    private ArrayAdapter<String> parentAdapter;
    private ArrayAdapter<String> childAdapter;
//    private ArrayList<String> spinnerParentList = new ArrayList<String>();
//    private ArrayList<String> spinnerChildList = new ArrayList<String>();

    private Map<String, Integer> spinnerParentMap = new HashMap<>();
    private Map<String, Integer> spinnerChildMap = new HashMap<>();

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

        // 监听事件绑定
        parentSpinner.setOnItemSelectedListener(parentSpinnerItemSelectedListener);
        childSpinner.setOnItemSelectedListener(childSpinnerItemSelectedListener);
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
                        Log.e(TAG, "onComplete: 发起体系文章导航请求！" );
                    }

                    @Override
                    public void onNext(SystemArticleBean bean) {
                        Log.d(TAG, "onNext: " + bean.getData().toString());
                        int len = bean.getData().size();
                        for (int i = 0; i < len; i++) {
                            String parentName = bean.getData().get(i).getName();
                            int chapterId = bean.getData().get(i).getParentChapterId();
                            Log.d(TAG, "onNext: " + parentName);
//                            spinnerParentList.add(parentName);
                            spinnerParentMap.put(parentName, chapterId);
                        }
                        for (int i = 0; i < bean.getData().get(0).getChildren().size(); i++) {
                            String childName = bean.getData().get(i).getChildren().get(0).getName();
                            int id = bean.getData().get(i).getChildren().get(0).getId();
                            Log.d(TAG, "onNext: " + childName);
//                            spinnerChildList.add(childName);
                            spinnerChildMap.put(childName, id);
                        }

                        // 一级目录
                        parentAdapter = new ArrayAdapter<String>(
                                Objects.requireNonNull(getContext()),
                                android.R.layout.simple_spinner_item,
                                new ArrayList<String>(spinnerParentMap.keySet())
                        );

                        // 二级目录
                        childAdapter = new ArrayAdapter<String>(
                                Objects.requireNonNull(getContext()),
                                android.R.layout.simple_spinner_item,
                                new ArrayList<>(spinnerChildMap.keySet())
                        );
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: ", e);
                    }

                    @Override
                    public void onComplete() {
                        Log.e(TAG, "onComplete: 完成体系文章导航请求！" );
                        parentSpinner.setAdapter(parentAdapter);
                        childSpinner.setAdapter(childAdapter);
                    }
                });
    }

    /**
     * 一级目录 spinner 事件选中监听
     */
    private Spinner.OnItemSelectedListener parentSpinnerItemSelectedListener
            = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            ToastUtil.showShortToast(getContext(),
                    "一级目录选中了 ：" + new ArrayList<>(spinnerParentMap.keySet()).get(pos));
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    /**
     * 二级目录 spinner 事件选中监听
     */
    private Spinner.OnItemSelectedListener childSpinnerItemSelectedListener
            = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            ToastUtil.showShortToast(getContext(),
                    "二级目录选中了 ：" + new ArrayList<>(spinnerChildMap.keySet()).get(pos));
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
}
