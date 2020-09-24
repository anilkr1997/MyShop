package com.vivid.myshop.bucketcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.vivid.myshop.R;
import com.vivid.myshop.fullcontantview.horizentaladopter;
import com.vivid.myshop.home.homeItem;

public class cardview extends FragmentActivity {
RecyclerView recyclerView;
TextView bagTotalamunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
        recyclerView=findViewById(R.id.morelikeitem);
        horzentalrecycle();
    }
    private void horzentalrecycle() {
        homeItem[] homeItem=new homeItem[]{
                new homeItem("cloth","1","red","l",R.drawable.logo,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","2","red","l",R.drawable.logo,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","3","red","l",R.drawable.logo,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","4","red","l",R.drawable.logo,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","5","red","l",R.drawable.logo,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","6","red","l",R.drawable.logo,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","7","red","l",R.drawable.logo,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","8","red","l",R.drawable.logo,"sdjfsdfhshffjskjdf"),
                new homeItem("cloth","9","red","l",R.drawable.logo,"sdjfsdfhshffjskjdf"),

        };
        //HORIZONTAL Schroll
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, LinearLayoutManager.HORIZONTAL);
        // GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        horizentaladopter customAdapter = new horizentaladopter(this, homeItem);
        recyclerView.setAdapter(customAdapter);
    }

}
