package org.huaiangg.wanandroid.frags;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.huaiangg.wanandroid.R;

/**
 * A simple {@link Fragment} subclass.
 * @author huaian
 */
public class NavigationFragment extends Fragment {

    private static NavigationFragment fragment = null;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_navigation, container, false);
    }

    public static NavigationFragment getInstance() {
        if (fragment == null) {
            fragment = new NavigationFragment();
        }
        return fragment;
    }
}
