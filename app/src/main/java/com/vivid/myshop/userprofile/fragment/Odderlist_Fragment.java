package com.vivid.myshop.userprofile.fragment;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vivid.myshop.R;
import com.vivid.myshop.home.homeAdopter;
import com.vivid.myshop.home.homeItem;


public class Odderlist_Fragment extends Fragment {
    RecyclerView odderlistitem;
    public static final String SHARED_PREF_NAME = "bucket";
    SharedPreferences sharedPreferences1;
    int valuea,valueb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_odderlist_, container, false);
        homeItem[] homeItem=new homeItem[]{
                new homeItem("cloth","1","red","l",R.drawable.shop,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","2","red","l",R.drawable.shop,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","3","red","l",R.drawable.shop,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","4","red","l",R.drawable.shop,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","5","red","l",R.drawable.shop,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","6","red","l",R.drawable.shop,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","7","red","l",R.drawable.shop,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","8","red","l",R.drawable.shop,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","9","red","l",R.drawable.shop,"sdjfsdfhshffjskjdf"),

        };



        odderlistitem=view.findViewById(R.id.itemrecycyle);
        
        //HORIZONTAL Schroll
        // StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.HORIZONTAL);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
        odderlistitem.setLayoutManager(gridLayoutManager);
        homeAdopter customAdapter = new homeAdopter(getActivity(), homeItem);
        odderlistitem.setAdapter(customAdapter);
        return view;
    }


}
