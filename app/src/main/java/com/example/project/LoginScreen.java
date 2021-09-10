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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn=(Button) findViewById(R.id.button);
        /*EditText s1= (EditText) findViewById(R.id.name);
        EditText s2= (EditText) findViewById(R.id.age) ;
        str1=s1.getText().toString();
        str2=s2.getText().toString();*/


        btn.setOnClickListener(view -> {
            Intent intent = new Intent(LoginScreen.this, MainScreen.class);
            EditText s1= (EditText) findViewById(R.id.name);
            EditText s2= (EditText) findViewById(R.id.age) ;
            str1=s1.getText().toString();
            str2=s2.getText().toString();
            intent.putExtra("Name",str1);
            intent.putExtra("Age",str2);
            startActivity(intent);


        });
    }
    ImageButton button;
   public void onClick(View view)
   {


       Toast.makeText(this, "Пол выбран", Toast.LENGTH_SHORT).show();
   }

}
