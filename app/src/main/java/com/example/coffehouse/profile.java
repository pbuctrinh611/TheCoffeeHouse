package com.example.coffehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    ImageView img_close;
    TextView tv_doitt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageView img_close=(ImageView) findViewById(R.id.img_close);
        TextView tv_doitt=(TextView) findViewById(R.id.tv_doitt);;
        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv_doitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(profile.this,edit_profile.class);
                startActivity(intent);
            }
        });
    }
}