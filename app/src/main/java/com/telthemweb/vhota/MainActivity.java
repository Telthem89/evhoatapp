package com.telthemweb.vhota;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //http://172.16.2.182/evote/
        mywebview = (WebView)findViewById(R.id.webView);
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("https://telthemweb.co.zw");
        mywebview.setWebViewClient(new WebViewClient());

    }
    @Override
    public void onBackPressed(){
        if(mywebview.canGoBack()) {
            mywebview.goBack();
        } else
        {
            super.onBackPressed();
        }
    }
}
