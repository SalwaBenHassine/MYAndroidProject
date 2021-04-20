package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class BlankFragment extends Fragment {
    private TextView mGreeting;
    private ImageView Img;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank,container,true);
        mGreeting = (TextView)rootView.findViewById(R.id.Greeting);
        Img = (ImageView) rootView.findViewById(R.id.logo);

        return rootView;
    }}