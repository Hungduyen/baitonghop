package com.example.baitonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
//    Button buttondangxuat;
    ListView listView;
    ArrayList<Monan> arrayList;
    Adapter_monan adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listviewmonan);
        arrayList = new ArrayList<>();
        arrayList.add(new Monan( "Lớp 10","Bộ sách giáo khoa lớp 10",R.drawable.lop10));
        arrayList.add(new Monan( "Lớp 11","Bộ sách giáo khoa lớp 11",R.drawable.lop11));
        arrayList.add(new Monan( "Lớp 12","Bộ sách giáo khoa lớp 12",R.drawable.lop12));

        adapter = new Adapter_monan( MainActivity2.this,R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,MainActivity4.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,MainActivity5.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,MainActivity6.class);
                    startActivity(intent);
                }
            }
        });
//        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//                deleteData(position);
//                return false;
//            }
//        });

//        ButtonControl();
    }
//    private void ButtonControl(){
//        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
//        startActivity(intent);
//    }
}