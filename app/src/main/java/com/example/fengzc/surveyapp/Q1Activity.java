package com.example.fengzc.surveyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Q1Activity extends AppCompatActivity {
    private int change_flag=0;
    String selectText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        final RadioGroup group = (RadioGroup)this.findViewById(R.id.rg_q1);
        final Button btn = (Button) findViewById(R.id.q1_button);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup arg0, int arg1) {
                // TODO Auto-generated method stub
                //获取变更后的选中项的ID
                int radioButtonId = arg0.getCheckedRadioButtonId();
                //根据ID获取RadioButton的实例
                RadioButton rb = (RadioButton)Q1Activity.this.findViewById(radioButtonId);
                //更新文本内容，以符合选中项
                btn.setText("Next");
                change_flag=1;

                rb = (RadioButton)findViewById(group.getCheckedRadioButtonId());
                selectText = rb.getText().toString();
                //Toast.makeText(getApplicationContext(), selectText,
                //        Toast.LENGTH_SHORT).show();
            }
        });


        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if(change_flag==1) {
                    Intent intent = new Intent(getBaseContext(), Q2Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
