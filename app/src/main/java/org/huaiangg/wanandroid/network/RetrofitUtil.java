package org.huaiangg.wanandroid.network;

import org.huaiangg.wanandroid.utils.Constants;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @description: Retrofit 工具类
 * @author: HuaiAngg
 * @create: 2019-07-27 15:05
 */
public class RetrofitUtil {

    private volatile static RetrofitUtil instance;
    private Retrofit retrofit;
    private ApiService apiService;

    private RetrofitUtil() {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public static RetrofitUtil getInstance() {
        if (instance == null) {
            synchronized (RetrofitUtil.class) {
                if (instance == null){
                    instance = new RetrofitUtil();
                }
            }
        }
        return instance;
    }

    public ApiService getApiService() {
        return apiService;
    }
}
