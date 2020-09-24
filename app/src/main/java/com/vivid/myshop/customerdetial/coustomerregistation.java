package com.vivid.myshop.customerdetial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.vivid.myshop.MainActivity;
import com.vivid.myshop.R;
import com.vivid.myshop.VolleySingleton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.Field;

public class coustomerregistation extends Activity {
TextView username,usermail,userphone,userpassword;
Button costumerRegistation;
private APIInterface apiInterface;
private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coustomerregistation);
        costumerRegistation=findViewById(R.id.registationcomp);
        username=findViewById(R.id.userName);
        userphone=findViewById(R.id.userPhoneNumber);
        usermail=findViewById(R.id.useremail);
        userpassword=findViewById(R.id.userPassword);
     //   apiInterface=APIClient.getClient().create(APIInterface.class);
        byretrofit();
        Hit_Api_To_Submit();
      }
        private void Hit_Api_To_Submit() {
            StringRequest stringRequest;
            stringRequest = new StringRequest(Request.Method.POST, "http://192.168.1.7/allapi/insert.php",
                    new com.android.volley.Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            Toast.makeText(coustomerregistation.this, ""+response, Toast.LENGTH_SHORT).show();
                        }
                    }, new com.android.volley.Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(coustomerregistation.this, "++++===="+error.toString(), Toast.LENGTH_SHORT).show();

                }
            })
            {
                @Override
                protected Map<String, String> getParams( ) throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put( "name ", "anil" );
                params.put( "phone ", "1234567890" );
                    params.put( "email ", "akmourya@gmail.com" );
                    params.put( "password ", "qwqwqwqwq" );
                Log.v("params",params.toString());
                return params;
            }
            };
            VolleySingleton.getInstance( this ).addToRequestQueue(stringRequest);
        }

    private void byretrofit() {
        APIInterface api= APIClient.getClient().create(APIInterface.class);
        Call<String> call=api.savePost( "Anil","123456789","akmourya1997","12345678");
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String data = response.body();
                Toast.makeText(coustomerregistation.this, " "+data, Toast.LENGTH_SHORT).show();
                Log.e("data",response.toString());
            }
            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(coustomerregistation.this, "fail"+call, Toast.LENGTH_SHORT).show();
            }
        });
    }
}