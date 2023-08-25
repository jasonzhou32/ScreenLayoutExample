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
        String receivedName = intent.getStringExtra("NAME");
        String receivedAge = intent.getStringExtra("AGE");
        String receivedHobby = intent.getStringExtra("HOBBY");

        // log to see what was received
        Log.i("jason", "Received " + receivedName);




        TextView nameInfoTV = findViewById(R.id.nameInfoTextView);
        nameInfoTV.setText(receivedName);

        TextView ageInfoTV = findViewById(R.id.ageInfoTextView);
        ageInfoTV.setText(receivedAge);

        TextView hobbyInfoTV = findViewById(R.id.hobbyInfoTextView);
        hobbyInfoTV.setText(receivedHobby);


    }
}