package com.minutetale.mylibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minutetale.papyha.R;

/**
 * Created by UdayanMac2013 on 21/01/17.
 */

public class MyLibraryFragment extends Fragment {

    public static MyLibraryFragment newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt("argsInstance", instance);
        MyLibraryFragment myLibraryFragment = new MyLibraryFragment();
        myLibraryFragment.setArguments(args);
        return myLibraryFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.my_library_fragment, container, false);
    }
}
