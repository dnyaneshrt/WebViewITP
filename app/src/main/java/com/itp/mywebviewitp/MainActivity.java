package com.itp.mywebviewitp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
WebView webView;
ImageButton btn_yt,btn_lkn,btn_search,btn_java,btn_google;
EditText et_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.webview);
        btn_yt=findViewById(R.id.btn_youtube);
        btn_lkn=findViewById(R.id.btn_linked);
        btn_search=findViewById(R.id.btn_search);
        btn_java=findViewById(R.id.btn_java);
        btn_google=findViewById(R.id.btn_java);
        et_url=findViewById(R.id.et_url);

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
                webView.loadUrl("https://www.javatpoint.com/");
            }break;
        }
    }
}