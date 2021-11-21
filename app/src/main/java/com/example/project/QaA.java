package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QaA extends AppCompatActivity {

    public int que;
    Array array = new Array();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qa);

        Button back_to_maskot = (Button)findViewById(R.id.back_to_maskot);
        back_to_maskot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(QaA.this,Mascot.class);
                    startActivity(intent);
                    finish();
                }catch (Exception e) {

                }
            }
        });
    }
}
