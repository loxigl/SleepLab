package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        TextView text = findViewById(R.id.tip);
        Intent intent = getIntent();
        int a = intent.getIntExtra("score", 0);
        if (a != 0) {
            if (a <= 30) {
                /*text.setTextSize(20);*/
                text.setText("Вам нужно срочно исправлять ваш режим сна и как минимум спать на 4-5 часов больше");
            } else {
                if (a <= 50) {
                    /*text.setTextSize(20);*/
                    text.setText("Вы неплохо спали сегодня, но советовал бы продлить сон на 1-2 часа");
                } else {
                    text.setText("Вы отлично выспались сегодня, продолжайте в том же духе");

                }
            }
        }

    }

    @Override
    public void onBackPressed() {
        // super.onBackPressed();

    }

    public void onClick1(View v) {
        switch (v.getId()) {
            case R.id.back_tips:
                Intent intent = new Intent(Tips.this, MainScreen.class);
                startActivity(intent);
                break;
            case R.id.go:
                Intent intent1 = new Intent(Tips.this, Test.class);
                startActivity(intent1);
                break;
            default:
                break;
        }

    }
}