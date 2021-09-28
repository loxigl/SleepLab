package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.google.gson.reflect.TypeToken;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*import com.github.mikephil.charting.charts.LineChart;*/

public class Stats extends AppCompatActivity  {
    private static final String MY_PREFS_NAME ="Graphs";



    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        Button btn=findViewById(R.id.five);
        Button add=findViewById(R.id.addbtn);
        LineChart graph=findViewById(R.id.graph);
        Intent intent2=getIntent();
        int value=intent2.getIntExtra("value",0);
        SharedPreferences  myPrefs = getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Type listOfObjects = new TypeToken<ArrayList<Entry>>(){}.getType();
        Type listOfObjects1 = new TypeToken<ArrayList<Integer>>(){}.getType();
        String json = myPrefs.getString("MyList", null);
        String array=myPrefs.getString("Array",null);
        int y=intent2.getIntExtra("Sleep",99);
        int i = myPrefs.getInt("day", 0);
        float i1=i;
        /*int y = myPrefs.getInt("Sleep", 1);*/
        float y1=y;

        ArrayList<Entry> list2 = new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();


        if (array!=null){
        list=gson.fromJson(array,listOfObjects1);}
        if (y!=99){list.add(i,y);list2.add(new Entry(i,y));}


        if (json==null) {
            Intent pusto=new Intent(Stats.this,Get.class);
            startActivity(pusto);
        }
        else
        {
            list2=gson.fromJson(json,listOfObjects);
            if (y1!=99){i++;list2.add(new Entry(i1,y1)); ;}

        }

        XAxis xAxis=graph.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawGridLines(false);
        xAxis.setAxisMinimum(0f);

        xAxis.setGranularityEnabled(true);
        xAxis.setGranularity(1f);

        YAxis yAxis= graph.getAxisLeft();
        YAxis yAxis2= graph.getAxisRight();
        yAxis2.setEnabled(false);
        xAxis.setLabelCount(7);

       yAxis.setGranularityEnabled(true);
        yAxis.setGranularity(1f);
        yAxis.setAxisMinimum(0f);
        yAxis.setAxisMaximum(24f);




        graph.setDragEnabled(true);
        graph.setScaleEnabled(true);
        Legend legend=graph.getLegend();
        legend.setEnabled(false);
        if (list.size()!=0) {Toast.makeText(Stats.this,average(list),Toast.LENGTH_LONG).show();}

        /*ArrayList<Entry> yValues=new ArrayList<>();*/


      /* int sum=0;
        if (array!=null && !list.isEmpty()) {

            for (int n = 0; n < list.size(); n++) {
                sum += list.get(n);
            }

            int hour = sum / list.size();
            int min = (sum % list.size()) / 60;
        }*/








        LineDataSet set1=new LineDataSet(list2,"Data Set 1");
        set1.setColor(Color.RED);
        String strObject = gson.toJson(list2, listOfObjects);
        String jarray=gson.toJson(list,listOfObjects1);
        SharedPreferences.Editor prefsEditor = myPrefs.edit();
        prefsEditor.putString("MyList", strObject);
        prefsEditor.putString("Array",jarray);
        prefsEditor.putInt("day",i);
        prefsEditor.apply();

        ArrayList<ILineDataSet> dataSets=new ArrayList<>();
        dataSets.add(set1);

        LineData data =new LineData(dataSets);

        graph.setData(data);
        graph.invalidate();

        add.setOnClickListener(view -> {
            Intent intent1=new Intent(Stats.this,Get.class);
            startActivity(intent1);
        });
        btn.setOnClickListener(view -> {

            Intent intent=new Intent(Stats.this,Five.class);
            startActivity(intent);
        });
    }
    public void onBackPressed()
    {
        Intent bruh=new Intent(Stats.this, MainScreen.class);
        startActivity(bruh);
    }
    static String average (ArrayList<Integer> list) {

        int sum = 0;

        for(int i=0;i<list.size();i++) {
            sum+=list.get(i);
        }
        sum=sum*60;
        int h=sum/list.size()/60;
        int m=(sum%list.size())%60;
        String res=h+" Часов   "+m+" Минут";

        return res;
    }
}