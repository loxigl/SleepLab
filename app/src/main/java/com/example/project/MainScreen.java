package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    public String name;
    public String age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.grafButton);
        btn2=(Button)findViewById(R.id.opthionsButton);
        btn3=(Button)findViewById(R.id.maskotButton) ;
        Intent firstint=getIntent();
        name= getIntent().getStringExtra("Name");
        age=getIntent().getStringExtra("Age");
        TextView s=(TextView) findViewById(R.id.textView3);
        TextView s2=(TextView)findViewById(R.id.textView6);
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