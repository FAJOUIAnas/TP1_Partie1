package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FakeActivity extends AppCompatActivity {
    TextView txtView;
    EditText txtEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake);

        txtEdit = findViewById(R.id.txtEdit);
        txtView = findViewById(R.id.txtView);

        if (savedInstanceState != null) {
            txtView.setText(savedInstanceState.getString("input"));
        }
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onSaveInstanceState");
        outState.putString("input", txtView.getText().toString());
    }

    protected void onStart() {
        super.onStart();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onStart");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onRestart");
    }

    protected void onResume() {
        super.onResume();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("LIFECYCLE", getLocalClassName() + " : ici onDestroy");
    }

    public void finish(View view) {
        finish();
    }

    public void viewEditTxt(View view) {
        txtView.setText(txtEdit.getText().toString());
    }

    public void createSecondFakeActivity(View view){
        Intent myIntent = new Intent(FakeActivity.this, SecondFakeActivity.class);
        startActivity(myIntent);
    }
}