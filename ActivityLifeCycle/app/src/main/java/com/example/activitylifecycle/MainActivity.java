package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 TextView textView;

 @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    textView=findViewById(R.id.text);
    textView.append("onCreate()\n");
     Log.i("MainActivity","OnCreate()");
     Toast.makeText(this, "App is created", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.append("onStart()\n");
        Log.i("MainActivity","OnStart()");
        Toast.makeText(this, "App is Started", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.append("onResume()\n");
        Log.i("MainActivity","OnResume()");
        Toast.makeText(this, "App is Resumed", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.append("onPause()\n");
        Log.i("MainActivity","OnPause()");
        Toast.makeText(this, "App is Paused", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        textView.append("onStop()\n");
        Log.i("MainActivity","OnStop()");
        Toast.makeText(this, "App is Stoped", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.append("onRestart()\n");
        Log.i("MainActivity","OnRestart()");
        Toast.makeText(this, "App is Restarted", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.append("onDestroy()\n");
        Log.i("MainActivity","OnDestroy()");
        Toast.makeText(this, "App is Destroyed", Toast.LENGTH_SHORT).show();




    }
}