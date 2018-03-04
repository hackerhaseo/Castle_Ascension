package com.example.castleascension;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    private Button btn1, btn3;
    private ImageView bg;
    private ToggleButton toggle;
    private TextView music;
    private MediaPlayer bgm, click;
    Boolean checked = true, checker = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        checked = true;
        setContentView(R.layout.activity_main);
        music = findViewById(R.id.music);
        bg = findViewById(R.id.bg);
        btn1 = findViewById(R.id.btn1);
        btn3 = findViewById(R.id.btn3);
        toggle = findViewById(R.id.toggle);
        toggle.setChecked(true);
        bgm = MediaPlayer.create(getApplicationContext(), R.raw.main_theme);
        click = MediaPlayer.create(getApplicationContext(), R.raw.click_sfx);
        bgm.setLooping(true);
        bgm.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        bgm.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        bgm.start();
    }

    public void game(View v) {
        click.start();
        Intent gameStart = new Intent(this, game_main.class);
        gameStart.putExtra("toggle", checked);
        startActivity(gameStart);
        finish();
    }

    public void options(View v) {
        click.start();
        checked = ((ToggleButton) v).isChecked();
        if(checked) {
            bgm.start();
        }
        else {
            bgm.pause();
        }
    }

    public void about(View v) {
        click.start();
        Intent aboutUs = new Intent(this, us_about.class);
        startActivity(aboutUs);
        finish();
    }
}
