package com.example.screenlayoutex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        // getting the intent so I can interact with it
        Intent intent = getIntent();

        // open the intent to get the data when screen loads
        String received = intent.getStringExtra("FULLTEXT");

        // log to see what was received
        Log.i("jason", "Received " + received);

        TextView infoTV = findViewById(R.id.infoTextView);
        infoTV.setText(received);


    }
}