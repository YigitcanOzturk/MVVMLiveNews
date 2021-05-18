package com.yigitcanozturk.mvvmlivenews.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewsViewModel extends ViewModel {
    public MutableLiveData<String> title = new MutableLiveData<>();
    public MutableLiveData<String> description = new MutableLiveData<>();
    public MutableLiveData<String> url = new MutableLiveData<>();
    public MutableLiveData<String> address = new MutableLiveData<>();
}
