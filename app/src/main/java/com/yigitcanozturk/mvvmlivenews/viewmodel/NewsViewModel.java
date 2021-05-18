package com.yigitcanozturk.mvvmlivenews.viewmodel;

import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yigitcanozturk.mvvmlivenews.NewsAPI;
import com.yigitcanozturk.mvvmlivenews.ResponseModel;
import com.yigitcanozturk.mvvmlivenews.model.News;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsViewModel extends ViewModel implements Callback<ResponseModel> {

    static final String BASE_URL = "https://newsapi.org/v2/";

    public MutableLiveData<ArrayList<News>> newsLiveData;
    ArrayList<News> newsArrayList;
    public NewsViewModel() {
        newsLiveData = new MutableLiveData<>();

        // call your Rest API in init method

        init();
    }

    public MutableLiveData<ArrayList<News>> getUserMutableLiveData() {
        return newsLiveData;
    }

    public void init(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        NewsAPI newsAPI = retrofit.create(NewsAPI.class);

        Call<ResponseModel> call = newsAPI.loadChanges("tr","588ca767d0ad4629b5d3b06d21e4c028");
        call.enqueue(this);

        //populateList();

    }

    @Override
    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
        if(response.body().getStatus().equals("ok")) {
            newsArrayList = new ArrayList<>();
            newsArrayList = response.body().getNews();
            newsLiveData.setValue(newsArrayList);
        } else {
            System.out.println(response.errorBody()+"error");
        }
    }

    @Override
    public void onFailure(Call<ResponseModel> call, Throwable t) {
        t.printStackTrace();
    }
}
