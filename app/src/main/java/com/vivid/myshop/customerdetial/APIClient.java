package com.vivid.myshop.customerdetial;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
private static final String  Baseurl="http://192.168.1.7/allapi/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(Baseurl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
