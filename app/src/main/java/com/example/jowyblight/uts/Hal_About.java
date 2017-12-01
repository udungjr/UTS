package com.example.jowyblight.uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Hal_About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal__about);

        WebView browser = (WebView) findViewById(R.id.about);
        browser.loadData("" +
                "<html>" +
                " <body>" +
                " <title>About Aplikasi </title>" +
                "<p>" +
                "Aplikasi ini aplikasi<br/>" +
                "pencatatan waktu olahraga<br/>" +
                "</p>" +
                "<p>" +
                "Aplikasi ini dibuat oleh :<br/>" +
                "</p>" +
                "<p>" +
                "1106075 - Mikhail Yazid Bustomi<br/>" +
                "1406117 - Sofyan Satia Ritonga<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");
    }
}
