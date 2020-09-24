package com.vivid.myshop.foryou;

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

import java.util.ArrayList;
import java.util.Arrays;


public class foryou extends Fragment {
    RecyclerView homerecycleview;

//    ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7","Person 8", "Person 9", "Person 10", "Person 11", "Person 12", "Person 13", "Person 14"));
//    ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop,R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop));

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_foryou, container, false);

        homerecycleview=view.findViewById(R.id.itemrecycyleforyou);

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



        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        homerecycleview.setLayoutManager(gridLayoutManager);
        homeAdopter customAdapter = new homeAdopter(getActivity(), homeItem);
        homerecycleview.setAdapter(customAdapter);

        return view;
    }


}
