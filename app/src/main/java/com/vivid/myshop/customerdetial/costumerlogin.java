package com.vivid.myshop.customerdetial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vivid.myshop.MainActivity;
import com.vivid.myshop.R;

public class costumerlogin extends Activity {
Button login,skip;
TextView registation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costumerlogin);
        login=findViewById(R.id.login);
        skip=findViewById(R.id.skip);
        registation=findViewById(R.id.registation);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(costumerlogin.this, MainActivity.class);
                startActivity(intent);
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(costumerlogin.this, MainActivity.class);
                startActivity(intent);
            }
        });
        registation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(costumerlogin.this, coustomerregistation.class);
                startActivity(intent);
            }
        });
    }
}
