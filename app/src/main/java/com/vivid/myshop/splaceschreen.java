package com.vivid.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.vivid.myshop.customerdetial.costumerlogin;

public class splaceschreen extends Activity {
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splaceschreen);
        img = (ImageView)findViewById(R.id.splacimag);
        Animation animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);

        img.startAnimation(animZoomIn);
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent i = new Intent(splaceschreen.this, costumerlogin.class);
                startActivity(i);
                finish();
            }
        }, 2000);


    }
}
