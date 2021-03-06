package com.vivid.myshop.babykids;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vivid.myshop.R;
import com.vivid.myshop.home.homeAdopter;
import com.vivid.myshop.home.homeItem;

public class babykides extends Fragment {
RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_babykides, container, false);
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



        recyclerView=view.findViewById(R.id.itemrecycylebabykids);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        homeAdopter customAdapter = new homeAdopter(getActivity(), homeItem);
        recyclerView.setAdapter(customAdapter);

        return view;
    }

}
