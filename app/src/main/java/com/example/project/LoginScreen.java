package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class LoginScreen extends AppCompatActivity {
    private Button btn;
    private SharedPreferences name;
    private SharedPreferences age;
    private SharedPreferences gender;
    private String str1;
    private String str2;
    public static final String MY_PREFS_NAME="login";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn=(Button) findViewById(R.id.button);
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);




        btn.setOnClickListener(view -> {
            Intent intent = new Intent(LoginScreen.this, MainScreen.class);
            EditText s1= (EditText) findViewById(R.id.name);
            EditText s2= (EditText) findViewById(R.id.age) ;
            str1=s1.getText().toString();
            str2=s2.getText().toString();
            /*intent.putExtra("Name",str1);
            intent.putExtra("Age",str2);*/
            startActivity(intent);
            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
            editor.putBoolean("userRegistered", true);
            editor.putString("name",str1);
            editor.putString("age",str2);
            editor.apply();


        });
    }
    ImageButton button;
   public void onClick(View view)
   {
       SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
       switch (view.getId()) {
           case R.id.men:

               editor.putBoolean("man",true);
               editor.apply();
               break;
           case R.id.women:
               editor.putBoolean("man",false);
               editor.apply();
               break;
           default:
               break;
       }
       Toast.makeText(this, "Пол выбран", Toast.LENGTH_SHORT).show();
   }



}
