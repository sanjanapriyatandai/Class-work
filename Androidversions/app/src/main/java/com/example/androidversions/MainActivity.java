package com.example.androidversions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.androidversions.MyAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView rec;
    String name[];
    String versions[];
    int images[];
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec=findViewById(R.id.rv);
        name=getResources().getStringArray(R.array.title);
        versions=getResources().getStringArray(R.array.subtitle);

        images=new int[]{R.drawable.nocodename,
                R.drawable.nocodename1,
                R.drawable.cupcake,
                R.drawable.donut,
                R.drawable.eclair,
                R.drawable.froyo,
                R.drawable.gingerbread,
                R.drawable.honeycomb,
                R.drawable.icecreamsandwich,
                R.drawable.jellybean,
                R.drawable.kitkat,
                R.drawable.lollipop,
                R.drawable.marshmellow,
                R.drawable.nougat,
                R.drawable.nougat1,
                R.drawable.oreo,
                R.drawable.oreo1,
                R.drawable.pie,
                R.drawable.android10,
                R.drawable.android11};
        adapter=new MyAdapter(this,name,versions,images);
        rec.setLayoutManager(new LinearLayoutManager(this));
        rec.setAdapter(adapter);
    }

}