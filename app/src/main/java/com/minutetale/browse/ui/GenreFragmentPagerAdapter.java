package com.minutetale.browse.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by JBhattacharya on 23/01/17.
 */
public class GenreFragmentPagerAdapter extends FragmentPagerAdapter {
    final int GENRE_COUNT = 5;

    public GenreFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int genre) {
        return GenreFragment.newInstance(genre);
    }

    @Override
    public int getCount() {
        return GENRE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Readlists";
        }
        return "Genre " + (position);
    }
}
