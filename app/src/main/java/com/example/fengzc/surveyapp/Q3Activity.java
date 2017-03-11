package com.example.fengzc.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


public class Q3Activity extends AppCompatActivity {
    ListView myList;
    private int chang_flag=1;
    private String[] major = new String[]
            {       "Philosophy",
                    "Philosophy of Marxism",
                    "Chinese Philosophy",
                    "Foreign Philosophies",
                    "Logic",
                    "Ethics",
                    "Aesthetics",
                    "Science of Religion",
                    "Philosophy of Science and Technology",
                    "Economics",
                    "Multimedia Technology",
                    "Data Warehouse and OLAP",
                    "Methodology of Programming",
                    "Secrecy and Security of Computer Information"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        myList = (ListView) findViewById(R.id.lv_q3);
        final Button btn = (Button) findViewById(R.id.q3_button);
        BaseAdapter adapter = new BaseAdapter()
        {
            @Override
            public int getCount()
            {
                // 指定一共包含40个选项
                return 14;
            }
            @Override
            public Object getItem(int position)
            {
                return null;
            }
            // 重写该方法，该方法的返回值将作为列表项的ID
            @Override
            public long getItemId(int position)
            {
                return position;
            }
            // 重写该方法，该方法返回的View将作为列表框
            @Override
            public View getView(int position, View convertView , ViewGroup parent)
            {
                // 创建一个LinearLayout，并向其中添加两个组件
                LinearLayout line = new LinearLayout(Q3Activity.this);
                line.setOrientation(LinearLayout.HORIZONTAL);
                CheckBox cb = new CheckBox(Q3Activity.this);
                TextView text = new TextView(Q3Activity.this);
                text.setText(major[position]);
                text.setTextSize(30);
                line.addView(cb);
                line.addView(text);
                // 返回LinearLayout实例
                return line;
            }

        };
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // 第position项被单击时激发该方法
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
                System.out.println(major[position]
                        + "被单击了");
            }
        });
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // 第position项被单击时激发该方法
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id)
            {
             chang_flag=1;
                btn.setText("Next");
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (chang_flag == 1) {
                    Intent intent = new Intent(getBaseContext(), Q4Activity.class);
                    startActivity(intent);
                }
            }
        });
        myList.setAdapter(adapter);



    }
}
