package org.huaiangg.wanandroid.network;

import org.huaiangg.wanandroid.frags.home.bean.BannerBean;
import org.huaiangg.wanandroid.frags.home.bean.HomeArticleBean;
import org.huaiangg.wanandroid.frags.system.SystemArticleBean;
import org.huaiangg.wanandroid.utils.Constants;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @description: 网络请求接口
 * @author: HuaiAngg
 * @create: 2019-07-27 14:56
 */
public interface ApiService {

    /**
     * 获取 banner 数据接口
     * @return BannerBean
     */
    @GET(Constants.BANNER_URL)
    Observable<BannerBean> getBannerData();

    /**
     * 首页文章列表接口
     * @param pageNum 页码
     * @return HomeArticleBean
     */
    @GET("/article/list/{pageNum}/json")
    Observable<HomeArticleBean> getHomeArticleListData(@Path("pageNum") int pageNum);

    /**
     * 体系文章导航
     * @return SystemArticleBean
     */
    @GET(Constants.SYSTEM_ARTICLE_NAVIGATION_URL)
    Observable<SystemArticleBean> getSystemArticleNavigationData();

    /**
     * 体系文章列表
     * @param parentChapterId 父类 id
     * @param childrenId 子类 id
     * @return
     */
    @GET("/article/list/{parentChapterId}/json?cid={childrenId}")
    Observable<SystemArticleBean> getSystemArticleData(
            @Path("parentChapterId") String parentChapterId, @Path("Children") int childrenId);
}
