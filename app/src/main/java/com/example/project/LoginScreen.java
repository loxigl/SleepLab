package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ImageButton;
import android.widget.Toast;


public class LoginScreen extends AppCompatActivity {
    private String str1;
    private String str2;
    public static final String MY_PREFS_NAME="login";
    private Boolean test=false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btn = findViewById(R.id.button);
       // SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);





        btn.setOnClickListener(view -> {
            Intent intent = new Intent(LoginScreen.this, MainScreen.class);
            EditText s1= findViewById(R.id.name);
            EditText s2= findViewById(R.id.age);

            str1 = s1.getText().toString();
            str2=s2.getText().toString();



            if (str1.length()!=0 & str2.length()!=0 & test & str1.matches("[a-zA-zа-яА-Я]+")) {
                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                editor.putBoolean("userRegistered", true);
                editor.putString("name",str1);
                editor.putString("age",str2);
                editor.apply();
                startActivity(intent);
            }
            else
            {
                Toast.makeText(this, "Поля заполнены неверно", Toast.LENGTH_SHORT).show();
            }




        });
    }

   @SuppressLint("NonConstantResourceId")
   public void onClick(View view)
   {
       SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
       switch (view.getId()) {
           case R.id.men:
               test=true;
               editor.putBoolean("man",true);
               editor.apply();
               break;
           case R.id.women:
               test=true;
               editor.putBoolean("man",false);
               editor.apply();
               break;
           default:
               break;
       }
       Toast.makeText(this, "Пол выбран", Toast.LENGTH_SHORT).show();
   }
    public void onBackPressed() {

    }

   ImageButton button;

    public void onClick1(View v) {
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();

        Drawable dr = getResources().getDrawable(R.drawable.womenpress);
        Drawable dr1=getDrawable(R.drawable.manpress);


        switch (v.getId()) {
            case R.id.men:

                if (button == null) {
                    button = (ImageButton) findViewById(v.getId());

                } else {
                    button.setBackgroundResource(R.drawable.press);
                    button = (ImageButton) findViewById(v.getId());
                }
                button.setBackground(dr1);
                test=true;
                editor.putBoolean("man",true);
                editor.apply();
                break;



            case R.id.women:
                if (button == null) {
                    button = (ImageButton) findViewById(v.getId());
                } else {
                    button.setBackgroundResource(R.drawable.press);
                    button = (ImageButton) findViewById(v.getId());
                }
                button.setBackground(dr);
                test=true;
                editor.putBoolean("man",false);
                editor.apply();

                break;

            default:
                break;
        }
    }


}
