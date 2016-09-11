package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }
    public void sendMessage2(View view) {
        // Do something in response to button
        Intent intent2 = new Intent(this, Main2Activity.class);
        startActivity(intent2);
    }
}
