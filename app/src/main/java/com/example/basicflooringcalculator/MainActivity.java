package com.example.basicflooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    static EditText roomWidthEntry;
    static EditText roomLengthEntry;
    static Double roomArea;

    TextView textView3;  // this is my sanity check


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roomWidthEntry = findViewById(R.id.editTextRoomWidth);
        roomLengthEntry = findViewById(R.id.editTextRoomLength);
        textView3 = findViewById(R.id.textView3);

    }

    public void btnShowResult(View view){
        roomArea = (Double.parseDouble(roomWidthEntry.getText().toString()) * (Double.parseDouble(roomLengthEntry.getText().toString())));
        textView3.setText("It works " + roomArea);  // this is my sanity check


        // Call the second screen or page
        Intent detailActIntent = new Intent(this, ResultActivity.class);
        startActivity(detailActIntent);
    }
}
