package com.example.android.rings;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    SoundPool sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.i1);
        b2= findViewById(R.id.i2);
        b3= findViewById(R.id.i3);
        b4= findViewById(R.id.i4);
        b5= findViewById(R.id.i5);
        b6= findViewById(R.id.i6);
        b7 =findViewById(R.id.i7);



        final   SoundPool sp=new SoundPool(7,AudioManager.STREAM_MUSIC,0);
        final int A=sp.load(this,R.raw.a_key,1);
        final int G=sp.load(this,R.raw.g_key,1);
        final int B=sp.load(this,R.raw.b_key,1);
        final int C=sp.load(this,R.raw.c_key,1);
        final int D=sp.load(this,R.raw.d_key,1);
        final int E=sp.load(this,R.raw.e_key,1);
        final int F=sp.load(this,R.raw.f_key,1);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               sp.play(C,1,9,1,0,1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.play(D,1,8,1,0,1);

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.play(E,1,7,1,0,1);


            }
        });



        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.play(F,1,6,1,0,1);

                MediaPlayer mp=MediaPlayer.create(MainActivity.this,R.raw.f_key);
                mp.start();
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.play(G,1,5,1,0,1);

                MediaPlayer mp=MediaPlayer.create(MainActivity.this,R.raw.g_key);
                mp.start();
            }
        });



        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.play(A,1,4,1,0,1);

                MediaPlayer mp=MediaPlayer.create(MainActivity.this,R.raw.a_key);
                mp.start();
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp.play(B,1,3,1,0,1);


            }
        });

    }
}
