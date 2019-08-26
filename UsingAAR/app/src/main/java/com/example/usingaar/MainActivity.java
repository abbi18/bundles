package com.example.usingaar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.resourcesaar.FirstClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstClass myClass = new FirstClass();
        myClass.printLog("Abhinandan Mittal");
    }
}
