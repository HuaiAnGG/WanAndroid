package org.huaiangg.wanandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import org.huaiangg.wanandroid.frags.home.HomeFragment;
import org.huaiangg.wanandroid.frags.NavigationFragment;
import org.huaiangg.wanandroid.frags.ProjectFragment;
import org.huaiangg.wanandroid.frags.system.SystemFragment;
import org.huaiangg.wanandroid.utils.ToastUtil;

/**
 * @author huaian
 */
public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener,
        NavigationView.OnNavigationItemSelectedListener {

    private ImageView imPortrait;
    private TextView txtTitle;
    private ImageView imSearch;
    private BottomNavigationView bottomNavigation;
    private NavigationView navigationView;
    private DrawerLayout drawer;
    private FrameLayout fragsContainer;

    private static Fragment currentFragment = HomeFragment.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化view
        initView();
        // 设置监听事件
        initListener();
    }

    /**
     * 监听事件
     */
    private void initListener() {
        imSearch.setOnClickListener(this);
        imPortrait.setOnClickListener(this);
        bottomNavigation.setOnNavigationItemSelectedListener(this);
        navigationView.setNavigationItemSelectedListener(this);
    }

    /**
     * 初始化view
     */
    private void initView() {
        imPortrait = findViewById(R.id.im_portrait);
        txtTitle = findViewById(R.id.txt_title);
        imSearch = findViewById(R.id.im_search);
        bottomNavigation = findViewById(R.id.bottomNavigation);
        navigationView = findViewById(R.id.navigation_view);
        drawer = findViewById(R.id.drawer_layout);
        fragsContainer = findViewById(R.id.fragments_container);

        // HomeFragment 为主界面
        bottomNavigation.getMenu().getItem(0).setChecked(true);
        getSupportFragmentManager().beginTransaction().add(R.id.fragments_container,
                HomeFragment.getInstance()).commit();
    }

    /**
     * 根据导航加载页面
     *
     * @param position    position
     * @param title       标题
     * @param newFragment 页面
     */
    private void loadFragment4BottomNavigation(int position, String title, Fragment newFragment) {
        bottomNavigation.getMenu().getItem(position).setChecked(true);
        txtTitle.setText(title);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        if (newFragment.isAdded()) {
            transaction.show(newFragment);
        } else {
            transaction.hide(getCurrentFragment()).add(R.id.fragments_container, newFragment);
        }
        currentFragment = newFragment;
        transaction.replace(R.id.fragments_container, newFragment).commit();
    }

    /**
     * 获取当前的 Fragment
     *
     * @return
     */
    public static Fragment getCurrentFragment() {
        return currentFragment;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.im_portrait:
                drawer.openDrawer(GravityCompat.START);
                break;
            case R.id.im_search:
                // TODO：搜索功能
                ToastUtil.showShortToast(this, "功能待开发~!");
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_home:
                loadFragment4BottomNavigation(0,
                        menuItem.getTitle().toString(), HomeFragment.getInstance());
                break;
            case R.id.action_system:
                loadFragment4BottomNavigation(1,
                        menuItem.getTitle().toString(), SystemFragment.getInstance());
                break;
            case R.id.action_navigation:
                loadFragment4BottomNavigation(2,
                        menuItem.getTitle().toString(), NavigationFragment.getInstance());
                break;
            case R.id.action_project:
                loadFragment4BottomNavigation(3,
                        menuItem.getTitle().toString(), ProjectFragment.getInstance());
                break;
            case R.id.navigation_view_collection:
                // TODO：收藏
            case R.id.navigation_view_about_author:
                // TODO：关于作者
                drawer.closeDrawer(GravityCompat.START);
                ToastUtil.showShortToast(this, "功能待开发~!");
            default:
                break;
        }
        return false;
    }
}
