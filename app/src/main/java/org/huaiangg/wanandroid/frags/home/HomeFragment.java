package org.huaiangg.wanandroid.frags.home;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import org.huaiangg.wanandroid.R;
import org.huaiangg.wanandroid.activities.BannerContentActivity;
import org.huaiangg.wanandroid.frags.bean.BannerBean;
import org.huaiangg.wanandroid.frags.home.adapter.HomeArticleAdapter;
import org.huaiangg.wanandroid.frags.home.loder.GlideImageLoder;
import org.huaiangg.wanandroid.network.RetrofitUtil;
import org.huaiangg.wanandroid.utils.ToastUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 *
 * @author huaian
 */
public class HomeFragment extends Fragment implements OnBannerListener, RecyclerView.RecyclerListener {

    private static final String TAG = HomeFragment.class.getSimpleName();

    private Banner banner;
    private static HomeFragment fragment = new HomeFragment();
    private List<String> imagePath = new ArrayList<>();
    private List<String> imageTitle = new ArrayList<>();
    private List<String> imageUrl = new ArrayList<>();
    private RecyclerView articleRecyclerView;
    private static int PAGE_NUM = 1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 初始化，确保挂起、回退都不会重新初始化
        PAGE_NUM = 1;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.frag_home, container, false);

        initView(view);
        return view;
    }

    /**
     * 初始化组件
     *
     * @param view 父类的 view
     */
    private void initView(View view) {
        // 初始化组件
        banner = view.findViewById(R.id.banner);
        articleRecyclerView = view.findViewById(R.id.home_article);

        // 监听事件绑定
        banner.setOnBannerListener(this);
        // 获取 banner 数据
        getBannerData();
        // 配置 recyclerView
        articleRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false));
        // 获取文章实体
        HomeArticleBean articleList = getArticleList(PAGE_NUM);
        articleRecyclerView.setAdapter(new HomeArticleAdapter(articleList));
        articleRecyclerView.setRecyclerListener(this);
    }

    /**
     * banner 初始化 banner
     *
     * @param path  image Path
     * @param title title list
     */
    private void initBanner(List<String> path, List<String> title) {
        // 图片加载器
        banner.setImageLoader(new GlideImageLoder());
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        // 图片集合
        banner.setImages(path);
        banner.setBannerTitles(title);
        banner.setDelayTime(3000);
        banner.start();
    }

    /**
     * 获取文章列表
     */
    private HomeArticleBean getArticleList(int pageNum) {
        final HomeArticleBean[] articleBean = {null};
        RetrofitUtil.getInstance().getApiService()
                .getHomeArticleListData(pageNum)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeArticleBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e(TAG, "onSubscribe: " + d.isDisposed());
                    }

                    @Override
                    public void onNext(HomeArticleBean bean) {
                        if (bean.getData() == null) {
                            Log.e(TAG, "onNext: " + bean.getErrorMsg());
                            ToastUtil.showLongToast(getContext(), bean.getErrorMsg());
                            return;
                        }
                        articleBean[0] = bean;
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: ", e);
                    }

                    @Override
                    public void onComplete() {
                        Log.i(TAG, "onComplete: 完成文章列表请求！");

                    }
                });
        return articleBean[0];
    }

    /**
     * 请求 banner 数据
     */
    public void getBannerData() {
        RetrofitUtil.getInstance().getApiService()
                .getBannerData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannerBean>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {
                        Log.i(TAG, "onSubscribe:  loding banner ....");
                    }

                    @Override
                    public void onNext(BannerBean bean) {
                        Log.i(TAG, "onNext: " + bean);
                        imagePath.clear();
                        imageUrl.clear();
                        imageTitle.clear();
                        String path, title, url;
                        for (int i = 0; i < bean.getData().size(); i++) {
                            path = bean.getData().get(i).getImagePath();
                            title = bean.getData().get(i).getTitle();
                            url = bean.getData().get(i).getUrl();
                            imagePath.add(path);
                            imageTitle.add(title);
                            imageUrl.add(url);
                        }
                    }

                    @Override
                    public void onError(Throwable error) {
                        Log.e(TAG, "onError: " + error.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        initBanner(getImagePath(), getImageTitle());
                    }
                });
    }

    /**
     * image path
     *
     * @return list
     */
    public List<String> getImagePath() {
        return imagePath;
    }

    /**
     * image title
     *
     * @return list
     */
    public List<String> getImageTitle() {
        return imageTitle;
    }

    /**
     * image url
     *
     * @return list
     */
    public List<String> getImageUrl() {
        return imageUrl;
    }

    @Override
    public void onStart() {
        super.onStart();
        banner.startAutoPlay();
    }

    @Override
    public void onStop() {
        super.onStop();
        banner.stopAutoPlay();
    }

    public static HomeFragment getInstance() {
        if (fragment == null) {
            fragment = new HomeFragment();
        }
        return fragment;
    }

    @Override
    public void OnBannerClick(int position) {
        Intent intent = new Intent(getContext(), BannerContentActivity.class);
        intent.putExtra("bannerImageUrl", getImageUrl().get(position));
        Objects.requireNonNull(getContext()).startActivity(intent);
    }

    @Override
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        viewHolder.getAdapterPosition();
    }
}
