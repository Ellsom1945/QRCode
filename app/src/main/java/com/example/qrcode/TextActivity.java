package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        String text=getIntent().getStringExtra("context");
        String s= "<big><big><big>"+text+"</big></big></big>";
        ((TextView)findViewById(R.id.textView)).setText(Html.fromHtml(s));
    }
}