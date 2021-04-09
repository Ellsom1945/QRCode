package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        String text=getIntent().getStringExtra("context");
        System.out.println(text);
        ((TextView)findViewById(R.id.textView)).setText(text);
    }
}