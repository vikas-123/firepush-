package com.example.vikas.firepushs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         tv = (TextView)findViewById(R.id.txt);

        Intent intent = getIntent();

        String id = intent.getStringExtra("message");

        tv.setText(id);
    }
}
