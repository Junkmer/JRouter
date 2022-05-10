package com.junker.jrouter.example;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.junker.jrouter.R;
import com.junker.library.jrouter.JRouter;

public class BlankFragment extends Fragment {

//    private static final String ARG_PARAM = "param";
//
//    private String mParam;
//
//    public BlankFragment() {
//    }
//
//    public static BlankFragment newInstance(String param) {
//        BlankFragment fragment = new BlankFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM, param);
//        fragment.setArguments(args);
//        return fragment;
//    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        if (getArguments() != null) {
////            mParam = getArguments().getString(ARG_PARAM);
////        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        Button btn = view.findViewById(R.id.fm_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JRouter.Navigation navigation = JRouter.getInstance().setDestination("SecondActivity");
                navigation.navigate(BlankFragment.this);
            }
        });
        return view;
    }
}