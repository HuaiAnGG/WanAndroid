package org.huaiangg.wanandroid.base;

/**
 * @description: 界面内容合约类
 * @author: HuaiAngg
 * @create: 2019-07-26 16:59
 */
public interface ContentContract {

    interface View extends BaseView<Presenter> {
        void setLoading();

        void update();
    }

    interface Presenter extends BasePresenter {

        void edit();

        void delete();
    }
}
