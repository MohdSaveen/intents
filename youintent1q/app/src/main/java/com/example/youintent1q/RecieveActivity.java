package com.example.youintent1q;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecieveActivity extends AppCompatActivity {
private TextView mtvname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mtvname=findViewById(R.id.tvname);
        if(getIntent()!=null){
            String name=getIntent().getStringExtra("key");
            mtvname.setText(name);
        }

    }
}