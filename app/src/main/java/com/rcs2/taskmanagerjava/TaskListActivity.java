package com.rcs2.taskmanagerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TaskListActivity extends AppCompatActivity {

    TextView txtParam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        Intent i = getIntent();

//        String name = i.getStringExtra("TASK_NAME");
//        int count = i.getIntExtra("DUE_DATES",0);

        Bundle extras = i.getExtras();
        String name = extras.getString("TASK_NAME");
        int count = extras.getInt("DUE_DATES");

        txtParam = findViewById(R.id.txtParam);
        txtParam.setText(name + " | " + count );

    }

    public void home(View view) {
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
    }

    public void viewAddTask(View view) {
        Intent i = new Intent(this,TaskViewActivity.class);
        startActivity(i);
    }
}