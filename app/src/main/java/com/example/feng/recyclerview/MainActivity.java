package com.example.feng.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Recycler> recyclerList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecycler();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerAdapter adapter=new RecyclerAdapter(recyclerList);
        recyclerView.setAdapter(adapter);
    }

    private void initRecycler() {
        for(int i=0;i<2;i++){
            Recycler liu_a=new Recycler("LiuYifei",R.drawable.a);
            recyclerList.add(liu_a);
            Recycler liu_b=new Recycler("LiuYifei",R.drawable.b);
            recyclerList.add(liu_b);
            Recycler liu_c=new Recycler("LiuYifei",R.drawable.c);
            recyclerList.add(liu_c);
            Recycler liu_d=new Recycler("LiuYifei",R.drawable.d);
            recyclerList.add(liu_d);
            Recycler liu_e=new Recycler("LiuYifei",R.drawable.e);
            recyclerList.add(liu_e);
            Recycler liu_f=new Recycler("LiuYifei",R.drawable.f);
            recyclerList.add(liu_f);
            Recycler liu_g=new Recycler("LiuYifei",R.drawable.g);
            recyclerList.add(liu_g);
            Recycler liu_h=new Recycler("LiuYifei",R.drawable.h);
            recyclerList.add(liu_h);
            Recycler liu_i=new Recycler("LiuYifei",R.drawable.i);
            recyclerList.add(liu_i);

        }

    }
}
