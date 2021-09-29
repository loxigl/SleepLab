package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Get extends AppCompatActivity {

    private static final String MY_PREFS_NAME = "login";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);
        Button btn=findViewById(R.id.active);
        SharedPreferences  myPrefs = getSharedPreferences("login", Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = myPrefs.edit();

        btn.setOnClickListener(view -> {
            EditText time = findViewById(R.id.sleeeptime);
            String a = time.getText().toString();
            Integer value=Integer.parseInt(a);
            if (value>24 | value<1) {
                Toast.makeText(Get.this,"Введите правильное значение(от 1 до 24",Toast.LENGTH_LONG).show();
            }
            else{
         Intent intent=new Intent(Get.this,Stats.class);

            intent.putExtra("Sleep",value);

         startActivity(intent);}
        });



    }
    public void onBackPressed()
    {
        Intent bruh=new Intent(Get.this, MainScreen.class);
        startActivity(bruh);
    }
}