package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        s.setText("Привет, "+name+", чем я могу тебе помочь?");


    }
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.tips:
                Intent intent1=new Intent(Mascot.this,Tips.class);
                startActivity(intent1);

                break;
            case R.id.test:
                Intent intent2=new Intent(Mascot.this,Test.class);
                startActivity(intent2);

                break;
            default:
                break;

            case R.id.qaa:
                Intent intent3 =new Intent(Mascot.this,QaA.class);
                startActivity(intent3);

                break;
        }
    }
    public void onBackPressed() {
        // super.onBackPressed();
        Intent intent=new Intent(Mascot.this,MainScreen.class);
        startActivity(intent);

    }
}