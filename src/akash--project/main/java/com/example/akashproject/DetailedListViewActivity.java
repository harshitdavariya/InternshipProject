package com.example.akashproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedListViewActivity extends AppCompatActivity {

    private TextView textview1;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_list_view);

        textView=findViewById(R.id.item_name);
        textview1=findViewById(R.id.item_year1);

        Intent intent = getIntent();
        String year = intent.getStringExtra("year");
        textview1.setText(year);

        String name=intent.getStringExtra("name");
        textView.setText(name);

    }
}