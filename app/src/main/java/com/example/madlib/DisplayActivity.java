package com.example.madlib;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    private TextView tvStory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvStory = findViewById(R.id.tv_story);

        Intent intent = getIntent();

        //get story from first activity
        String story = intent.getStringExtra("Lost");

        tvStory.setText(story);
    }

}
