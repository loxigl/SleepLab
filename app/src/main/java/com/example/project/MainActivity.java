package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
   /* ImageButton button;
    public void onClick(View v){
      Drawable dr = getResources().getDrawable(R.drawable.button_pressed);
      dr.setColorFilter(Color.parseColor("#FF0000"), PorterDuff.Mode.SRC_ATOP);
//        ImageButton imagebutton= (ImageButton) findViewById(R.id.imageButton);



        switch (v.getId()) {
            case R.id.imageButton:


                if (button == null) {
                    button = (ImageButton) findViewById(v.getId());
                } else {
                    button.setBackgroundResource(R.drawable.button_pressed);
                    button = (ImageButton) findViewById(v.getId());
                }
                button.setBackground(dr);

                break;

            case R.id.imageButton4:
                if (button == null) {
                    button = (ImageButton) findViewById(v.getId());
                }
                else
                    {
                    button.setBackgroundResource(R.drawable.button_pressed);
                    button = (ImageButton) findViewById(v.getId());
                }
                button.setBackground(dr);

                break;

            default:
                break;
        }

    }*/
    ImageButton button;
   public void onClick(View view)
   {
      /* if(view.getId()=="imageButton4")
       {

       }
*/

       Toast.makeText(this, "Пол Выбран", Toast.LENGTH_SHORT).show();
   }

}
