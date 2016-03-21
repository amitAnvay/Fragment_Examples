package com.andridlearning.amit_gupta.fragments.activities.fragments;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andridlearning.amit_gupta.fragments.R;

/**
 * Created by Amit_Gupta on 9/1/15.
 */
public class DynamicFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v =  inflater.inflate(R.layout.dynamic_fragment1,container,false);
        v.setBackgroundColor(Color.YELLOW);
        return v;
    }
}
