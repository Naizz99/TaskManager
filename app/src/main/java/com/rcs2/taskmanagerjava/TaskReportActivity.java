package com.rcs2.taskmanagerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TaskReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_report);
    }

    public void home(View view) {
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
    }

}