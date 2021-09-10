package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Stats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        Button btn=findViewById(R.id.pasha);
        btn.setOnClickListener(view -> {

            Intent intent=new Intent(Stats.this,Five.class);
            startActivity(intent);
        });
    }
}