package com.example.student.a2018011002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent it=getIntent();
        Bundle b=it.getExtras();
        String str=b.getString("data");
        TextView tv=findViewById(R.id.textView);
        tv.setText(str);

    }
}
