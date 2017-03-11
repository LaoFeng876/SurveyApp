package com.example.fengzc.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Q5Activity extends AppCompatActivity {
    int change_flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);

        EditText as = (EditText) findViewById(R.id.et_Answerq5);
        final Button btn = (Button) findViewById(R.id.q5_button);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(getBaseContext(), Q6Activity.class);
                    startActivity(intent);
                }
            
        });
    }



}

