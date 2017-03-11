package com.example.fengzc.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Q6Activity extends AppCompatActivity {
    int change_flag=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);
        EditText as = (EditText) findViewById(R.id.et_Answerq6);
        final Button btn = (Button) findViewById(R.id.q6_button);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (change_flag == 1) {
                    Intent intent = new Intent(getBaseContext(), Q7Activity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
