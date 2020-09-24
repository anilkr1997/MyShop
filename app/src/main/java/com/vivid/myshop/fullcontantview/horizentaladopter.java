package com.vivid.myshop.fullcontantview;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.vivid.myshop.R;
import com.vivid.myshop.home.homeAdopter;
import com.vivid.myshop.home.homeItem;

import java.util.ArrayList;

import static com.vivid.myshop.R.id.homrproductimg;

public class horizentaladopter extends RecyclerView.Adapter<horizentaladopter.MyViewHolder> {
    ArrayList personNames;
    ArrayList personImages;
    FragmentActivity fragmentActivity;
    homeItem[] homeItem;
    public static final String SHARED_PREF_NAME = "bucket";
    int a=0;

    public horizentaladopter(FragmentActivity fragmentActivity, homeItem[] homeItem) {
        this.fragmentActivity=fragmentActivity;
        this.homeItem=homeItem;

    }
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.horzintelitem,parent,false);
        return new horizentaladopter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final homeItem homeitem= homeItem[position];
        holder.productname.setText(homeItem[position].getProductName());
        holder.productImage.setImageResource(homeItem[position].getImageurl());
        //  holder.peoducevalue.setText(String.valueOf(a));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fragmentActivity, fullitemview.class);
                fragmentActivity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return homeItem.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView productname,addclick;
        ImageView productImage;
        LinearLayout homelayout;
        TextView peoducevalue;
        Button increment,decrement;
        final SharedPreferences sharedPreferences1 = fragmentActivity.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            productImage=itemView.findViewById(homrproductimg);
            productname=itemView.findViewById(R.id.homeproductname);
            homelayout=itemView.findViewById(R.id.homelayoute);
            peoducevalue=itemView.findViewById(R.id.addvalue);
            increment=itemView.findViewById(R.id.increment);
            decrement=itemView.findViewById(R.id.decrement);
            addclick=itemView.findViewById(R.id.addclick);

            increment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addclick.setVisibility(View.GONE);
                    decrement.setVisibility(View.VISIBLE);
                    a=a+1;
                    if(a>=0)
                    {
                        sharedprefences();
                        //Creating editor to store values to shared preferences
                        peoducevalue.setVisibility(View.VISIBLE);
                        // Toast.makeText(fragmentActivity,"Button clicked first time!"+a, Toast.LENGTH_LONG).show();
                        peoducevalue.setText(""+a);
                    }
                    else
                    {
                    }
                }
            });
            decrement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a=a-1;

                    if(a>=0){
                        peoducevalue.setText(""+a);
                        sharedprefences();
                        if(a==0){
                            // peoducevalue.setText(""+0);
                            decrement.setVisibility(View.GONE);
                            peoducevalue.setVisibility(View.GONE);
                            //  peoducevalue.setText(""+a);
                            addclick.setVisibility(View.VISIBLE);

                        }

                    }
                    else{

                        Toast.makeText(fragmentActivity,"No Item Added In Card", Toast.LENGTH_LONG).show();
                        decrement.setVisibility(View.GONE);
                        peoducevalue.setVisibility(View.GONE);
                        addclick.setVisibility(View.VISIBLE);

                    }

                }
            });
        }
        private void sharedprefences() {
            SharedPreferences.Editor editor = sharedPreferences1.edit();

            //Adding values to editor
            editor.putInt("volue", a);
            editor.apply();
        }
    }
}
