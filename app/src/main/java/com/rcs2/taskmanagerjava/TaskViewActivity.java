package com.rcs2.taskmanagerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TaskViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_view);
    }

    public void home(View view) {
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
    }

    public void viewTaskList(View view) {
        Intent i = new Intent(this,TaskListActivity.class);
        startActivity(i);
    }

}