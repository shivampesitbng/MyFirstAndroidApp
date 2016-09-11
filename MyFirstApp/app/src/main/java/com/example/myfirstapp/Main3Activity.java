package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void sendMessage4(View view) {
        Intent intent4 = new Intent(Intent.ACTION_VIEW);
        intent4.setData(Uri.parse("http://files.stupidsid.com/university_papers/VTU/D14/TE/CS/5.pdf"));
        startActivity(intent4);
    }
    public void sendMessage5(View view) {
        // Do something in response to button
        Intent intent5 = new Intent(this, Main4Activity.class);
        startActivity(intent5);
    }

}
