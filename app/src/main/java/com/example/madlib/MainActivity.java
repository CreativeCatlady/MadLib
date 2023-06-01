package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTitle;

    LinearLayout llHintedWords;

    EditText etAdjective;

    EditText etNoun;

    EditText etTime;

    EditText etNumber;

    EditText etDate;

    EditText etAnimal;

    EditText etNoun2;

    EditText etTime2;

    EditText etEmotion;

    EditText etAdjective2;

    EditText etFood;

    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}