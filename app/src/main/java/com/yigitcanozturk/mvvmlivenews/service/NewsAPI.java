package com.yigitcanozturk.mvvmlivenews.service;

import com.yigitcanozturk.mvvmlivenews.model.NewsResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsAPI {

     @GET("top-headlines")
     Call<NewsResponseModel> loadChanges(@Query("country") String country, @Query("apiKey") String apiKey);
}