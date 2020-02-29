package com.example.basicflooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static com.example.basicflooringcalculator.MainActivity.roomArea;
import static com.example.basicflooringcalculator.MainActivity.roomLengthEntry;
import static com.example.basicflooringcalculator.MainActivity.roomWidthEntry;

public class ResultActivity extends AppCompatActivity {

    TextView outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        outcome = (TextView) findViewById(R.id.textViewOutcome);

        outcome.setText(getResources().getString(R.string.finalText1) + roomWidthEntry.getText() + getResources().getString(R.string.finalText2) + roomLengthEntry.getText() + getResources().getString(R.string.finalText3) + roomArea.toString() + getResources().getString(R.string.finalText4));

    }
}
