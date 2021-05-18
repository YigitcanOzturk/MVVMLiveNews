package com.yigitcanozturk.mvvmlivenews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yigitcanozturk.mvvmlivenews.model.News;
import com.yigitcanozturk.mvvmlivenews.viewmodel.NewsViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MainActivity context;
    RecyclerView recyclerView;
    NewsViewModel viewModel;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        viewModel = new ViewModelProvider(this).get(NewsViewModel.class);
        viewModel.getUserMutableLiveData().observe(context, newsListUpdateObserver);
    }

    Observer<ArrayList<News>> newsListUpdateObserver = new Observer<ArrayList<News>>() {
        @Override
        public void onChanged(final ArrayList<News> newsArrayList) {
            recyclerViewAdapter = new RecyclerViewAdapter(context,newsArrayList);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(recyclerViewAdapter);
        }
    };
}