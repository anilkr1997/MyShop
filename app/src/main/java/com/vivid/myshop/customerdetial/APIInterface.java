package com.vivid.myshop.customerdetial;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {
    @FormUrlEncoded
    @POST("insert.php")
    Call<String> savePost(@Field("name") String name,
                                         @Field("phone") String phone,
                                         @Field("email") String email,
                                         @Field("password")String password);


}
