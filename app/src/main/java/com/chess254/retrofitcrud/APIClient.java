package com.chess254.retrofitcrud;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chess on 10/7/2018.
 */

public class APIClient {
    public static final String BASE_URL = "http://192.168.43.201/jobvibe/";
    public static Retrofit retrofit;


    public static Retrofit getApiCLient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }

        return retrofit;
    }
}
