package com.example.castleascension;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class us_about extends Activity {

    private ImageView bg, gameworks, prof_logo;
    private TextView text;
    private Button back;
    private MediaPlayer click;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        bg = findViewById(R.id.bg);
        gameworks = findViewById(R.id.gameworks);
        prof_logo = findViewById(R.id.prof_logo);
        text = findViewById(R.id.text);
        back = findViewById(R.id.back);
        click = MediaPlayer.create(getApplicationContext(), R.raw.click_sfx);
    }

    public void main(View v) {
        click.start();
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
        finish();
    }

}
