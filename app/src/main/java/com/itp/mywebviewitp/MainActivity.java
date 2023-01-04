package com.itp.mywebviewitp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
WebView webView;
ImageButton btn_yt,btn_lkn,btn_search,btn_java,btn_google;
EditText et_url;
ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //loadUrl method is used to Load web pages into our application

        webView=findViewById(R.id.webview);
        btn_yt=findViewById(R.id.btn_youtube);
        btn_lkn=findViewById(R.id.btn_linked);
        btn_search=findViewById(R.id.btn_search);
        btn_java=findViewById(R.id.btn_java);
        btn_google=findViewById(R.id.btn_java);
        et_url=findViewById(R.id.et_url);
        progressBar=findViewById(R.id.progressBar);

        //it provides 3 methods.
        //progress bar
        webView.setWebViewClient(new WebViewClient()
                                 {
                                     @Override
                                     public void onPageStarted(WebView view, String url, Bitmap favicon) {
                                         super.onPageStarted(view, url, favicon);
                                         progressBar.setVisibility(View.VISIBLE);
                                     }

                                     @Override
                                     public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest url) {
                                         Toast.makeText(MainActivity.this,"URL: "+url,Toast.LENGTH_LONG).show();
                                         return super.shouldOverrideUrlLoading(view, url);

                                     }

                                     @Override
                                     public void onPageFinished(WebView view, String url) {
                                         super.onPageFinished(view, url);
                                         progressBar.setVisibility(View.GONE);
                                     }
                                 }
        );

        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);

    }
    public  void loadData(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_search:{} break;
            case R.id.btn_youtube:{
                webView.loadUrl("https://www.javatpoint.com/");
            }break;
            case R.id.btn_linked:{
                webView.loadUrl("https://www.javatpoint.com/");
            }break;
            case R.id.btn_java:{
                webView.loadUrl("https://www.javatpoint.com/");
            }break;
            case R.id.btn_google:{
                webView.loadUrl("https://www.google.com/");
            }break;
        }
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        super.onBackPressed();
    }
}