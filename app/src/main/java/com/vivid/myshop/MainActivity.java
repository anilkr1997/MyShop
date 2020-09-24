package com.vivid.myshop;



import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.vivid.myshop.HomeLiving.HomeLiving;
import com.vivid.myshop.OtherCategories.OtherCategary;
import com.vivid.myshop.babykids.babykides;
import com.vivid.myshop.bucketcard.cardview;
import com.vivid.myshop.electronice.electronice;
import com.vivid.myshop.foryou.foryou;
import com.vivid.myshop.fullcontantview.fullitemview;
import com.vivid.myshop.healthbeauty.HealrhBeauty;
import com.vivid.myshop.home.Home;
import com.vivid.myshop.home.homeAdopter;
import com.vivid.myshop.home.homeItem;
import com.vivid.myshop.men.men_fragment;
import com.vivid.myshop.userprofile.userprofile;
import com.vivid.myshop.women.women;

public class MainActivity extends FragmentActivity implements homeAdopter.Clickebucketvalue {
    Fragment fragment;
    ImageView homeee,searchbar,mostlike,profile;
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    TextView backet,tvbacket;
    public static final String SHARED_PREF_NAME = "bucket";
    SharedPreferences sharedPreferences1;
    int valuea,valueb;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        homeee=findViewById(R.id.homee);
        searchbar=findViewById(R.id.search_bar);
        mostlike=findViewById(R.id.mostlikepost);
        profile=findViewById(R.id.Profile);
        sharedPreferences1 = MainActivity.this.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        backet=findViewById(R.id.tvbacket);
        backet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, cardview.class);
                startActivity(intent);
            }
        });
        showvalu();
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Home(), "Home");
        adapter.addFragment(new foryou(), "For You");
        adapter.addFragment(new men_fragment(), "Men");
        adapter.addFragment(new women(), "Women");
        adapter.addFragment(new electronice(), "Electronics");
        adapter.addFragment(new HomeLiving(), "Home & Living");
        adapter.addFragment(new HealrhBeauty(), "Health Beauty");
        adapter.addFragment(new babykides(), "Baby & Kids");
        adapter.addFragment(new OtherCategary(), "Other Categary");
        viewPager.setAdapter(adapter);
         tabLayout.setTabMode(View.SCROLLBAR_POSITION_DEFAULT);
        tabLayout.setupWithViewPager(viewPager);
homeee.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "welcom", Toast.LENGTH_SHORT).show();
    }
});
searchbar.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "welcom", Toast.LENGTH_SHORT).show();
    }
});
mostlike.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "welcom", Toast.LENGTH_SHORT).show();
    }
});
profile.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this, userprofile.class);
        startActivity(intent);
    }
});




    }

    private void showvalu() {

        valuea = sharedPreferences1.getInt("volue",0 );
        valueb = sharedPreferences1.getInt("volueb",0 );
        valuea=valuea+valueb;
        backet.setText(""+valuea);
    }



    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClicked(homeItem item) {

    }
}
