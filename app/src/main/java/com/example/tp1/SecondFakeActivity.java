package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondFakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_fake);
    }

    protected void onStart() {
        super.onStart();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onStart: ");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onRestart: ");
    }

    protected void onResume() {
        super.onResume();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onResume: ");
    }

    protected void onPause() {
        super.onPause();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onPause: ");
    }

    protected void onStop() {
        super.onStop();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onStop: ");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onDestroy: ");
    }

    public void finish(View view){
        finish();
    }
}