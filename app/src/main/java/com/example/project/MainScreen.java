package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {
    private static final String MY_PREFS_NAME ="login" ;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    public String name;
    public String age;
    public Boolean man;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        name=prefs.getString("name","");
        age=prefs.getString("age","");
        btn1=(Button)findViewById(R.id.grafButton);
        btn2=(Button)findViewById(R.id.opthionsButton);
        btn3=(Button)findViewById(R.id.maskotButton) ;
        TextView s=(TextView) findViewById(R.id.textView3);
        TextView s2=(TextView)findViewById(R.id.textView6);
        TextView s3=(TextView)findViewById(R.id.textView8);
        Boolean check=prefs.getBoolean("man",false);
        if (check)
        {
            s3.setText("Проходи в нашу мужскую кампанию");

        }
        else
        {
            s3.setText("Это клуб Без Баб, мы не любим женщин");
        }
        s.setText("Здравствуйте, "+name);
        s2.setText("Вы так молодо выглядите в свои "+age);


        btn1.setOnClickListener(view -> {
            Intent intent1 = new Intent (MainScreen.this, Stats.class);
            startActivity(intent1);


        });
        btn2.setOnClickListener(view1 -> {
            Intent intent2 = new Intent(MainScreen.this, Settings.class);
            startActivity(intent2);


        });
        btn3.setOnClickListener(view2 -> {
            Intent intent3 = new Intent(MainScreen.this, Mascot.class);
            intent3.putExtra("Name",name);
            intent3.putExtra("Age",age);
            startActivity(intent3);


        });
    }
}