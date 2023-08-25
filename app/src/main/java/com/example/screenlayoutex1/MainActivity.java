package com.example.screenlayoutex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Any method we want to call with an onClick MUST have the method signature:
    // public void methodName(View v)
    // if the signature is wrong, you will not be able to call this with an onCLick
    public void switchScreens(View v){
        // Need a reference to the EditText in our xml
        // Need a String variable to hold the data that was in this EditText
            // we need toString() after getText because the text in there ins still editable
            // this toString() allows us to get the current contents
        // Do this for each of our variables

        EditText nameET = findViewById(R.id.editName);
        String name = nameET.getText().toString();

        EditText ageET = findViewById(R.id.editAge);
        String age = ageET.getText().toString();    // for now, keep this number as a String

        EditText hobbyET = findViewById(R.id.editHobby);
        String hobby = hobbyET.getText().toString();

        // log statements allow us to print to the console for debugging
        Log.i("jason", name + " " + age + " " + hobby);
        String fullText = name + " " + age + "\n" + hobby;
        String nameText = name;
        String ageText = age;
        String hobbyText = hobby;

        // create the intent and tell it where to go
        Intent intent = new Intent(this, ShowInfoActivity.class);


        // fill the intent (optional)
        // need to use a label so the receiver knows what data goes with each item
        // in the intent
//        intent.putExtra("FULLTEXT", fullText);
        intent.putExtra("NAME", nameText);
        intent.putExtra("AGE", ageText);
        intent.putExtra("HOBBY", hobbyText);

        // call startActivity to launch the intent
        startActivity(intent);
    }

}