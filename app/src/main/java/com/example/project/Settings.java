package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

public class Settings extends AppCompatActivity {

    private static final String MY_PREFS_NAME ="login" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Button btn = findViewById(R.id.reset);
        // SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);




        btn.setOnClickListener(view -> {
            Intent intent = new Intent(Settings.this, LoginScreen.class);
            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit().clear();
            editor.clear();
            editor.apply();
            startActivity(intent);


    });

}
}