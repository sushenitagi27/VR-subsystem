package com.example.vr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SteeringEffort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steering_effort);
    }

    public void cale(View view) {
        EditText a = (EditText)findViewById(R.id.mass);
        String b = a.getText().toString();
        double m = Double.valueOf(b);
        EditText aa = (EditText)findViewById(R.id.a2);
        String bb = aa.getText().toString();
        double a2 = Double.valueOf(bb);
        EditText aaa=(EditText)findViewById(R.id.w);
        double w = Double.valueOf(aaa.getText().toString());
        double r1 = (m*a2*9.81)/w;
        double r2 = r1/2;
        EditText bbb = (EditText)findViewById(R.id.masstyre);
        double mass = Double.valueOf(bbb.getText().toString());
        double f = r2 + (mass*9.81);
        double fr = 0.7*f;
        EditText gg= (EditText)findViewById(R.id.pr);
        double pr = Double.valueOf(gg.getText().toString());
        double torque = (fr*pr);
        EditText good = (EditText)findViewById(R.id.rw);
        double rw = Double.valueOf(good.getText().toString());
        double steer = torque / rw;
        TextView textView =(TextView)findViewById(R.id.textView7);
        textView.setText(String.valueOf(steer));
        String text = "Steering effort is "+ String.valueOf(steer);
        Toast.makeText(this, text , Toast.LENGTH_SHORT).show();

    }
}