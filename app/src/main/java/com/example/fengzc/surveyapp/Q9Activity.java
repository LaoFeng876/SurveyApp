package com.example.fengzc.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Q9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q9);
        EditText as = (EditText) findViewById(R.id.et_Answerq9);
        final Button btn = (Button) findViewById(R.id.q9_button);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Q10Activity.class);
                startActivity(intent);
            }
        });
    }
}
