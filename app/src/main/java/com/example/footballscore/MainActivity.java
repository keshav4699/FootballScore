package com.example.footballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer goalA = 0;
    Integer goalB = 0;
    Integer foulA = 0;
    Integer foulB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void goal_scoredA(View view) {
        goalA+=1;
        TextView content = findViewById(R.id.tv_goalA);
        content.setText(goalA.toString());
    }

    @SuppressLint("SetTextI18n")
    public void goal_scoredB(View view) {
        goalB+=1;
        TextView content = findViewById(R.id.tv_goalB);
        content.setText(goalB.toString());
    }

    @SuppressLint("SetTextI18n")
    public void foul_countA(View view) {
        foulA+=1;
        TextView content = findViewById(R.id.tv_foulcountA);
        content.setText(foulA.toString());
    }

    @SuppressLint("SetTextI18n")
    public void foul_countB(View view) {
        foulB+=1;
        TextView content = findViewById(R.id.tv_foulcountB);
        content.setText(foulB.toString());
    }

    @SuppressLint("SetTextI18n")
    public void reset(View view) {
        goalA=0;
        TextView content = findViewById(R.id.tv_goalA);
        content.setText(goalA.toString());

        goalB=0;
        content = findViewById(R.id.tv_goalB);
        content.setText(goalB.toString());

        foulA=0;
        content = findViewById(R.id.tv_foulcountA);
        content.setText(foulA.toString());

        foulB=0;
        content = findViewById(R.id.tv_foulcountB);
        content.setText(foulB.toString());
    }
}