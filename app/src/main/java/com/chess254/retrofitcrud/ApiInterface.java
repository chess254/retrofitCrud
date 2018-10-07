package com.chess254.retrofitcrud;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by chess on 10/7/2018.
 */

public interface ApiInterface {

    @GET("login.php")
    Call<List<Calories>> getCalorieaInfo(@Query("item_type") String item_type);

}
