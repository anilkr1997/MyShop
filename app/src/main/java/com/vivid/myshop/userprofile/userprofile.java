package com.vivid.myshop.userprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vivid.myshop.R;
import com.vivid.myshop.userprofile.fragment.Address_Fragment;

import com.vivid.myshop.userprofile.fragment.Odderlist_Fragment;

import static android.view.View.GONE;

public class userprofile extends FragmentActivity  {
    ListView simpleList;
    FloatingActionButton logout;
    String countryList[] = {"Orders", "Save Card", "Addresses", "Profile Details"};
    int flags[] = {R.drawable.odderdetails, R.drawable.wallet, R.drawable.map, R.drawable.add};
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        logout=findViewById(R.id.floatingActionButton);
        fragment=new Fragment();

        //  visability();
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                gotom(position);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(userprofile.this, "Logout", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @SuppressLint("RestrictedApi")
    private void visability() {
        logout.setVisibility(logout.getVisibility() == GONE ? View.VISIBLE : View.VISIBLE);
    }

    @SuppressLint({"RestrictedApi", "ResourceAsColor"})
    private void gotom(int position) {
        switch (position){
            case 0:
//                fragment=new Odderlist_Fragment();
//                FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction1.add(R.id.container, fragment).addToBackStack(null).commit();
                break;
            case 1:
                Toast.makeText(this, "1->"+position+"Cooming soon", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                fragment=new Address_Fragment();
                FragmentTransaction fragmentTransactionl1 = getSupportFragmentManager().beginTransaction();
                fragmentTransactionl1.add(R.id.container, fragment).addToBackStack(null).commit();
                break;
            case 3:
                Toast.makeText(this, "3->"+position+"Cooming soon", Toast.LENGTH_SHORT).show();
                break;
            default:
                System.out.println("Elective courses : Optimization");

        }
    }



}
