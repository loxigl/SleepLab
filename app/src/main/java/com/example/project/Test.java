package com.example.project;

import static java.lang.String.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Test extends AppCompatActivity {
    int b=0;
    int score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        TextView timer=findViewById(R.id.timer);
        ImageView pos1=findViewById(R.id.pos1);
        ImageView pos2=findViewById(R.id.pos2);
        ImageView pos3=findViewById(R.id.pos3);
        ImageView pos4=findViewById(R.id.pos4);
        ImageView pos5=findViewById(R.id.pos5);
        ImageView pos6=findViewById(R.id.pos6);
        ImageView pos7=findViewById(R.id.pos7);
        ImageView pos8=findViewById(R.id.pos8);
        ImageView pos9=findViewById(R.id.pos9);
        ImageView pos10=findViewById(R.id.pos10);
        ImageView pos11=findViewById(R.id.pos11);
        ImageView pos12=findViewById(R.id.pos12);
        TextView text_score=findViewById(R.id.score);


        pos1.setImageResource(R.color.trans);
        pos1.setClickable(false);
        pos2.setImageResource(R.color.trans);
        pos2.setClickable(false);
        pos3.setImageResource(R.color.trans);
        pos3.setClickable(false);
        pos4.setImageResource(R.color.trans);
        pos4.setClickable(false);
        pos5.setImageResource(R.color.trans);
        pos5.setClickable(false);
        pos6.setImageResource(R.color.trans);
        pos6.setClickable(false);
        pos7.setImageResource(R.color.trans);
        pos7.setClickable(false);
        pos8.setImageResource(R.color.trans);
        pos8.setClickable(false);
        pos9.setImageResource(R.color.trans);
        pos10.setClickable(false);
        pos10.setImageResource(R.color.trans);
        pos11.setImageResource(R.color.trans);
        pos11.setClickable(false);
        pos12.setImageResource(R.color.trans);
        pos12.setClickable(false);





        Button but=findViewById(R.id.start);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setClickable(false);
                view.setVisibility(View.GONE);
                pos8.setClickable(true);
                pos8.setImageResource(R.drawable.mascot_game);
                new CountDownTimer(20000, 1000) {
