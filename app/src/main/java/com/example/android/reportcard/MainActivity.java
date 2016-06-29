package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ReportCard> grades = new ArrayList<ReportCard>();
        Log.v("Name: ", getC);


//        grades.add(new ReportCard("John", "F", "F", "F"));
//        grades.add(new ReportCard("John", "F", "F", "F"));


    }
}
