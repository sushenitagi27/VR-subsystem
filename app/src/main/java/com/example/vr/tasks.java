package com.example.vr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tasks extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = editText.getText().toString();
                int i =1;
                SharedPreferences shrd = getSharedPreferences("demo", MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.putString(String.valueOf(i), msg);
                editor.apply();

                SharedPreferences getShared = getSharedPreferences("demo", MODE_PRIVATE);
                String value1 = getShared.getString(String.valueOf(i),"Save a note and it will show up here");
                textView.setText(value1);
                i++;
            }
        });

        // Get the value of shared preference back

    }
}
