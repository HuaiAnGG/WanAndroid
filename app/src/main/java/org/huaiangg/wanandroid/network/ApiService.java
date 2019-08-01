package org.huaiangg.wanandroid.network;

import org.huaiangg.wanandroid.frags.home.HomeArticleBean;
import org.huaiangg.wanandroid.frags.bean.BannerBean;
import org.huaiangg.wanandroid.utils.Constants;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @description: 网络请求接口
 * @author: HuaiAngg
 * @create: 2019-07-27 14:56
 */
public interface ApiService {

    /**
     * 获取 banner 数据接口
     * @return
     */
    @GET(Constants.BANNER_URL)
    Observable<BannerBean> getBannerData();

    /**
     * 文章列表接口
     * @return
     */
    @GET(Constants.HOME_ARTICLE_URL)
    Observable<HomeArticleBean> getHomeArticleListData();
}
