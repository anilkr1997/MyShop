package com.vivid.myshop.fullcontantview;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.viewpagerindicator.CirclePageIndicator;
import com.vivid.myshop.MainActivity;
import com.vivid.myshop.R;
import com.vivid.myshop.bucketcard.cardview;
import com.vivid.myshop.home.homeAdopter;
import com.vivid.myshop.home.homeItem;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class fullitemview extends FragmentActivity {
Button increment,decrement,buynow,checkout;
TextView backet,itemnumber,price,discount,productname,addclick;
    public static final String SHARED_PREF_NAME = "bucket";
    ImageView onback;
    RecyclerView horzentalscrollrecycleview;

    int b;
    int valuea,valueb;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<ImageModel> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.logo, R.drawable.ic_launcher_background, R.drawable.logo,R.drawable.ic_add_shopping};
    SharedPreferences sharedPreferences1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullitemview);
         sharedPreferences1 = fullitemview.this.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        imageModelArrayList = new ArrayList<>();
       // imageModelArrayList = populateList();
        init();
        horzentalscrollrecycleview=findViewById(R.id.fullcontanteRecycyleview);
        horzentalrecycle();
        onback=findViewById(R.id.onback);
        backet=findViewById(R.id.tvbacket);
        addclick=findViewById(R.id.addclick);
        increment=findViewById(R.id.increment);
        decrement=findViewById(R.id.decrement);
        itemnumber=findViewById(R.id.addvalue);
        checkout=findViewById(R.id.gotobag);
            showvalu();
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement.setVisibility(View.VISIBLE);
                addclick.setVisibility(View.GONE);
                b=b+1;
                if(b>=0)
                {
                    itemnumber.setText(""+b);
                    sharedprefences();
                    showvalu();
                    itemnumber.setVisibility(View.VISIBLE);
                }
                else
                {}
            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=b-1;
                if(b>=0){
                    itemnumber.setText(""+b);
                    sharedprefences();
                    showvalu();
                    if(b==0){
                        addclick.setVisibility(View.VISIBLE);
                        decrement.setVisibility(View.GONE);
                        itemnumber.setVisibility(View.GONE);
                    }
                }
                else{
                    Toast.makeText(fullitemview.this,"No Item Added In Card", Toast.LENGTH_LONG).show();
                    decrement.setVisibility(View.GONE);
                    itemnumber.setVisibility(View.GONE);
                    addclick.setVisibility(View.VISIBLE);

                }

            }
        });
        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(fullitemview.this, cardview.class);
                startActivity(intent);

            }
        });
        backet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(fullitemview.this, cardview.class);
                startActivity(intent);

            }
        });
        onback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(fullitemview.this, MainActivity.class);
                startActivity(intent);

            }
        });


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
        horzentalscrollrecycleview.setLayoutManager(staggeredGridLayoutManager);
        horizentaladopter customAdapter = new horizentaladopter(this, homeItem);
        horzentalscrollrecycleview.setAdapter(customAdapter);
    }

    private void showvalu() {

        valuea = sharedPreferences1.getInt("volue",0 );
        valueb = sharedPreferences1.getInt("volueb",0 );
        valuea=valuea+valueb;
        backet.setText(""+valuea);
    }

    private void sharedprefences() {
        SharedPreferences.Editor editor = sharedPreferences1.edit();
        editor.putInt("volueb", b);
        editor.apply();
//        String value = sharedPreferences1.getString("volue", "");
//        Log.d(TAG, value);
//        Toast.makeText(this, ""+value, Toast.LENGTH_SHORT).show();
    }


    private ArrayList<ImageModel> populateList(){

        ArrayList<ImageModel> list = new ArrayList<>();

        for(int i = 0; i < myImageList.length; i++){
            ImageModel imageModel = new ImageModel();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;
    }

    private void init() {


        mPager.setAdapter(new SlidingImage_Adapter(fullitemview.this,imageModelArrayList));

        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =imageModelArrayList.size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }

}
