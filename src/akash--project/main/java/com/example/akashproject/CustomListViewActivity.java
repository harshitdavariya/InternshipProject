package com.example.akashproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListViewActivity extends AppCompatActivity {

    private ListView listView;
    private String []year = {"2013", "2013", "2014", "2018", "2006", "2019", "2019"};
    private String []name = {"Yeh Jawaani Hai Deewani", "Rangrezz", "Yaariyan", "Padmaavat", "Don", "Chhichhore", "War"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listView=findViewById(R.id.clview);
        MyAdapter myAdapter = new MyAdapter(CustomListViewActivity.this,year,name);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(CustomListViewActivity.this, DetailedListViewActivity.class);
            intent.putExtra("year",year[position]);
            intent.putExtra("name",name[position]);
            startActivity(intent);
        });
    }
}