package com.example.terry.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void Exit(View V) {
        Toast.makeText(Main2Activity.this, "congrats!! ", Toast.LENGTH_SHORT).show();
        finish();

    }
}
