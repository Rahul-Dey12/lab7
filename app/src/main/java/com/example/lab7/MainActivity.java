package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openCamera(View v){
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }
    public void openMap(View v){
        String s ="bankura";
        Uri u = Uri.parse("geo:?q="+s);
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
    public void openBrowser(View v){
        String s = "www.google.com";
        Uri u = Uri.parse("http://"+s);
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
    public void call(View v){
        String s ="+917992632090";
        Uri u = Uri.parse("tel:"+s);
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
}
