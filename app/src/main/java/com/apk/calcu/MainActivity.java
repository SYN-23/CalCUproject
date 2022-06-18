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
    private void setWorkings(String givenValue){
        workings = workings + givenValue;
        workingsView.setText(workings);
    }

    public void clearOnClick(View view) {

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
        setWorkings("9");
    }

    public void fourOnClick(View view) {
        setWorkings("4");
    }

    public void fiveOnClick(View view) {
        setWorkings("5");
    }

    public void sixOnClick(View view) {
        setWorkings("6");
    }

    public void oneOnClick(View view) {
        setWorkings("1");
    }

    public void twoOnClick(View view) {
        setWorkings("2");
    }

    public void threeOnClick(View view) {
        setWorkings("3");
    }

    public void positiveToNegative(View view) {

    }

    public void zeroOnClick(View view) {
        setWorkings("0");
    }

    public void dotOnClick(View view) {
        setWorkings(".");
    }

    public void backSpaceOnClick(View view) {
    }

    public void modularDivisionOnClick(View view) {
        setWorkings("%");
    }

    public void multiplyOnClick(View view) {
        setWorkings("*");
    }

    public void minusOnClick(View view) {
        setWorkings("-");
    }

    public void plusOnclick(View view) {
        setWorkings("+");
    }

    public void equalsOnClick(View view) {

    }
}