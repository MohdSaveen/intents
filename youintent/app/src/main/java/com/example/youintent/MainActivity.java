package com.example.youintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText mEtText;
private Button mbtnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtText=findViewById(R.id.Etname);
        mbtnSend=findViewById(R.id.btnsend);
        mbtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setAction("android.intent.action.saveen");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.putExtra("key",mEtText.getText().toString());
                startActivity(intent);
            }
        });
    }
}