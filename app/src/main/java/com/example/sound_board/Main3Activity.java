package com.example.sound_board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private MediaPlayer mMediaplayer;
    private Button mPlay, mPause;
    private Button bac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mPause = findViewById(R.id.pause);
        mPlay = findViewById(R.id.play);
        mMediaplayer = MediaPlayer.create(this, R.raw.extremeaction);

        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaplayer.start();
            }
        });
        mPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMediaplayer.pause();
            }
        });

        bac = (Button) findViewById(R.id.bac);
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
