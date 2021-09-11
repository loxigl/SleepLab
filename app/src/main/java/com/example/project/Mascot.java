package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Mascot extends AppCompatActivity {
    private static final String MY_PREFS_NAME ="login" ;
    String name,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascot);
        TextView s=(TextView) findViewById(R.id.textView7);
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        name=prefs.getString("name","");
        age=prefs.getString("age","");
        s.setText("Привет, "+name+System.getProperty("line.separator")+"Я Лисенок,маскот SleepLab");


    }
}