package com.example.intentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button explicit;

    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e=findViewById(R.id.et1);

        explicit = findViewById(R.id.b1);

        explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this, Intent2.class);

                startActivity(i1);

            }
        });
    }
    public void browser(View v) {
        Uri uri=Uri.parse("https://www.google.com/");
        Intent i2=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i2);
    }

    public void msgdata(View view) {
      String m= e.getText().toString();

      Intent i=new Intent(MainActivity.this,Intent2.class);
      i.putExtra("happy",m);
      startActivity(i);
    }
}