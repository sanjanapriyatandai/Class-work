package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    RecyclerView rec;
    String games[];
    String versions[];
    int images[];
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec=findViewById(R.id.rv);
        games=getResources().getStringArray(R.array.title);
        versions=getResources().getStringArray(R.array.subtitle);

        images=new int[]{R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_background,
        };

        adapter=new MyAdapter(this,games,versions,images);
        rec.setLayoutManager(new LinearLayoutManager(this));
        rec.setAdapter(adapter);
    }

}