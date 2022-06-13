package com.example.vr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void sin(View view) {
        EditText editText = (EditText)findViewById((R.id.input));
        String s = editText.getText().toString();
        double a = Math.toRadians(Double.valueOf(s));
        double ans = Math.sin(a);
        editText.setText(String.valueOf(ans));
    }

    public void cos(View view) {
        EditText editText = (EditText)findViewById((R.id.input));
        String s = editText.getText().toString();
        double a = Math.toRadians(Double.valueOf(s));
        double ans = Math.cos(a);
        editText.setText(String.valueOf(ans));
    }

    public void tan(View view) {
        EditText editText = (EditText)findViewById((R.id.input));
        String s = editText.getText().toString();
        double a = Math.toRadians(Double.valueOf(s));
        double ans = Math.tan(a);
        editText.setText(String.valueOf(ans));
    }

    public void DegToRad(View view) {
        String s;
        double a;
        double ans;
        EditText editText;
        editText = findViewById((R.id.input));
        s = editText.getText().toString();
        a = Math.toRadians(Double.valueOf(s));
        editText.setText(String.valueOf(a));
    }

    public void RadToDeg(View view) {
        String s;
        double a;
        double ans;
        EditText editText;
        editText = findViewById((R.id.input));
        s = editText.getText().toString();
        a = Math.toDegrees(Double.valueOf(s));
        editText.setText(String.valueOf(a));
    }

    public void sinIn(View view) {
        EditText editText = (EditText)findViewById((R.id.input));
        String s = editText.getText().toString();
        double a =(Double.valueOf(s));
        double ans = Math.asin(a);
        editText.setText(String.valueOf(Math.toDegrees( ans)));
    }

    public void cosIn(View view) {
        EditText editText = (EditText)findViewById((R.id.input));
        String s = editText.getText().toString();
        double a =(Double.valueOf(s));
        double ans = Math.acos(a);
        editText.setText(String.valueOf(Math.toDegrees( ans)));
    }

    public void tanIn(View view) {
        EditText editText = (EditText)findViewById((R.id.input));
        String s = editText.getText().toString();
        double a =(Double.valueOf(s));
        double ans = Math.atan(a);
        editText.setText(String.valueOf(Math.toDegrees( ans)));
    }

    public void log(View view) {
        EditText editText = (EditText)findViewById((R.id.input));
        String s = editText.getText().toString();
        double a =(Double.valueOf(s));
        double ans = Math.log(a);
        editText.setText(String.valueOf(Math.toDegrees( ans)));
    }

    public void plus(View view) {
        EditText ed = (EditText)findViewById(R.id.input) ;
        EditText editText = (EditText)findViewById((R.id.x));
        String s = editText.getText().toString();
        double a =(Double.valueOf(s));
        EditText text = (EditText)findViewById((R.id.y));
        String si = text.getText().toString();
        double an =(Double.valueOf(si));
        double ans = a + an;
        ed.setText(String.valueOf(ans));
        editText.setText(String.valueOf(ans));
        text.setText("");
    }

    public void minus(View view) {
        EditText ed = (EditText)findViewById(R.id.input) ;
        EditText editText = (EditText)findViewById((R.id.x));
        String s = editText.getText().toString();
        double a =(Double.valueOf(s));
        EditText text = (EditText)findViewById((R.id.y));
        String si = text.getText().toString();
        double an =(Double.valueOf(si));
        double ans = a - an;
        ed.setText(String.valueOf(ans));
        editText.setText(String.valueOf(ans));
        text.setText("");
    }

    public void divide(View view) {
        EditText ed = (EditText)findViewById(R.id.input) ;
        EditText editText = (EditText)findViewById((R.id.x));
        String s = editText.getText().toString();
        double a =(Double.valueOf(s));
        EditText text = (EditText)findViewById((R.id.y));
        String si = text.getText().toString();
        double an =(Double.valueOf(si));
        double ans = a / an;
        ed.setText(String.valueOf(ans));
        editText.setText(String.valueOf(ans));
        text.setText("");
    }

    public void multiply(View view) {
        EditText ed = (EditText)findViewById(R.id.input) ;
        EditText editText = (EditText)findViewById((R.id.x));
        String s = editText.getText().toString();
        double a =(Double.valueOf(s));
        EditText text = (EditText)findViewById((R.id.y));
        String si = text.getText().toString();
        double an =(Double.valueOf(si));
        double ans = a * an;
        ed.setText(String.valueOf(ans));
        editText.setText(String.valueOf(ans));
        text.setText("");

    }
}