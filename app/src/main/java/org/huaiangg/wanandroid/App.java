package org.huaiangg.wanandroid;

import android.app.Application;

/**
 * @description: this is App
 * @time: 2019/10/26 - 15:42
 * @author: huaian
 */
public class App extends Application {

    private static App app;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static App getInstance() {
        if (app == null) {
            app = new App();
        }
        return app;
    }
}
