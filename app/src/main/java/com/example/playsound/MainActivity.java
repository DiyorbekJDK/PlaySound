package com.example.playsound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        makeNoise();


    }

    private void makeNoise() {
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.one);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.nwo);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.three);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.four);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.five);
        MaterialButton button1 = findViewById(R.id.btn1);
        MaterialButton button2 = findViewById(R.id.btn2);
        MaterialButton button3 = findViewById(R.id.btn3);
        MaterialButton button4 = findViewById(R.id.btn4);
        MaterialButton button5 = findViewById(R.id.btn5);
        MaterialButton exitButton = findViewById(R.id.btnExit);

        button1.setOnClickListener(view -> mediaPlayer.start());
        button2.setOnClickListener(view -> mediaPlayer2.start());
        button3.setOnClickListener(view -> mediaPlayer3.start());
        button4.setOnClickListener(view -> mediaPlayer4.start());
        button5.setOnClickListener(view -> mediaPlayer5.start());
        exitButton.setOnClickListener(view -> finish());


    }
}