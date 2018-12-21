package com.minutetale.browse.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minutetale.browse.domain.model.Readlist;
import com.minutetale.papyha.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UdayanMac2013 on 21/01/17.
 */

public class GenreFragment extends Fragment {

    public static final String ARG_GENRE = "ARG_GENRE";

    private int mPage;
    private RecyclerView recyclerView;
    private BrowseReadlistsAdapter adapter;
    private List<Readlist> readlists;
    private static final int BROWSE_READLISTS_FRAGMENT_POSITION = 0;

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
        View view;
        if (mPage == BROWSE_READLISTS_FRAGMENT_POSITION) {
            // Inflate the layout for browse readlist fragment
            view = handleBrowseReadlistsView(inflater, container);
        } else {
            // Inflate the layout for a genre fragment
            view = handleGenreView(inflater, container);
        }
        return view;
    }

    @NonNull
    private View handleGenreView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.genre_fragment, container, false);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.animated_toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Genre " + mPage);

        return view;
    }

    @NonNull
    private View handleBrowseReadlistsView(LayoutInflater inflater, ViewGroup container) {
        View view = inflater.inflate(R.layout.browse_readlists_fragment, container, false);
        readlists = new ArrayList<>();
        adapter = new BrowseReadlistsAdapter(getContext(), readlists);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        getMockData();
        return view;
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    //To-do : replace with real data source
    private void getMockData() {
        int[] covers = new int[]{ R.drawable.character, R.drawable.women, R.drawable.dark, R.drawable.feelgood };
        Readlist r1 = new Readlist("Unforgettable Characters", "Once you meet them they are etched on your mind forever. Be it love or hate, won't forget.", 5, 5, covers[0]);
        Readlist r2 = new Readlist("Girls who crossed the red sea", "Our league of extraordinary ladies who rebelled, led, fought, survived and left their marks.", 5, 5, covers[1]);
        Readlist r3 = new Readlist("Darkness My Old Friend", "Stories that take you to dark, dark places. Beware, there is no light at the end of the tunnel.", 5, 5, covers[2]);
        Readlist r4 = new Readlist("Feelgood Stories", "Stories that are as bright and warm as sunshine. Emotions that uplift your mind.", 5, 5, covers[3]);
        readlists.add(r1);
        readlists.add(r2);
        readlists.add(r3);
        readlists.add(r4);

        adapter.notifyDataSetChanged();
    }
}
