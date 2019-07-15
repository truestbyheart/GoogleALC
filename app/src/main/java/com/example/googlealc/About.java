package com.example.googlealc;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("About ALC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView AboutWebPage = (WebView) findViewById(R.id.AndelaALCPage);
        AboutWebPage.setWebViewClient(new WvClient());
        AboutWebPage.loadUrl("https://andela.com/alc/");

        WebSettings webSettings =AboutWebPage.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

}

