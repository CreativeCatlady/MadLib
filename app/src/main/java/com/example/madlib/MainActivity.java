package com.example.madlib;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    Button btnContinue;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking to layout
        tvTitle = findViewById(R.id.size);
        llHintedWords = findViewById(R.id.ll_hintedwords);
        etAdjective = findViewById(R.id.et_adjective);
        etNoun2 = findViewById(R.id.et_noun);
        etNumber = findViewById(R.id.et_number);
        etDate = findViewById(R.id.et_date);
        etAnimal = findViewById(R.id.et_animal);
        etTime2 = findViewById(R.id.et_time2);
        etEmotion = findViewById(R.id.et_emotion);
        etAdjective2 = findViewById(R.id.et_adjective2);
        etFood = findViewById(R.id.et_food);
        btnContinue = findViewById(R.id.btn_continue);

        //intent to next activity
        Intent intentDisplay = new Intent(MainActivity.this, DisplayActivity.class);

        //generate madlib
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //generate story
                String story = "";
                story += "\n..." + etAdjective.getText();
                story += "\n..." + etNoun.getText();
                story += "\n..." + etTime.getText();
                story += "\n..." + etNumber.getText();
                story += "\n..." + etDate.getText();
                story += "\n..." + etAnimal.getText();
                story += "\n..." + etNoun2.getText();
                story += "\n..." + etTime2.getText();
                story += "\n..." + etEmotion.getText();
                story += "\n..." + etAdjective2.getText();
                story += "\n..." + etFood.getText();

                //pass to next activity
                intentDisplay.putExtra("Lost",story);
                startActivity(intentDisplay);
            }
        });

    }
}