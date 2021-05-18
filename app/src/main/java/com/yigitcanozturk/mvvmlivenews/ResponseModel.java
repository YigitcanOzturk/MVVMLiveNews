package com.yigitcanozturk.mvvmlivenews;

import com.google.gson.annotations.SerializedName;
import com.yigitcanozturk.mvvmlivenews.model.News;

import java.util.ArrayList;

public class ResponseModel {
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
    public void setNews(ArrayList<News> articles) {
        this.news = news;
    }
}
