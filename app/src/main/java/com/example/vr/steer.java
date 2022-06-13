package com.example.vr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class steer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steer);
    }

    public void cal(View view) {
        Intent id = new Intent(this,cal.class);
        startActivity(id);
        Toast.makeText(this, "Let's Calculate", Toast.LENGTH_SHORT).show();
    }

    public void rules(View view) {
        Intent intent = new Intent(this,info.class);
        startActivity(intent);
        Toast.makeText(this, "Let's Read", Toast.LENGTH_SHORT).show();
    }

    public void info(View view) {
        Intent intent = new Intent(this,data.class);
        startActivity(intent);
        Toast.makeText(this, "Let's Read", Toast.LENGTH_SHORT).show();

    }

    public void CalEffort(View view) {
        Intent intent = new Intent(this,SteeringEffort.class);
        startActivity(intent);
        Toast.makeText(this, "Lets Calculate", Toast.LENGTH_SHORT).show();
    }

    public void tasks(View view) {
        Intent inte = new Intent(this,tasks.class);
        startActivity(inte);
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
    }


}