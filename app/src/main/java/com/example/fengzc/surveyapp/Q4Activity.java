package com.example.fengzc.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Q4Activity extends AppCompatActivity {
    int change_flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_q4);
        CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox);
        CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);

        final Button btn = (Button) findViewById(R.id.q4_button);
        CheckBox.OnCheckedChangeListener occl=new CheckBox.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                  change_flag=1;
                    btn.setText("Next");

                }
            }
        };

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (change_flag == 1) {
                    Intent intent = new Intent(getBaseContext(), Q5Activity.class);
                    startActivity(intent);
                }
            }
        });
        cb1.setOnCheckedChangeListener(occl);
        cb2.setOnCheckedChangeListener(occl);
        cb3.setOnCheckedChangeListener(occl);
        //cb2.setOnClickListener(ocl);
        //cb3.setOnClickListener(ocl);
    }
}
