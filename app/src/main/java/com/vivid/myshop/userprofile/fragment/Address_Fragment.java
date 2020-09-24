package com.vivid.myshop.userprofile.fragment;

import android.content.Context;
import android.net.Uri;
import android.opengl.Visibility;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.vivid.myshop.R;


public class Address_Fragment extends Fragment {
ScrollView scrollView;
TextView addresvisivelti;
private Object Address_Fragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_address_, container, false);
       addresvisivelti=view.findViewById(R.id.addtextview);
       scrollView=view.findViewById(R.id.visivlschreen);
       addresvisivelti.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               addresvisivelti.setVisibility(View.GONE);
               scrollView.setVisibility(View.VISIBLE);
           }
       });
        return view;
    }





}
