package com.kumar.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int a;

    int c;

    int b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=5;
        c=6;
        b=1;
        for (int i=1;i<20;i++){
            System.out.println("Whats up");
        }

        for (int i=0;i<10;i++){
            System.out.println("HI");
        }

    }
}
