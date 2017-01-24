package com.minutetale.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.minutetale.papyha.R;

/**
 * Created by UdayanMac2013 on 21/01/17.
 */

public class GenreFragment extends Fragment {

    public static final String ARG_GENRE = "ARG_GENRE";

    private int mPage;

    public static GenreFragment newInstance(int genre) {
        Bundle args = new Bundle();
        args.putInt(ARG_GENRE, genre);
        GenreFragment searchFragment = new GenreFragment();
        searchFragment.setArguments(args);
        return searchFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_GENRE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.genre_fragment, container, false);
        TextView textView = (TextView) view;
        textView.setText("Genre Text #" + mPage);
        return view;
    }
}
