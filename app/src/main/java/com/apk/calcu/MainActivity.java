package com.apk.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView workingsView;
    TextView resultsView;

    String workings="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }

    private void initTextViews() {
        workingsView = (TextView) findViewById(R.id.workingTextView);
        resultsView = (TextView) findViewById(R.id.resultTextView);
    }
    private void setWorkings(String givenvalue){
        workings = workings + givenvalue;
        workingsView.setText(workings);
    }

    public void clearOnClick(View view) {
        setWorkings("AC");
    }

    public void devideOnClick(View view) {
        setWorkings("/");
    }

    public void sevenOnClick(View view) {
        setWorkings("7");
    }

    public void eightOnClick(View view) {
        setWorkings("8");
    }

    public void nineOnClick(View view) {
    }

    public void fourOnClick(View view) {
    }

    public void fiveOnClick(View view) {
    }

    public void sixOnClick(View view) {
    }

    public void oneOnClick(View view) {
    }

    public void twoOnClick(View view) {
    }

    public void threeOnClick(View view) {
    }

    public void positiveToNegative(View view) {
    }

    public void zeroOnClick(View view) {
    }

    public void dotOnClick(View view) {
    }

    public void backSpaceOnClick(View view) {
    }

    public void modularDivisionOnClick(View view) {
    }

    public void multiplyOnClick(View view) {
    }

    public void minusOnClick(View view) {
    }

    public void plusOnclick(View view) {
    }

    public void equalsOnClick(View view) {
    }
}