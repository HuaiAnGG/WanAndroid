package org.huaiangg.wanandroid.activities;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.huaiangg.wanandroid.R;

/**
 * @author huaian
 */
public class WebViewContextActivity extends AppCompatActivity {

    private static final String TAG = WebViewContextActivity.class.getSimpleName();
    private WebView webView;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_content);

        url = getIntent().getStringExtra("webViewUrl");
        Log.d(TAG, "onCreate: " + url);
        initView();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void initView() {
        webView = findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        if (url == null) {
            url = "www.baidu.com";
        }
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    view.loadUrl(String.valueOf(request.getUrl()));
                }
                return true;
            }
        });
        webView.loadUrl(url);
    }


}
