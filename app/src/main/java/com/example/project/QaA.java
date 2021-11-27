package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;



public class QaA extends AppCompatActivity {

    private static final String MY_PREFS_NAME = "QaA count";
    int score;

    Array array = new Array();
    int[] array1;
    int temp=0;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa);
        array1=array.probability;
        TextView question=findViewById(R.id.questions);

        question.setText(array1[temp]);
        temp++;




    }
    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("Вы успешно закончили тест");
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        Intent intent=new Intent(QaA.this,Mascot.class);
        TextView question=findViewById(R.id.questions);
        DialogInterface.OnClickListener click=new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(intent);
            }
        };
        dialog.setPositiveButton("Ok",click);




        switch (view.getId()) {

            case R.id.back_to_maskot:
                startActivity(intent);
                break;
            case R.id.zero:
                if (temp<array1.length) {
                    question.setText(array1[temp]);
                    temp++;
                }
                else
                {

                    editor.putInt("Score",score);
                    editor.apply();
                    if (score<=8 ) {
                        dialog.setMessage("Сонливость в пределах нормы");

                    }
                    else
                    {
                        dialog.setMessage("Аномальная сонливость, будте осторожны");
                    }
                    AlertDialog dialog1= dialog.create();
                    dialog1.show();
                }
                break;
            case R.id.one:
                score +=1;
                if (temp<array1.length) {
                    question.setText(array1[temp]);
                    temp++;
                }
                else
                {

                    editor.putInt("Score",score);
                    editor.apply();
                    if (score<=8 ) {
                        dialog.setMessage("Сонливость в пределах нормы");

                    }
                    else
                    {
                        dialog.setMessage("Аномальная сонливость, будте осторожны");
                    }
                    AlertDialog dialog1= dialog.create();
                    dialog1.show();
                }
                break;
            case R.id.two:
                score +=2;
                if (temp<array1.length) {
                    question.setText(array1[temp]);
                    temp++;
                }
                else
                {

                    editor.putInt("Score",score);
                    editor.apply();
                    if (score<=8 ) {
                        dialog.setMessage("Сонливость в пределах нормы");

                    }
                    else
                    {
                        dialog.setMessage("Аномальная сонливость, будте осторожны");
                    }
                    AlertDialog dialog1= dialog.create();
                    dialog1.show();
                }
                break;
            case R.id.three:
                score +=3;
                if (temp<array1.length) {
                    question.setText(array1[temp]);
                    temp++;
                }
                else
                {

                    editor.putInt("Score",score);
                    editor.apply();
                    if (score<=8 ) {
                        dialog.setMessage("Сонливость в пределах нормы");

                    }
                    else
                    {
                        dialog.setMessage("Аномальная сонливость, будте осторожны");
                    }
                    AlertDialog dialog1= dialog.create();
                    dialog1.show();
                }
                break;
            default:
                break;

        }




    }


}


