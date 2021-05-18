package com.yigitcanozturk.mvvmlivenews.model;

public class News {
    String title;
    String description;
    String url;
    String address;
    News(String title,String description,String url,String address){
        this.title = title;
        this.description = description;
        this.url = url;
        this.address = address;
    }

    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getURL(){
        return url;
    }
    public String getAddress(){
        return address;
    }
}
