package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void sendMessage6(View view) {
        // Do something in response to button
        Intent intent4 = new Intent(Intent.ACTION_VIEW);
        intent4.setData(Uri.parse("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=components%20of%20data%20communication%20system"));
        startActivity(intent4);
    }
}
