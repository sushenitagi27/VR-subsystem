package com.example.vr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void steer(View view) {
        Intent intent = new Intent(this,steer.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome to Steering Subsystem!!", Toast.LENGTH_SHORT).show();
    }

    public void StopWatch(View view) {
        Intent intent = new Intent(this,StopWatch.class );
        startActivity(intent);
    }

    public void calculator(View view) {
        Intent intent = new Intent(this,calculator.class);
        startActivity(intent);
    }
}