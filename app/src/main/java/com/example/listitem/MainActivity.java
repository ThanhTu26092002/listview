package com.example.listitem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<MonAn> arrayList;
        AdapterMonan adapter;

         listview = findViewById(R.id.listviewmonan);

        arrayList = new ArrayList<>();
        arrayList.add(new MonAn( "mỳ xào", "Đơn giá: 50000NVD", R.drawable.img));
        arrayList.add(new MonAn( "lẫu", "Đơn giá: 100000NVD", R.drawable.img_1));

        adapter = new AdapterMonan(MainActivity.this,R.layout.layout_monan,arrayList);
        listview.setAdapter(adapter)







}
}