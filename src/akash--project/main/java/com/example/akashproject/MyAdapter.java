package com.example.akashproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context context;
    String year[];
    String name[];
    LayoutInflater layoutInflater;

    public MyAdapter(Context context, String year[], String[] name) {
        this.context = context;
        this.year = year;
        this.name = name;
        layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return year.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.row_list_view, null);

        TextView textView1 =(TextView) convertView.findViewById(R.id.item_name_movie);
        TextView textView2 =(TextView) convertView.findViewById(R.id.item_year);

        textView2.setText(year[position]);
        textView1.setText(name[position]);

        return convertView;
    }
}
