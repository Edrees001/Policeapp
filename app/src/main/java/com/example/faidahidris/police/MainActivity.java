package com.example.faidahidris.police;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Intent reportIntent= new Intent(MainActivity.this, ReportActivity.class);
        startActivity (reportIntent);
    }

    Intent MainIntent = getIntent();
    String username = MainIntent.getStringExtra("username");

    TextView welcomeTextView = (TextView) findViewById(R.id.text_view_welcome);
    welcomeTextView.setText("Welcome " + username);
    }


