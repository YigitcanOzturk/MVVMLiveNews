package com.yigitcanozturk.mvvmlivenews;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsAPI {

     @GET("top-headlines")
     Call<ResponseModel> loadChanges(@Query("country") String country,@Query("apiKey") String apiKey);
}