package org.huaiangg.wanandroid.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * @description: Toast 工具类
 * @author: HuaiAngg
 * @create: 2019-07-24 23:35
 */
public class ToastUtil {

    /**
     * 短吐司
     * @param msg 待显示的消息
     */
    public static void showShortToast(Context mContext, String msg) {
        Toast.makeText( mContext, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 短吐司
     * @param msg 待显示的消息
     */
    public static void showLongToast(Context mContext, String msg) {
        Toast.makeText( mContext, msg, Toast.LENGTH_LONG).show();
    }
}
