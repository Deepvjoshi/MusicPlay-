package com.example.deepjoshi.song_play;

import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File dir= Environment.getExternalStorageDirectory();
       final Button btp=(Button)findViewById(R.id.button_play);
        Button btps=(Button)findViewById(R.id.button_ps);
        Button btsp=(Button)findViewById(R.id.button_stop);

       final MediaPlayer mp=MediaPlayer.create(MainActivity.this,R.raw.isq_rang);
        btp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        btps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
        btsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
                MainActivity.this.finish();//relis ave ho
            }
        });
    }
}
