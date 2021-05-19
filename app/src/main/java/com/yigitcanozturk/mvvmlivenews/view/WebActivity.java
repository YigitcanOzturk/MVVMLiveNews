package com.yigitcanozturk.mvvmlivenews.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.yigitcanozturk.mvvmlivenews.R;

public class WebActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        // call and load url
        String url = getIntent().getStringExtra("url");
        webView = findViewById(R.id.webView);
        webView.loadUrl(url);

    }
}