package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        Button btn1=findViewById(R.id.back_tips);
        Button btn2=findViewById(R.id.go);

        TextView text = findViewById(R.id.tip);
        Intent intent = getIntent();
        SharedPreferences sharedPreference=getSharedPreferences("login", MODE_PRIVATE);
        int a=sharedPreference.getInt("score",0);
        String b=Integer.toString(a);
        Toast toast=Toast.makeText(getApplicationContext(),b,Toast.LENGTH_SHORT);
        toast.show();

        if (a != 0) {
            btn1.setClickable(false);
            btn1.setVisibility(View.GONE);
            btn2.setClickable(false);
            btn2.setVisibility(View.GONE);
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
        Intent intent=new Intent(Tips.this,Mascot.class);
        startActivity(intent);

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