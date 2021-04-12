package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int A=0, B=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threeA(View view){
        A=A+3;
        display(A, R.id.scoreA);
    }
    public void twoA(View view){
        A=A+2;
        display(A, R.id.scoreA);
    }
    public void freeThrowA(View view){
        A=A+1;
        display(A, R.id.scoreA);
    }
    public void threeB(View view){
        B=B+3;
        display(B, R.id.scoreB);
    }
    public void twoB(View view){
        B=B+2;
        display(B, R.id.scoreB);
    }
    public void freeThrowB(View view){
        B=B+1;
        display(B, R.id.scoreB);
    }
    public void display(int n, int name) {
        TextView score = (TextView)findViewById(name);
        score.setText(Integer.toString(n));
    }
    public void reset(View view){
        A=0;
        B=0;
        display(A, R.id.scoreA);
        display(B, R.id.scoreB);
    }
}