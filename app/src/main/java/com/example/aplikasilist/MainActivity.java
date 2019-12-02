package com.example.aplikasilist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AdapterGoogle adapterBuah;
    RecyclerView rvMain;
    ArrayList<ModelGoogle> arrayList;
    int count = 0;

    private String[] id = {
            "Gmail",
            "Youtube",
            "G Docs",
            "G Maps",
            "G Drive",
            "G Photo",
            "G Playstore",
            "G Translate",
            "G Classroom",
            "G Hangouts"};

    private String[] judul = {
            "Gmail",
            "Youtube",
            "Google Docs",
            "Google Maps",
            "Google Drive",
            "Google Photo",
            "Google Playstore",
            "Google Translate",
            "Google Classroom",
            "Google Hangouts"};

    private int[] gambar = {
            R.drawable.gmail,
            R.drawable.yt,
            R.drawable.logodocs,
            R.drawable.logomaps,
            R.drawable.logodrive,
            R.drawable.photo,
            R.drawable.logoplaystore,
            R.drawable.translate,
            R.drawable.logoclass,
            R.drawable.logohangout,};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMain = findViewById(R.id.rvMain);
        arrayList = new ArrayList<>();
        adapterBuah = new AdapterGoogle(arrayList);
        setData();
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        rvMain.setAdapter(adapterBuah);

    }

    private void setData(){
        int count = 0;
        for(String id : id){
            arrayList.add(new ModelGoogle(id,judul[count],gambar[count]));
            count++;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                startActivity(new Intent(MainActivity.this, About.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
