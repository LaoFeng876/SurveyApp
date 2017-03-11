package com.example.fengzc.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Q2Activity extends AppCompatActivity {

    private int chang_flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        RadioGroup group = (RadioGroup) this.findViewById(R.id.rg_q2);
        final Button btn = (Button) findViewById(R.id.q2_button);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup arg0, int arg1) {
                // TODO Auto-generated method stub
                //获取变更后的选中项的ID
                int radioButtonId = arg0.getCheckedRadioButtonId();
                //根据ID获取RadioButton的实例
                RadioButton rb = (RadioButton) Q2Activity.this.findViewById(radioButtonId);
                //更新文本内容，以符合选中项
                btn.setText("Next");
                chang_flag = 1;

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (chang_flag == 1) {
                    Intent intent = new Intent(getBaseContext(), Q3Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
