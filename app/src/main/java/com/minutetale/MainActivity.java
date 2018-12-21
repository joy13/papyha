package com.minutetale;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;

import com.minutetale.browse.ui.BrowseFragment;
import com.minutetale.mylibrary.MyLibraryFragment;
import com.minutetale.search.SearchFragment;
import com.minutetale.shared.BaseActivity;
import com.minutetale.papyha.R;
import com.ncapdevi.fragnav.FragNavController;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private BottomBar mBottomBar;
    private FragNavController fragNavController;

    private final int TAB_BROWSE = FragNavController.TAB1;
    private final int TAB_SEARCH = FragNavController.TAB2;
    private final int TAB_MY_LIBRARY = FragNavController.TAB3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragments = new ArrayList<>(3);

        //add fragments to list
        fragments.add(BrowseFragment.newInstance(0));
        fragments.add(SearchFragment.newInstance(0));
        fragments.add(MyLibraryFragment.newInstance(0));
        fragNavController = new FragNavController(getSupportFragmentManager(), R.id.container, fragments);

        mBottomBar = (BottomBar)findViewById(R.id.bottomBar);
        mBottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                //switch between tabs
                switch (tabId) {
                    case R.id.action_browse:
                        fragNavController.switchTab(TAB_BROWSE);
                        break;
                    case R.id.action_search:
                        fragNavController.switchTab(TAB_SEARCH);
                        break;
                    case R.id.action_my_library:
                        fragNavController.switchTab(TAB_MY_LIBRARY);
                        break;
                }
            }
        });
        mBottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                if (tabId == R.id.action_browse) {
                    fragNavController.clearStack();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (fragNavController.getCurrentStack().size() > 1) {
            fragNavController.pop();
        } else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Necessary to restore the BottomBar's state, otherwise we would
        // lose the current tab on orientation change.
        mBottomBar.onSaveInstanceState();
    }
}
