
package com.example.baitonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Nguyenvandiem extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nguyenvandiem);

        TextView textView = findViewById(R.id.th1);
        TextView textview7 = findViewById(R.id.th8);
        TextView textview8 = findViewById(R.id.th9);
        TextView textview10 = findViewById(R.id.th11);
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(Nguyenvandiem.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

}