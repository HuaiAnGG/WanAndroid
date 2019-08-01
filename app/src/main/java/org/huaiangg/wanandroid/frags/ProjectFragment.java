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
 * create an instance of this fragment.
 * @author huaian
 */
public class ProjectFragment extends Fragment {

    private static ProjectFragment fragment;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_project, container, false);
    }

    public static ProjectFragment getInstance() {
        if (fragment == null) {
            fragment = new ProjectFragment();
        }
        return fragment;
    }
}
