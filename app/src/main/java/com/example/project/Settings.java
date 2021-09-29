package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Settings extends AppCompatActivity {

    private static final String MY_PREFS_NAME ="login" ;
    private static final String MY_PREFS_NAME2 ="Graphs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button btn = findViewById(R.id.reset);
        Button btn1=findViewById(R.id.resetSleep);
        Button btn2=findViewById(R.id.homebtn);



        // SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);




        btn.setOnClickListener(view -> {
            Intent intent = new Intent(Settings.this, LoginScreen.class);
            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit().clear();
            SharedPreferences.Editor editor2=getSharedPreferences(MY_PREFS_NAME2,MODE_PRIVATE).edit().clear();
            editor.apply();
            startActivity(intent);


    });
        btn1.setOnClickListener(view -> {
            SharedPreferences.Editor editor2=getSharedPreferences(MY_PREFS_NAME2,MODE_PRIVATE).edit().clear();
            Toast.makeText(Settings.this,"Успешно сброшенно",Toast.LENGTH_SHORT).show();
            editor2.apply();
        });

        btn2.setOnClickListener(view -> {
            Intent intent1 =new Intent(Settings.this, MainScreen.class);
            startActivity(intent1);
        });





}


    public void onClick2(View view)
    {
        @SuppressLint("CommitPrefEdits")

        SharedPreferences.Editor editor1=getSharedPreferences("themes",MODE_PRIVATE).edit();

        switch (view.getId()) {
            case R.id.day:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                editor1.putInt("theme state",1);
                break;
            case R.id.night:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                editor1.putInt("theme state",2);
                break;
            default:
                break;
        }
    }
}