package com.example.android.scorekeeper;

import android.content.Context;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamOne = 0;
    int scoreTeamTwo= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView resetView = (ImageView) findViewById(R.id.resetImage);
        resetView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "RESET!", Toast.LENGTH_SHORT).show();
                reset(null);
            }
        });

    }

    public void quaffleTeamOne(View view) {
        scoreTeamOne = scoreTeamOne + 10;
        displayTeamOne(scoreTeamOne);
    }

    public void quaffleTeamTwo(View view) {
        scoreTeamTwo = scoreTeamTwo + 10;
        displayTeamTwo(scoreTeamTwo);
    }

    // Snitch

    public void snitchTeamOne(View view) {
        scoreTeamOne = scoreTeamOne + 150;
        displayTeamOne(scoreTeamOne);
        Toast toast = Toast.makeText(getApplicationContext(), "Game over!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }

    public void snitchTeamTwo(View view) {
        scoreTeamTwo = scoreTeamTwo  + 150;
        displayTeamTwo(scoreTeamTwo );
        Toast toast = Toast.makeText(getApplicationContext(), "Game over!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void reset(View view) {
        scoreTeamOne = 0;
        scoreTeamTwo = 0;
        displayTeamOne(scoreTeamOne);
        displayTeamTwo(scoreTeamTwo);
    }

    public void displayTeamOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamOne);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeamTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamTwo);
        scoreView.setText(String.valueOf(score));
    }


}
