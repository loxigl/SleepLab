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

                    //Здесь обновляем текст счетчика обратного отсчета с каждой секундой
                    public void onTick(long millisUntilFinished) {
                        timer.setText("Осталось: "+ millisUntilFinished / 1000);
                    }


                    public void onFinish() {
                        SharedPreferences.Editor editor = getSharedPreferences("login", MODE_PRIVATE).edit();
                        editor.putInt("score",score);
                        Intent intent=new Intent(Test.this, Tips.class);
                        intent.putExtra("score",score);
                        startActivity(intent);

                    }
                }
                        .start();

            }
        });


    }
    public void onClick2(View v)
    {
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


        final Random random=new Random();


        int a=random.nextInt(12)+1;
        while (a==b) {
            a = random.nextInt(12) + 1;
        }
        b=a;
        switch (a){
            case 1:
                pos1.setImageResource(R.drawable.mascot_game);
                pos1.setClickable(true);
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
                break;
            case 2:
                pos2.setImageResource(R.drawable.mascot_game);
                pos2.setClickable(true);
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
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
                pos9.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos10.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos12.setImageResource(R.color.trans);
                pos12.setClickable(false);
                break;
            case 3:
                pos3.setImageResource(R.drawable.mascot_game);
                pos3.setClickable(true);
                pos2.setImageResource(R.color.trans);
                pos2.setClickable(false);
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
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
                pos9.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos10.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos12.setImageResource(R.color.trans);
                pos12.setClickable(false);
                break;
            case 4:
                pos4.setImageResource(R.drawable.mascot_game);
                pos4.setClickable(true);
                pos2.setImageResource(R.color.trans);
                pos2.setClickable(false);
                pos3.setImageResource(R.color.trans);
                pos3.setClickable(false);
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
                pos5.setImageResource(R.color.trans);
                pos5.setClickable(false);
                pos6.setImageResource(R.color.trans);
                pos6.setClickable(false);
                pos7.setImageResource(R.color.trans);
                pos7.setClickable(false);
                pos8.setImageResource(R.color.trans);
                pos8.setClickable(false);
                pos9.setImageResource(R.color.trans);
                pos9.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos10.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos12.setImageResource(R.color.trans);
                pos12.setClickable(false);
                break;
            case 5:
                pos5.setImageResource(R.drawable.mascot_game);
                pos5.setClickable(true);
                pos2.setImageResource(R.color.trans);
                pos2.setClickable(false);
                pos3.setImageResource(R.color.trans);
                pos3.setClickable(false);
                pos4.setImageResource(R.color.trans);
                pos4.setClickable(false);
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
                pos6.setImageResource(R.color.trans);
                pos6.setClickable(false);
                pos7.setImageResource(R.color.trans);
                pos7.setClickable(false);
                pos8.setImageResource(R.color.trans);
                pos8.setClickable(false);
                pos9.setImageResource(R.color.trans);
                pos9.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos10.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos12.setImageResource(R.color.trans);
                pos12.setClickable(false);
                break;
            case 6:
                pos6.setImageResource(R.drawable.mascot_game);
                pos6.setClickable(true);
                pos2.setImageResource(R.color.trans);
                pos2.setClickable(false);
                pos3.setImageResource(R.color.trans);
                pos3.setClickable(false);
                pos4.setImageResource(R.color.trans);
                pos4.setClickable(false);
                pos5.setImageResource(R.color.trans);
                pos5.setClickable(false);
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
                pos7.setImageResource(R.color.trans);
                pos7.setClickable(false);
                pos8.setImageResource(R.color.trans);
                pos8.setClickable(false);
                pos9.setImageResource(R.color.trans);
                pos9.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos10.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos12.setImageResource(R.color.trans);
                pos12.setClickable(false);
                break;
            case 7:
                pos7.setImageResource(R.drawable.mascot_game);
                pos7.setClickable(true);
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
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
                pos8.setImageResource(R.color.trans);
                pos8.setClickable(false);
                pos9.setImageResource(R.color.trans);
                pos9.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos10.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos12.setImageResource(R.color.trans);
                pos12.setClickable(false);
                break;
            case 8:
                pos8.setImageResource(R.drawable.mascot_game);
                pos8.setClickable(true);
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
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
                pos9.setImageResource(R.color.trans);
                pos9.setClickable(false);
                pos10.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos12.setClickable(false);
                pos12.setImageResource(R.color.trans);
                break;
            case 9:
                pos9.setImageResource(R.drawable.mascot_game);
                pos9.setClickable(true);
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
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos10.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos12.setImageResource(R.color.trans);
                pos12.setClickable(false);
                break;
            case 10:
                pos10.setImageResource(R.drawable.mascot_game);
                pos10.setClickable(true);
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
                pos9.setClickable(false);
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos12.setImageResource(R.color.trans);
                pos12.setClickable(false);
                break;
            case 11:
                pos11.setImageResource(R.drawable.mascot_game);
                pos11.setClickable(true);
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
                pos9.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos10.setClickable(false);
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
                pos12.setImageResource(R.color.trans);
                pos12.setClickable(false);
                break;
            case 12:
                pos12.setImageResource(R.drawable.mascot_game);
                pos12.setClickable(true);
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
                pos9.setClickable(false);
                pos10.setImageResource(R.color.trans);
                pos10.setClickable(false);
                pos11.setImageResource(R.color.trans);
                pos11.setClickable(false);
                pos1.setImageResource(R.color.trans);
                pos1.setClickable(false);
                break;
            default:
                break;
        }
        score++;
        text_score.setText(valueOf(score));

    }
    private static long back_pressed;
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis())
            super.onBackPressed();
        else
            Toast.makeText(getBaseContext(), "Нажмите еще раз для выхода!", Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();

    }
}