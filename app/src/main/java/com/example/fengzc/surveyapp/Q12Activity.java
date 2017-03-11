package com.example.fengzc.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Q12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q12);


        EditText as = (EditText) findViewById(R.id.et_Answerq12);
        final Button btn = (Button) findViewById(R.id.q12_button);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), FinishActivity.class);
                startActivity(intent);
            }
        });
    }
}
