package com.minutetale.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerTabStrip;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.minutetale.Layout.SlidingTabLayout;
import com.minutetale.adapter.GenreFragmentPagerAdapter;
import com.minutetale.papyha.R;

/**
 * Created by UdayanMac2013 on 21/01/17.
 */

public class BrowseFragment extends Fragment {

    private ViewPager viewPager;
    public static final String ARGS = "ARGS";
    private SlidingTabLayout mSlidingTabLayout;

    public static BrowseFragment newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt(ARGS, instance);
        BrowseFragment browseFragment = new BrowseFragment();
        browseFragment.setArguments(args);
        return browseFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.browse_fragment, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.pager);
        viewPager.setAdapter(new GenreFragmentPagerAdapter(getActivity().getSupportFragmentManager()));
        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        formatSlidingTab(mSlidingTabLayout);
        // Setting the ViewPager For the SlidingTabsLayout
        mSlidingTabLayout.setViewPager(viewPager);
        return view;
    }

    private void formatSlidingTab(SlidingTabLayout slidingTabLayout) {
        //set title spacing
        slidingTabLayout.setDistributeEvenly(true);

        //set indicator color
        slidingTabLayout.setSelectedIndicatorColors(ContextCompat.getColor(getContext(),R.color.colorOrange));
    }
}
