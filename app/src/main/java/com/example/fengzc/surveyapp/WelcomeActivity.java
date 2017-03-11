package com.example.fengzc.surveyapp;

import android.content.Context;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class WelcomeActivity extends AppCompatActivity {

    String filePath = "/内部存储/Test/";
    String fileName = "log.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button btn_welcome=(Button)findViewById(R.id.button);
        final CreateFile cf = new CreateFile();
        final Context mContext = getApplicationContext();
        btn_welcome.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(),Q1Activity.class);
                startActivity(intent);

            }
        });
    }
}
