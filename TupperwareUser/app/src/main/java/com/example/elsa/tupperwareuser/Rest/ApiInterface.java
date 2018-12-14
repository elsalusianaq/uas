package com.example.elsa.tupperwareuser.Rest;

import com.example.elsa.tupperwareuser.GetTupperware;


import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

public interface ApiInterface {
    /********* Tupperware *********/
    @GET("tup/all")
    Call<GetTupperware> getTupperware();


}

