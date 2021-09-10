package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class LoginScreen extends AppCompatActivity {
    private Button btn;
    private SharedPreferences name;
    private SharedPreferences age;
    private SharedPreferences gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(LoginScreen.this, MainScreen.class);
            startActivity(intent);


        });
    }
    ImageButton button;
   public void onClick(View view)
   {

       Toast.makeText(this, "Пол Выбран", Toast.LENGTH_SHORT).show();
   }

}
