package com.yigitcanozturk.mvvmlivenews.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.yigitcanozturk.mvvmlivenews.model.News;

import java.util.ArrayList;

public class NewsViewModel extends ViewModel {
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
        populateList();
        newsLiveData.setValue(newsArrayList);
    }

    public void populateList(){

        News news;

        newsArrayList = new ArrayList<>();
    }
}
