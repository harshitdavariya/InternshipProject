package com.example.akashproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {

    private GridView gridView;
    private String MobCom[]={"Chhichhore","War","Dabangg","Sanam Re","Rockstar","Baahubali","Saaho",
            "Robot","2.0","Bhavesh Joshi","Sholay","Jai Ho","Raid","Tanhaji","3 Idiots","pk","Race",
            "Housefull","Golmaal","Suryavanshi","Good Newz","Dilwaale","ABCD","Holiday","Dhamaal","Dhol"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView=findViewById(R.id.gridview);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>
                (GridViewActivity.this, android.R.layout.simple_list_item_1,MobCom);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), MobCom[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}