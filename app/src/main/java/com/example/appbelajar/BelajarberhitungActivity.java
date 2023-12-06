package com.example.appbelajar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.content.pm.ActivityInfo;

import androidx.appcompat.app.AppCompatActivity;

public class BelajarberhitungActivity extends AppCompatActivity {
    ImageButton pindah;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajarberhitung);

        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button1);
        mp = MediaPlayer.create(getBaseContext(),R.raw.backgrounddd);
        mp.start();
        //set layout landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.btnBelajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(BelajarberhitungActivity.this,BelajarActivity.class);
                startActivity(intent);
                // mp.stop();
            }
        });
        pindah = (ImageButton) findViewById(R.id.btnback);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BelajarberhitungActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void onDestroy() {
        mp.stop();
        super.onDestroy();
    }
}
