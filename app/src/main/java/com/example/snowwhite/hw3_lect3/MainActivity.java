package com.example.snowwhite.hw3_lect3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playMusic(View view) {
        //This intent leads to the Service created
        Log.d("Start: ", "Here");
        Intent objIntent = new Intent(this, MusicService.class);
        startService(objIntent);
    }
}
