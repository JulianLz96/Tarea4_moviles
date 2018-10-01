package com.iteso.tarea4.tools;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iteso.tarea4.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentElectronics extends android.support.v4.app.Fragment {


    public FragmentElectronics() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_electronics, container, false);
    }

}
