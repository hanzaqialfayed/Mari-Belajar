package com.example.appbelajar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PenguranganActivity extends AppCompatActivity{
    ImageButton pindah;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pengurangan);
            pindah = (ImageButton) findViewById(R.id.back);
            pindah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // suaraButton.start();
                    Intent intent = new Intent(PenguranganActivity.this,BelajarActivity.class);
                    startActivity(intent);
                    //  mp.stop();
                }
            });
        }

}

