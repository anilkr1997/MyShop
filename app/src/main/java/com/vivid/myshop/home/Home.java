package com.vivid.myshop.home;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.vivid.myshop.MainActivity;
import com.vivid.myshop.R;
import com.vivid.myshop.fullcontantview.fullitemview;

import java.util.ArrayList;
import java.util.Arrays;


public class Home extends Fragment {
RecyclerView homerecycleview;
    public static final String SHARED_PREF_NAME = "bucket";
    SharedPreferences sharedPreferences1;
    int valuea,valueb;
  //  ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7","Person 8", "Person 9", "Person 10", "Person 11", "Person 12", "Person 13", "Person 14"));
  //  ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop,R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop, R.drawable.shop));
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        sharedPreferences1 = getActivity().getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
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



        homerecycleview=view.findViewById(R.id.itemrecycyle);
        showvalu();
        //HORIZONTAL Schroll
       // StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.HORIZONTAL);

       GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        homerecycleview.setLayoutManager(gridLayoutManager);
        homeAdopter customAdapter = new homeAdopter(getActivity(), homeItem);
        homerecycleview.setAdapter(customAdapter);
        return view;
    }

    private void showvalu() {
        valuea = sharedPreferences1.getInt("volue",0 );
        valueb = sharedPreferences1.getInt("volueb",0 );
        valuea=valuea+valueb;

    }


}
