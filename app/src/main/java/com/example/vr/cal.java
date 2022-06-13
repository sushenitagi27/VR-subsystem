package com.example.vr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class cal extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
    }


    public void calAngle(View view) {
        EditText inout = (EditText)findViewById(R.id.inout);
        String name = inout.getText().toString();
        if (name.equals("out"))
        {
            EditText o = (EditText)findViewById(R.id.angle);
            String out = o.getText().toString();
            double outer =Math.toRadians(Double.valueOf(out));
            EditText whe = (EditText)findViewById(R.id.w);
            String w = whe.getText().toString();
            double wheel = Double.valueOf(w);
            EditText l = (EditText)findViewById(R.id.l);
            String len = l.getText().toString();
            double length = Double.valueOf(len);
            double inner = 1/Math.tan(outer) - wheel/length;
            double in = (Math.atan(1/inner));
            double ans =Math.toDegrees(in);
            String text ="Inner angle is "+ String.valueOf(ans);
            TextView textView = (TextView)findViewById(R.id.textView3);
            textView.setText(String.valueOf(ans));
            double sum = Math.toDegrees(outer)+ans;
            TextView s = (TextView)findViewById(R.id.textView5);
            s.setText(String.valueOf(sum));
            Toast.makeText(this,text , Toast.LENGTH_LONG).show();


            EditText t =(EditText)findViewById(R.id.t);
            String lol = t.getText().toString();
            double track = Double.valueOf(lol);
            double a = length/(Math.tan(outer));
            double ack = Math.atan(length/(a-track));
            TextView ac =(TextView)findViewById(R.id.textView8);
            ac.setText(String.valueOf(Math.toDegrees(ack)));
            double per = (ans/Math.toDegrees(ack))*100;
            TextView cent = (TextView)findViewById(R.id.textView9);
            cent.setText(String.valueOf(per));

        }
        else if (name.equals("in"))
        {
            EditText o = (EditText)findViewById(R.id.angle);
            String out = o.getText().toString();
            double outer =Math.toRadians(Double.valueOf(out));
            EditText whe = (EditText)findViewById(R.id.w);
            String w = whe.getText().toString();
            double wheel = Double.valueOf(w);
            EditText l = (EditText)findViewById(R.id.l);
            String len = l.getText().toString();
            double length = Double.valueOf(len);
            double inner = 1/Math.tan(outer) + wheel/length ;
            double in = (Math.atan(1/inner));
            double ans = Math.toDegrees(in);
            String text ="Outer angle is "+ String.valueOf(ans);
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
            TextView textView = (TextView)findViewById(R.id.textView3);
            textView.setText(String.valueOf(ans));
            double sum = Math.toDegrees(outer)+ans;
            TextView s = (TextView)findViewById(R.id.textView5);
            s.setText(String.valueOf(sum));

            EditText t =(EditText)findViewById(R.id.t);
            String lol = t.getText().toString();
            double track = Double.valueOf(lol);
            double a = length/(Math.tan(outer));
            double ack = Math.atan(length/(a-track));
            TextView ac =(TextView)findViewById(R.id.textView8);
            ac.setText(String.valueOf(Math.toDegrees(ack)));
            double per = (Math.toDegrees(outer)/Math.toDegrees(ack))*100;
            TextView cent = (TextView)findViewById(R.id.textView9);
            cent.setText(String.valueOf(per));


        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}