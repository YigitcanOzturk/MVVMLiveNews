package com.yigitcanozturk.mvvmlivenews.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NewsResponseModel {
    @SerializedName("status")
    private String status;
    @SerializedName("totalResults")
    private int totalResults;
    @SerializedName("articles")
    private ArrayList<News> news = null;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    public ArrayList<News> getNews() {
        return news;
    }
    public void setNews(ArrayList<News> news) {
        this.news = news;
    }
}
