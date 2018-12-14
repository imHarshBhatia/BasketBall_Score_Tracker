package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA,scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Displays score for Team A*/
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_A_score);
        scoreView.setText(Integer.toString(score));

    }

    /*Displays score for Team B*/
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_B_score);
        scoreView.setText(Integer.toString(score));
    }

    /*Resets the score for both the teams*/
    public void resetScores(View v) {
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }

    /*Add 3 points to Team A's score*/
    public void threePointsforTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /*Add 2 points to Team A's score*/
    public void twoPointsforTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /*Add 1 point to Team A's score*/
    public void freeThrowforTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /*Add 3 points to Team B's score*/
    public void threePointsforTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /*Add 2 points to Team B's score*/
    public void twoPointsforTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /*Add 1 point to Team B's score*/
    public void freeThrowforTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
}
