package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.webkit.WebView;

public class Five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        WebView webView=findViewById(R.id.webbruh);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://open.spotify.com/embed/playlist/37i9dQZF1DWVi45nh2EuPP");

    }
}