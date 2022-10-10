package com.example.baitonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    ListView listView;
    ArrayList<lop10> arrayList;
    Adapter_lop10 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listviewlop10);
        arrayList = new ArrayList<>();
        arrayList.add(new lop10( "Lớp 10","Bộ sách giáo khoa lớp 10",R.drawable.lop10));
        arrayList.add(new lop10( "Lớp 11","Bộ sách giáo khoa lớp 11",R.drawable.lop11));
        arrayList.add(new lop10( "Lớp 12","Bộ sách giáo khoa lớp 12",R.drawable.lop12));

        adapter = new Adapter_lop10( MainActivity4.this,R.layout.layout_lop10, arrayList);
        listView.setAdapter(adapter);


    }
}