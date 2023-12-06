package com.example.appbelajar;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BelajarActivity extends AppCompatActivity {

    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.belajarpengucapan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,PengucapanActivity.class);
                startActivity(intent);
                //  mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.belajarpenjumlahan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,PenjumlahanActivity.class);
                startActivity(intent);
                //  mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.belajarpengurangan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,PenguranganActivity.class);
                startActivity(intent);
                //  mp.stop();

            }
        });
        pindah = (ImageButton) findViewById(R.id.belajarpengucapanhuruf);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,PengucapanHurufActivity.class);
                startActivity(intent);
                //  mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,BelajarberhitungActivity.class);
                startActivity(intent);
                //  mp.stop();

            }
        });
    }
}