package com.example.akashproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity2 extends AppCompatActivity {

    TextView music;
    MediaPlayer splash_sound;

    @Override
    protected void onPause() {
        super.onPause();
            splash_sound.release();
            finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        music = findViewById(R.id.textView4);
        splash_sound = MediaPlayer.create(SplashActivity2.this, R.raw.splash_sound);
        splash_sound.start();

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3500);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity2.this, SplashActivity3.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();

    }
}