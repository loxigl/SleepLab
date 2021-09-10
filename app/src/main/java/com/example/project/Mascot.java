package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Mascot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascot);
        String name= getIntent().getStringExtra("Name");
        String age=getIntent().getStringExtra("Age");
        TextView s=(TextView) findViewById(R.id.textView7);
        s.setText("Привет, "+name+System.getProperty("line.separator")+"Я Лисенок,маскот SleepLab");


    }
}