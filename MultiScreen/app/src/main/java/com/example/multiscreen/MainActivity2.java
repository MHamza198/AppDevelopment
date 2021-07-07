package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        out = findViewById(R.id.out);
        Intent intent = getIntent();

        String msg = intent.getStringExtra(MainActivity.EXTRA_MSG);
        out.setText("Your Massage Is: \n\n" + msg);
    }
}