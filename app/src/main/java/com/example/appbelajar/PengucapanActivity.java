package com.example.appbelajar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PengucapanActivity extends AppCompatActivity {
    ImageButton klik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengucapan);
        final MediaPlayer suaraButton1 = MediaPlayer.create(this, R.raw.suara1);
        final MediaPlayer suaraButton2 = MediaPlayer.create(this, R.raw.suara2);
        final MediaPlayer suaraButton3 = MediaPlayer.create(this, R.raw.suara3);
        final MediaPlayer suaraButton4 = MediaPlayer.create(this, R.raw.suara4);
        final MediaPlayer suaraButton5 = MediaPlayer.create(this, R.raw.suara5);
        final MediaPlayer suaraButton6 = MediaPlayer.create(this, R.raw.suara6);
        final MediaPlayer suaraButton7 = MediaPlayer.create(this, R.raw.suara7);
        final MediaPlayer suaraButton8 = MediaPlayer.create(this, R.raw.suara8);
        final MediaPlayer suaraButton9 = MediaPlayer.create(this, R.raw.suara9);
        final MediaPlayer suaraButton10 = MediaPlayer.create(this, R.raw.suara10);



        klik = (ImageButton) findViewById(R.id.btn1);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton1.start();
            }
        });
        klik = (ImageButton) findViewById(R.id.btn2);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton2.start();
            }
        });
        klik = (ImageButton) findViewById(R.id.btn3);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton3.start();
            }
        });
        klik = (ImageButton) findViewById(R.id.btn4);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton4.start();
            }
        });
        klik = (ImageButton) findViewById(R.id.btn5);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton5.start();
            }
        });
        klik = (ImageButton) findViewById(R.id.btn6);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton6.start();
            }
        });
        klik = (ImageButton) findViewById(R.id.btn7);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton7.start();
            }
        });
        klik = (ImageButton) findViewById(R.id.btn8);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton8.start();
            }
        });
        klik = (ImageButton) findViewById(R.id.btn9);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton9.start();
            }
        });
        klik = (ImageButton) findViewById(R.id.btn10);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton10.start();
            }



        });
        klik = (ImageButton) findViewById(R.id.back);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PengucapanActivity.this,BelajarActivity.class);
                startActivity(intent);
                // mp.stop();
            }
        });




    }
}

