package com.rcs2.taskmanagerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void home(View view) {
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
    }

    public void viewTaskList(View view) {
        Intent i = new Intent(this,TaskListActivity.class);

        String taskname = "Getting Ready for Demo";
        int dueDates = 25;

//        i.putExtra("Task_Name",taskname);
//        i.putExtra("DUE_DATES",dueDates);

        Bundle extras = new Bundle();
        extras.putString("TASK_NAME",taskname);
        extras.putInt("DUE_DATES",dueDates);
        i.putExtras(extras);

        startActivity(i);
    }

    public void viewToDo(View view) {
        Intent i = new Intent(this,TaskListActivity.class);
        startActivity(i);
    }

    public void viewAddTask(View view) {
        Intent i = new Intent(this,TaskViewActivity.class);
        startActivity(i);
    }

    public void viewProgressReport(View view) {
        Intent i = new Intent(this, TaskReportActivity.class);
        startActivity(i);
    }

}