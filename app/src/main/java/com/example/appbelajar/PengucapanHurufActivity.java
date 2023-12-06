package com.example.appbelajar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PengucapanHurufActivity extends AppCompatActivity {


        ImageButton klik;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pengucapanhuruf);
            final MediaPlayer suaraButton1 = MediaPlayer.create(this, R.raw.suara_a);
            final MediaPlayer suaraButton2 = MediaPlayer.create(this, R.raw.suara_b);
            final MediaPlayer suaraButton3 = MediaPlayer.create(this, R.raw.suara_c);
            final MediaPlayer suaraButton4 = MediaPlayer.create(this, R.raw.suara_d);
            final MediaPlayer suaraButton5 = MediaPlayer.create(this, R.raw.suara_e);
            final MediaPlayer suaraButton6 = MediaPlayer.create(this, R.raw.suara_f);
            final MediaPlayer suaraButton7 = MediaPlayer.create(this, R.raw.suara_g);
            final MediaPlayer suaraButton8 = MediaPlayer.create(this, R.raw.suara_h);
            final MediaPlayer suaraButton9 = MediaPlayer.create(this, R.raw.suara_i);
            final MediaPlayer suaraButton10 = MediaPlayer.create(this, R.raw.suara_j);
            final MediaPlayer suaraButton11 = MediaPlayer.create(this, R.raw.suara_k);
            final MediaPlayer suaraButton12 = MediaPlayer.create(this, R.raw.suara_l);
            final MediaPlayer suaraButton13 = MediaPlayer.create(this, R.raw.suara_m);
            final MediaPlayer suaraButton14 = MediaPlayer.create(this, R.raw.suara_n);
            final MediaPlayer suaraButton15 = MediaPlayer.create(this, R.raw.suara_o);
            final MediaPlayer suaraButton16 = MediaPlayer.create(this, R.raw.suara_p);
            final MediaPlayer suaraButton17 = MediaPlayer.create(this, R.raw.suara_q);
            final MediaPlayer suaraButton18 = MediaPlayer.create(this, R.raw.suara_r);
            final MediaPlayer suaraButton19 = MediaPlayer.create(this, R.raw.suara_s);
            final MediaPlayer suaraButton20 = MediaPlayer.create(this, R.raw.suara_t);
            final MediaPlayer suaraButton21 = MediaPlayer.create(this, R.raw.suara_u);
            final MediaPlayer suaraButton22 = MediaPlayer.create(this, R.raw.suara_v);
            final MediaPlayer suaraButton23 = MediaPlayer.create(this, R.raw.suara_w);
            final MediaPlayer suaraButton24 = MediaPlayer.create(this, R.raw.suara_x);
            final MediaPlayer suaraButton25 = MediaPlayer.create(this, R.raw.suara_y);
            final MediaPlayer suaraButton26 = MediaPlayer.create(this, R.raw.suara_z);




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
            klik = (ImageButton) findViewById(R.id.btn11);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton11.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn12);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton12.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn13);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton13.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn14);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton14.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn15);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton15.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn16);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton16.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn17);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton17.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn18);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton18.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn19);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton19.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn20);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton20.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn21);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton21.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn22);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton22.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn23);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton23.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn24);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton24.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn25);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton25.start();
                }
            });
            klik = (ImageButton) findViewById(R.id.btn26);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton26.start();
                }


            });
            klik = (ImageButton) findViewById(R.id.back);
            klik.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(PengucapanHurufActivity.this,BelajarActivity.class);
                    startActivity(intent);
                    // mp.stop();
                }
            });



        }

}
