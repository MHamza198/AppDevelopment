    package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        EditText msg;
        public static final String EXTRA_MSG = "com.example.multiscreen.extra.msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openActivity(View v ){
        Toast.makeText(this, "Hi! My name is M.Hamza", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class );
        msg = findViewById(R.id.msg);
        String msgText = msg.getText().toString();
        intent.putExtra(EXTRA_MSG, msgText);
        startActivity(intent);

    }
}