package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent i=getIntent();
        String s=i.getStringExtra("msg");

        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
    }

    public void prev(View v){
        Intent i= new Intent(this,Main2Activity.class);
        startActivity(i);
        finish();
    }
}
