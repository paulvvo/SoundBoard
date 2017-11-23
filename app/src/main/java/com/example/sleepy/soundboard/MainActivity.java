package com.example.sleepy.soundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<MediaPlayer> soundLib = new ArrayList<MediaPlayer>();

    public void playSound(View view){


        int id = view.getId();
        String ourId = view.getResources().getResourceEntryName(id);


        String var = view.getTag().toString();
        Log.i("Tag Button Number", "Tag# "+var + " works! aka..." + ourId );

        soundLib.get(Integer.parseInt(view.getTag().toString())).start();



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundLib.add(MediaPlayer.create(this,R.raw.dog));
        soundLib.add(MediaPlayer.create(this,R.raw.hyena));
        soundLib.add(MediaPlayer.create(this,R.raw.icecube));
        soundLib.add(MediaPlayer.create(this,R.raw.iceskate));
        soundLib.add(MediaPlayer.create(this,R.raw.marbles));
        soundLib.add(MediaPlayer.create(this,R.raw.sawwood));
        soundLib.add(MediaPlayer.create(this,R.raw.slotmachine));
        soundLib.add(MediaPlayer.create(this,R.raw.train));


    }
}
