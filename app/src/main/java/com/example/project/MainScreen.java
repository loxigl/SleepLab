package com.example.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
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
        ImageView mImageView = findViewById(R.id.imageView36);
        mImageView.setImageResource(R.drawable.sandwiches);
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        SharedPreferences theme_check=getSharedPreferences("themes",MODE_PRIVATE);
        Integer a=theme_check.getInt("theme",3);
        switch (a) {
            case 1:
                 AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;
            case 2:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
            default:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_UNSPECIFIED);
                break;
        }
        /* AppCompatDelegate.setDefaultNightMode(a);*/

        int abc = -100;

        if (abc < 0) {
            mImageView.setImageResource(R.drawable.vodka);
        }
        if (abc > 0) {
            mImageView.setImageResource(R.drawable.olives);
        }


        Boolean check1=prefs.getBoolean("userRegistered",false);
        if (!check1)
        {
            Intent intentlog = new Intent(MainScreen.this, LoginScreen.class);
            startActivity(intentlog);
        }
        name=prefs.getString("name","");
        age=prefs.getString("age","");
        btn1=(Button)findViewById(R.id.grafButton);
        btn2=(Button)findViewById(R.id.opthionsButton);
        btn3=(Button)findViewById(R.id.maskotButton) ;
        TextView s=(TextView) findViewById(R.id.topmain);
        s.setText("С возвращением, "+System.getProperty ("line.separator")+name+"!");


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
    public void onBackPressed() {

        openQuitDialog();
    }
    private void openQuitDialog() {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(
                MainScreen.this);
        quitDialog.setTitle("Выход: Вы уверены?");

        quitDialog.setPositiveButton("Да!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                Intent i = new Intent(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_HOME);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        quitDialog.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        quitDialog.show();
    }

}