package com.example.intentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Intent2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
        textView=findViewById(R.id.mobile);

        String a=getIntent().getStringExtra("happy");

        textView.setText(a);
    }
}