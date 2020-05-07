package com.example.saikumar.star_dice;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.SystemClock;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random=new Random();

    Dialog dialog;
    TextView winningname;
    Button replay;

    String p1status,p2status;

    ImageView p1img,p2img,p1hand,p2hand;

    Button p2color,p1color;

    boolean p1checker=false;
    boolean p2checker=false;
    boolean p1b6check=false;
    boolean p1b2check=false;
    boolean p1b3check=false;
    boolean p1b4check=false;
    boolean p1b5check=false;
    boolean p2b6check=false;
    boolean p2b2check=false;
    boolean p2b3check=false;
    boolean p2b4check=false;
    boolean p2b5check=false;
    boolean p1check=false;
    boolean p2check=false;


    String p1name,p2name,win;

    String temp1="p1win";

    TextView player1name,player2name;

    boolean p1one=true;
    boolean p1two=true;
    boolean p1three=true;
    boolean p1four=true;
    boolean p1five=true;
    boolean p2one=true;
    boolean p2two=true;
    boolean p2three=true;
    boolean p2four=true;
    boolean p2five=true;

    String b1="p1a1",b2="p1a2",b3="p1a3",b4="p1a4",b5="p2a1",b6="p2a2",b7="p2a3",b8="p2a4";

    int p1score=1,p2score=5;

    Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,
            c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59,
            c60,c61,c62,c63,c64,c65,c66,c67,c68,c69,c70,c71,c72,c73,c74,c75,c76;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        deleteCache(this);
        // clearApplicationData();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        p1status=getIntent().getExtras().getString("p1");
        p2status=getIntent().getExtras().getString("p2");

        p1img=findViewById(R.id.player1avt);
        p2img=findViewById(R.id.player2avt);
        p1hand=findViewById(R.id.p1hand);
        p2hand=findViewById(R.id.p2hand);

        dialog=new Dialog(this);

        p1color=findViewById(R.id.p1colorbtn);
        p2color=findViewById(R.id.p2colorbtn);

        p1name=getIntent().getExtras().getString("player1");
        p2name=getIntent().getExtras().getString("player2");
        win=getIntent().getExtras().getString("win");

        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
        c8=findViewById(R.id.c8);
        c9=findViewById(R.id.c9);
        c10=findViewById(R.id.c10);
        c11=findViewById(R.id.c11);
        c12=findViewById(R.id.c12);
        c13=findViewById(R.id.c13);
        c14=findViewById(R.id.c14);
        c15=findViewById(R.id.c15);
        c16=findViewById(R.id.c16);
        c17=findViewById(R.id.c17);
        c18=findViewById(R.id.c18);
        c19=findViewById(R.id.c19);
        c20=findViewById(R.id.c20);
        c21=findViewById(R.id.c21);
        c22=findViewById(R.id.c22);
        c23=findViewById(R.id.c23);
        c24=findViewById(R.id.c24);
        c25=findViewById(R.id.c25);
        c26=findViewById(R.id.c26);
        c27=findViewById(R.id.c27);
        c28=findViewById(R.id.c28);
        c29=findViewById(R.id.c29);
        c30=findViewById(R.id.c30);
        c31=findViewById(R.id.c31);
        c32=findViewById(R.id.c32);
        c33=findViewById(R.id.c33);
        c34=findViewById(R.id.c34);
        c35=findViewById(R.id.c35);
        c36=findViewById(R.id.c36);
        c37=findViewById(R.id.c37);
        c38=findViewById(R.id.c38);
        c39=findViewById(R.id.c39);
        c40=findViewById(R.id.c40);
        c41=findViewById(R.id.c41);
        c42=findViewById(R.id.c42);
        c43=findViewById(R.id.c43);
        c44=findViewById(R.id.c44);
        c45=findViewById(R.id.c45);
        c46=findViewById(R.id.c46);
        c47=findViewById(R.id.c47);
        c48=findViewById(R.id.c48);
        c49=findViewById(R.id.c49);
        c50=findViewById(R.id.c50);
        c51=findViewById(R.id.c51);
        c52=findViewById(R.id.c52);
        c53=findViewById(R.id.c53);
        c54=findViewById(R.id.c54);
        c55=findViewById(R.id.c55);
        c56=findViewById(R.id.c56);
        c57=findViewById(R.id.c57);
        c58=findViewById(R.id.c58);
        c59=findViewById(R.id.c59);
        c60=findViewById(R.id.c60);
        c61=findViewById(R.id.c61);
        c62=findViewById(R.id.c62);
        c63=findViewById(R.id.c63);
        c64=findViewById(R.id.c64);
        c65=findViewById(R.id.c65);
        c66=findViewById(R.id.c66);
        c67=findViewById(R.id.c67);
        c68=findViewById(R.id.c68);
        c69=findViewById(R.id.c69);
        c70=findViewById(R.id.c70);
        c71=findViewById(R.id.c71);
        c72=findViewById(R.id.c72);
        c73=findViewById(R.id.c73);
        c74=findViewById(R.id.c74);
        c75=findViewById(R.id.c75);
        c76=findViewById(R.id.c76);

        player1name=findViewById(R.id.player1name);
        player2name=findViewById(R.id.player2name);

        player1name.setText(p1name);
        player2name.setText(p2name);

        Animation blinkLogo = AnimationUtils.loadAnimation(this, R.anim.blinkanim);
        p1hand.setAnimation(blinkLogo);
        p2hand.setAnimation(blinkLogo);

        final RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);
        rotate.setInterpolator(new LinearInterpolator());

        if(win.equals(temp1))
        {
            p1color.setVisibility(View.VISIBLE);
            p1checker=true;
          //  Toast.makeText(MainActivity.this,"player1",Toast.LENGTH_LONG).show();
        }
        else
        {
            p2color.setVisibility(View.VISIBLE);
            p2checker=true;
           // Toast.makeText(MainActivity.this,"player2",Toast.LENGTH_LONG).show();
        }


        if(p1status.equals(b1))
        {
            p1img.setImageResource(R.drawable.boy);
        }
        if(p1status.equals(b2))
        {
            p1img.setImageResource(R.drawable.boy1);
        }
        if(p1status.equals(b3))
        {
            p1img.setImageResource(R.drawable.woman);
        }
        if(p1status.equals(b4))
        {
            p1img.setImageResource(R.drawable.woman1);
        }
        if(p2status.equals(b5))
        {
            p2img.setImageResource(R.drawable.boy);
        }
        if(p2status.equals(b6))
        {
            p2img.setImageResource(R.drawable.boy1);
        }
        if(p2status.equals(b7))
        {
            p2img.setImageResource(R.drawable.woman);
        }
        if(p2status.equals(b8))
        {
            p2img.setImageResource(R.drawable.woman1);
        }


        if(p1checker)
        {

            p2color.setVisibility(View.INVISIBLE);
            p2hand.setVisibility(View.INVISIBLE);

            p1color.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    p1color.startAnimation(rotate);

                    MediaPlayer m1= MediaPlayer.create(MainActivity.this,R.raw.dicesound);
                    m1.start();

                    int dicenumber=random.nextInt(5)+1;
                    switch (dicenumber) {
                        case 1:
                          //  Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                            if(p1score<73)
                            {
                                p1color.setBackgroundResource(R.drawable.bg6);
                                if(p1one)
                                {
                                    p1score=p1score+1;
                                    p1one=false;
                                    p1two=false;
                                    p1three=false;
                                    p1four=false;
                                    p1five=false;
                                    p2check=true;
                                }
                                else if(p1b2check)
                                {
                                    p1score=p1score+4;
                                }
                                else if(p1b6check)
                                {
                                    p1score=p1score+5;
                                }
                                else if(p1b3check)
                                {
                                    p1score=p1score+3;
                                }
                                else if(p1b4check)
                                {
                                    p1score=p1score+2;
                                }
                                else if(p1b5check)
                                {
                                    p1score=p1score+1;
                                }
                                position();
                                p1b6check=true;
                                p1b2check=false;
                                p1b3check=false;
                                p1b4check=false;
                                p1b5check=false;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                                p1exceed();
                            }
                            break;
                        case 2:

                          //  Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                            if(p1score<69)
                            {
                                p1color.setBackgroundResource(R.drawable.bg2);
                                if(p1two)
                                {
                                    p1score=p1score+2;
                                    p1one=false;
                                    p1two=false;
                                    p1three=false;
                                    p1four=false;
                                    p1five=false;
                                    p2check=true;
                                }
                                else if(p1b6check)
                                {
                                    p1score=p1score+1;
                                }
                                else if(p1b2check)
                                {
                                    p1score=p1score+5;
                                }
                                else if(p1b3check)
                                {
                                    p1score=p1score+4;
                                }
                                else if(p1b4check)
                                {
                                    p1score=p1score+3;
                                }
                                else if(p1b5check)
                                {
                                    p1score=p1score+2;
                                }
                                position();
                                p1b2check=true;
                                p1b6check=false;
                                p1b3check=false;
                                p1b4check=false;
                                p1b5check=false;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                                p1exceed();
                            }

                            break;
                        case 3:
                         //   Toast.makeText(MainActivity.this,"3",Toast.LENGTH_SHORT).show();
                            if(p1score<70)
                            {
                                p1color.setBackgroundResource(R.drawable.bg3);
                                if(p1three)
                                {
                                    p1score=p1score+3;
                                    p1one=false;
                                    p1two=false;
                                    p1three=false;
                                    p1four=false;
                                    p1five=false;
                                    p2check=true;
                                }
                                else if(p1b6check)
                                {
                                    p1score=p1score+2;
                                }
                                else if(p1b2check)
                                {
                                    p1score=p1score+1;
                                }
                                else if(p1b3check)
                                {
                                    p1score=p1score+5;
                                }
                                else if(p1b4check)
                                {
                                    p1score=p1score+4;
                                }
                                else if(p1b5check)
                                {
                                    p1score=p1score+3;
                                }
                                position();
                                p1b2check=false;
                                p1b6check=false;
                                p1b3check=true;
                                p1b4check=false;
                                p1b5check=false;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                                p1exceed();
                            }

                            break;
                        case 4:

                         //   Toast.makeText(MainActivity.this,"4",Toast.LENGTH_SHORT).show();
                            if(p1score<71)
                            {
                                p1color.setBackgroundResource(R.drawable.bg4);
                                if(p1four)
                                {
                                    p1score=p1score+4;
                                    p1one=false;
                                    p1two=false;
                                    p1three=false;
                                    p1four=false;
                                    p1five=false;
                                    p2check=true;
                                }
                                if(p1b6check)
                                {
                                    p1score=p1score+3;
                                }
                                else if(p1b2check)
                                {
                                    p1score=p1score+2;
                                }
                                else if(p1b3check)
                                {
                                    p1score=p1score+1;
                                }
                                else if(p1b4check)
                                {
                                    p1score=p1score+5;
                                }
                                else if(p1b5check)
                                {
                                    p1score=p1score+4;
                                }
                                position();
                                p1b2check=false;
                                p1b6check=false;
                                p1b3check=false;
                                p1b4check=true;
                                p1b5check=false;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                                p1exceed();
                            }
                            break;
                        case 5:

                         //   Toast.makeText(MainActivity.this,"5",Toast.LENGTH_SHORT).show();
                            if(p1score<72)
                            {
                                p1color.setBackgroundResource(R.drawable.bg5);
                                if(p1five)
                                {
                                    p1score=p1score+5;
                                    p1one=false;
                                    p1two=false;
                                    p1three=false;
                                    p1four=false;
                                    p1five=false;
                                    p2check=true;
                                }
                                if(p1b6check)
                                {
                                    p1score=p1score+4;
                                }
                                else if(p1b2check)
                                {
                                    p1score=p1score+3;
                                }
                                else if(p1b3check)
                                {
                                    p1score=p1score+2;
                                }
                                else if(p1b4check)
                                {
                                    p1score=p1score+1;
                                }
                                else if(p1b5check)
                                {
                                    p1score=p1score+5;
                                }
                                position();
                                p1b2check=false;
                                p1b6check=false;
                                p1b3check=false;
                                p1b4check=false;
                                p1b5check=true;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                                p1exceed();
                            }
                            break;
                    }

                    p2color.setVisibility(View.VISIBLE);
                    p2hand.setVisibility(View.VISIBLE);

                    p2checker=true;
                    p1checker=false;
                    fun2();

                }


            });

        }

        if(p2checker)
        {

            p1color.setVisibility(View.INVISIBLE);
            p1hand.setVisibility(View.INVISIBLE);

            p2color.setVisibility(View.VISIBLE);
            p2hand.setVisibility(View.VISIBLE);

            p2color.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    p2color.startAnimation(rotate);

                    MediaPlayer m1= MediaPlayer.create(MainActivity.this,R.raw.dicesound);
                    m1.start();

                    int dicenumber=random.nextInt(5)+1;

                    switch (dicenumber) {
                        case 1:
                          //  Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                            if(p2score<78)
                            {
                                p2color.setBackgroundResource(R.drawable.bg5);
                                if(p2one)
                                {
                                    p2score=p2score+1;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+3;
                                }
                                else if(p2b6check)
                                {
                                    p2score=p2score+4;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+2;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+1;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+5;
                                }
                                position();
                                p2b6check=false;
                                p2b2check=false;
                                p2b3check=false;
                                p2b4check=false;
                                p2b5check=true;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                                p1exceed();
                            }
                            break;
                        case 2:

                          //  Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                            if(p2score<74)
                            {
                                p2color.setBackgroundResource(R.drawable.bg6);
                                if(p2two)
                                {
                                    p2score=p2score+2;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                else if(p2b6check)
                                {
                                    p2score=p2score+5;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+4;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+3;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+2;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+1;
                                }
                                position();
                                p2b2check=false;
                                p2b6check=true;
                                p2b3check=false;
                                p2b4check=false;
                                p2b5check=false;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                                p1exceed();
                            }

                            break;
                        case 3:
                          //  Toast.makeText(MainActivity.this,"3",Toast.LENGTH_SHORT).show();
                            if(p2score<75)
                            {
                                p2color.setBackgroundResource(R.drawable.bg2);
                                if(p2three)
                                {
                                    p2score=p2score+3;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                else if(p2b6check)
                                {
                                    p2score=p2score+1;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+5;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+4;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+3;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+2;
                                }
                                position();
                                p2b2check=true;
                                p2b6check=false;
                                p2b3check=false;
                                p2b4check=false;
                                p2b5check=false;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                                p1exceed();
                            }

                            break;
                        case 4:

                          //  Toast.makeText(MainActivity.this,"4",Toast.LENGTH_SHORT).show();
                            if(p1score<76)
                            {
                                p2color.setBackgroundResource(R.drawable.bg3);
                                if(p2four)
                                {
                                    p2score=p2score+4;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                if(p2b6check)
                                {
                                    p2score=p2score+2;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+1;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+5;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+4;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+3;
                                }
                                position();
                                p2b2check=false;
                                p2b6check=false;
                                p2b3check=true;
                                p2b4check=false;
                                p2b5check=false;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                                p1exceed();
                            }
                            break;
                        case 5:

                         //   Toast.makeText(MainActivity.this,"5",Toast.LENGTH_SHORT).show();
                            if(p2score<77)
                            {
                                p2color.setBackgroundResource(R.drawable.bg4);
                                if(p2five)
                                {
                                    p2score=p2score+5;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                if(p2b6check)
                                {
                                    p2score=p2score+3;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+2;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+1;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+5;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+4;
                                }
                                position();
                                p2b2check=false;
                                p2b6check=false;
                                p2b3check=false;
                                p2b4check=true;
                                p2b5check=false;
                                SystemClock.sleep(500);
                            }
                            else
                            {
                                p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                                p1exceed();
                            }
                            break;
                    }

                    p2checker=false;
                    p1checker=true;

                    fun1();
                }


            });

        }

    }




    private void fun2() {

        if(p2score<39)
        {

            p1color.setVisibility(View.INVISIBLE);
            p1hand.setVisibility(View.INVISIBLE);

            p2color.setVisibility(View.VISIBLE);
            p2hand.setVisibility(View.VISIBLE);

            p2color.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    rotate.setDuration(1000);
                    rotate.setInterpolator(new LinearInterpolator());


                    p2color.startAnimation(rotate);

                    MediaPlayer m1= MediaPlayer.create(MainActivity.this,R.raw.dicesound);
                    m1.start();

                    int dicenumber=random.nextInt(5)+1;

                    switch (dicenumber) {
                        case 1:
                         //   Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                                p2color.setBackgroundResource(R.drawable.bg5);
                                if(p2one)
                                {
                                    p2score=p2score+1;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                else if(p2score==34 || p2score==35 || p2score==36 || p2score==37 || p2score==38)
                                {
                                    p2score=39;
                                    position();
                                    p2one=true;
                                    p2two=true;
                                    p2three=true;
                                    p2four=true;
                                    p2five=true;
                                    p2b6check=false;
                                    p2b2check=false;
                                    p2b3check=false;
                                    p2b4check=false;
                                    p2b5check=false;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+3;
                                }
                                else if(p2b6check)
                                {
                                    p2score=p2score+4;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+2;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+1;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+5;
                                }

                                position();
                                p2b6check=false;
                                p2b2check=false;
                                p2b3check=false;
                                p2b4check=false;
                                p2b5check=true;
                                SystemClock.sleep(500);


                            break;
                        case 2:

                         //   Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                               p2color.setBackgroundResource(R.drawable.bg6);
                                if(p2two)
                                {
                                    p2score=p2score+2;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                else if(p2score==34 || p2score==35 || p2score==36 || p2score==37 || p2score==38)
                                {
                                    p2score=39;
                                    position();
                                    p2one=true;
                                    p2two=true;
                                    p2three=true;
                                    p2four=true;
                                    p2five=true;
                                    p2b6check=false;
                                    p2b2check=false;
                                    p2b3check=false;
                                    p2b4check=false;
                                    p2b5check=false;
                                }
                                else if(p2b6check)
                                {
                                    p2score=p2score+5;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+4;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+3;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+2;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+1;
                                }

                                position();
                                p2b2check=false;
                                p2b6check=true;
                                p2b3check=false;
                                p2b4check=false;
                                p2b5check=false;
                                SystemClock.sleep(500);

                            break;
                        case 3:
                         //   Toast.makeText(MainActivity.this,"3",Toast.LENGTH_SHORT).show();
                                p2color.setBackgroundResource(R.drawable.bg2);
                                if(p2three)
                                {
                                    p2score=p2score+3;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                else if(p2score==34 || p2score==35 || p2score==36 || p2score==37 || p2score==38)
                                {
                                    p2score=39;
                                    position();
                                    p2one=true;
                                    p2two=true;
                                    p2three=true;
                                    p2four=true;
                                    p2five=true;
                                    p2b6check=false;
                                    p2b2check=false;
                                    p2b3check=false;
                                    p2b4check=false;
                                    p2b5check=false;
                                }
                                else if(p2b6check)
                                {
                                    p2score=p2score+1;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+5;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+4;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+3;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+2;
                                }


                                position();
                                p2b2check=true;
                                p2b6check=false;
                                p2b3check=false;
                                p2b4check=false;
                                p2b5check=false;
                                SystemClock.sleep(500);


                            break;
                        case 4:

                         //   Toast.makeText(MainActivity.this,"4",Toast.LENGTH_SHORT).show();

                                p2color.setBackgroundResource(R.drawable.bg3);
                                if(p2four)
                                {
                                    p2score=p2score+4;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                else if(p2score==34 || p2score==35 || p2score==36 || p2score==37 || p2score==38)
                                {
                                    p2score=39;
                                    position();
                                    p2one=true;
                                    p2two=true;
                                    p2three=true;
                                    p2four=true;
                                    p2five=true;
                                    p2b6check=false;
                                    p2b2check=false;
                                    p2b3check=false;
                                    p2b4check=false;
                                    p2b5check=false;
                                }
                                if(p2b6check)
                                {
                                    p2score=p2score+2;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+1;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+5;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+4;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+3;
                                }

                                position();
                                p2b2check=false;
                                p2b6check=false;
                                p2b3check=true;
                                p2b4check=false;
                                p2b5check=false;
                                SystemClock.sleep(500);
                            break;
                        case 5:

                         //   Toast.makeText(MainActivity.this,"5",Toast.LENGTH_SHORT).show();
                               p2color.setBackgroundResource(R.drawable.bg4);
                                if(p2five)
                                {
                                    p2score=p2score+5;
                                    p2one=false;
                                    p2two=false;
                                    p2three=false;
                                    p2four=false;
                                    p2five=false;
                                    p1check=true;
                                }
                                else if(p2score==34 || p2score==35 || p2score==36 || p2score==37 || p2score==38)
                                {
                                    p2score=39;
                                    position();
                                    p2one=true;
                                    p2two=true;
                                    p2three=true;
                                    p2four=true;
                                    p2five=true;
                                    p2b6check=false;
                                    p2b2check=false;
                                    p2b3check=false;
                                    p2b4check=false;
                                    p2b5check=false;
                                }
                                else if(p2b6check)
                                {
                                    p2score=p2score+3;
                                }
                                else if(p2b2check)
                                {
                                    p2score=p2score+2;
                                }
                                else if(p2b3check)
                                {
                                    p2score=p2score+1;
                                }
                                else if(p2b4check)
                                {
                                    p2score=p2score+5;
                                }
                                else if(p2b5check)
                                {
                                    p2score=p2score+4;
                                }

                                position();
                                p2one=true;
                                p2two=true;
                                p2three=true;
                                p2four=true;
                                p2five=true;
                                SystemClock.sleep(500);

                            break;
                    }

                    p2checker=false;
                    p1checker=true;

                    fun1();
                }
            });

        }
        else
        {
            fun3();
        }


    }

    private void fun3() {

        p1color.setVisibility(View.INVISIBLE);
        p1hand.setVisibility(View.INVISIBLE);

        p2color.setVisibility(View.VISIBLE);
        p2hand.setVisibility(View.VISIBLE);

        p2color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(1000);
                rotate.setInterpolator(new LinearInterpolator());


                p2color.startAnimation(rotate);

                MediaPlayer m1= MediaPlayer.create(MainActivity.this,R.raw.dicesound);
                m1.start();

                int dicenumber=random.nextInt(5)+1;
                switch (dicenumber) {
                    case 1:
                     //   Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                        if(p2score<75)
                        {
                            p2color.setBackgroundResource(R.drawable.bg6);
                            if(p2one)
                            {
                                p2score=p2score+1;
                                p2one=false;
                                p2two=false;
                                p2three=false;
                                p2four=false;
                                p2five=false;
                            }
                            else if(p2b2check)
                            {
                                p2score=p2score+4;
                            }
                            else if(p2b6check)
                            {
                                p2score=p2score+5;
                            }
                            else if(p2b3check)
                            {
                                p2score=p2score+3;
                            }
                            else if(p2b4check)
                            {
                                p2score=p2score+2;
                            }
                            else if(p2b5check)
                            {
                                p2score=p2score+1;
                            }
                            position();
                            p2b6check=true;
                            p2b2check=false;
                            p2b3check=false;
                            p2b4check=false;
                            p2b5check=false;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                            p2exceed();
                        }
                        break;
                    case 2:

                     //   Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                        if(p2score<76)
                        {
                            p2color.setBackgroundResource(R.drawable.bg2);
                            if(p2two)
                            {
                                p2score=p2score+2;
                                p2one=false;
                                p2two=false;
                                p2three=false;
                                p2four=false;
                                p2five=false;
                            }
                            else if(p2b6check)
                            {
                                p2score=p2score+1;
                            }
                            else if(p2b2check)
                            {
                                p2score=p2score+5;
                            }
                            else if(p2b3check)
                            {
                                p2score=p2score+4;
                            }
                            else if(p2b4check)
                            {
                                p2score=p2score+3;
                            }
                            else if(p2b5check)
                            {
                                p2score=p2score+2;
                            }
                            position();
                            p2b2check=true;
                            p2b6check=false;
                            p2b3check=false;
                            p2b4check=false;
                            p2b5check=false;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                            p2exceed();
                        }

                        break;
                    case 3:
                     //   Toast.makeText(MainActivity.this,"3",Toast.LENGTH_SHORT).show();
                        if(p2score<72)
                        {
                            p2color.setBackgroundResource(R.drawable.bg3);
                            if(p2three)
                            {
                                p2score=p2score+3;
                                p2one=false;
                                p2two=false;
                                p2three=false;
                                p2four=false;
                                p2five=false;
                            }
                            else if(p2b6check)
                            {
                                p2score=p2score+2;
                            }
                            else if(p2b2check)
                            {
                                p2score=p2score+1;
                            }
                            else if(p2b3check)
                            {
                                p2score=p2score+5;
                            }
                            else if(p2b4check)
                            {
                                p2score=p2score+4;
                            }
                            else if(p2b5check)
                            {
                                p2score=p2score+3;
                            }
                            position();
                            p2b2check=false;
                            p2b6check=false;
                            p2b3check=true;
                            p2b4check=false;
                            p2b5check=false;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                            p2exceed();
                        }

                        break;
                    case 4:

                     //   Toast.makeText(MainActivity.this,"4",Toast.LENGTH_SHORT).show();
                        if(p2score<73)
                        {
                            p2color.setBackgroundResource(R.drawable.bg4);
                            if(p2four)
                            {
                                p2score=p2score+4;
                                p2one=false;
                                p2two=false;
                                p2three=false;
                                p2four=false;
                                p2five=false;
                            }
                            if(p2b6check)
                            {
                                p2score=p2score+3;
                            }
                            else if(p2b2check)
                            {
                                p2score=p2score+2;
                            }
                            else if(p2b3check)
                            {
                                p2score=p2score+1;
                            }
                            else if(p2b4check)
                            {
                                p2score=p2score+5;
                            }
                            else if(p2b5check)
                            {
                                p2score=p2score+4;
                            }
                            position();
                            p2b2check=false;
                            p2b6check=false;
                            p2b3check=false;
                            p2b4check=true;
                            p2b5check=false;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                            p2exceed();
                        }
                        break;
                    case 5:

                     //   Toast.makeText(MainActivity.this,"5",Toast.LENGTH_SHORT).show();
                        if(p2score<74)
                        {
                            p2color.setBackgroundResource(R.drawable.bg5);
                            if(p2five)
                            {
                                p2score=p2score+5;
                                p2one=false;
                                p2two=false;
                                p2three=false;
                                p2four=false;
                                p2five=false;
                            }
                            if(p2b6check)
                            {
                                p2score=p2score+4;
                            }
                            else if(p2b2check)
                            {
                                p2score=p2score+3;
                            }
                            else if(p1b3check)
                            {
                                p2score=p2score+2;
                            }
                            else if(p2b4check)
                            {
                                p2score=p2score+1;
                            }
                            else if(p2b5check)
                            {
                                p2score=p2score+5;
                            }
                            position();
                            p2b2check=false;
                            p2b6check=false;
                            p2b3check=false;
                            p2b4check=false;
                            p2b5check=true;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p2color.setBackgroundResource(R.drawable.p2_btn_bg1);
                            p2exceed();
                        }
                        break;
                }

                p1color.setVisibility(View.VISIBLE);
                p1hand.setVisibility(View.VISIBLE);

                p1checker=true;
                p2checker=false;

                fun1();

            }


        });


    }

    private void p2exceed() {

        String temp=player1name.getText().toString();

        dialog.setContentView(R.layout.winninglayout);
        winningname=dialog.findViewById(R.id.winningname);
        replay=dialog.findViewById(R.id.replaybtn);
        winningname.setText(temp);
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,avatar_selection.class);
                startActivity(intent);
                finish();

            }
        });
        dialog.show();
        dialog.setCancelable(false);

    }


    private void fun1() {

        p2color.setVisibility(View.INVISIBLE);
        p2hand.setVisibility(View.INVISIBLE);

        p1color.setVisibility(View.VISIBLE);
        p1hand.setVisibility(View.VISIBLE);

        p1color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(1000);
                rotate.setInterpolator(new LinearInterpolator());


                p1color.startAnimation(rotate);

                MediaPlayer m1= MediaPlayer.create(MainActivity.this,R.raw.dicesound);
                m1.start();

                int dicenumber=random.nextInt(5)+1;
                switch (dicenumber) {
                    case 1:
                     //   Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                        if(p1score<73)
                        {
                            p1color.setBackgroundResource(R.drawable.bg6);
                            if(p1one)
                            {
                                p1score=p1score+1;
                                p1one=false;
                                p1two=false;
                                p1three=false;
                                p1four=false;
                                p1five=false;
                            }
                            else if(p1b2check)
                            {
                                p1score=p1score+4;
                            }
                            else if(p1b6check)
                            {
                                p1score=p1score+5;
                            }
                            else if(p1b3check)
                            {
                                p1score=p1score+3;
                            }
                            else if(p1b4check)
                            {
                                p1score=p1score+2;
                            }
                            else if(p1b5check)
                            {
                                p1score=p1score+1;
                            }
                            position();
                            p1b6check=true;
                            p1b2check=false;
                            p1b3check=false;
                            p1b4check=false;
                            p1b5check=false;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                            p1exceed();
                        }
                        break;
                    case 2:

                     //   Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                        if(p1score<69)
                        {
                            p1color.setBackgroundResource(R.drawable.bg2);
                            if(p1two)
                            {
                                p1score=p1score+2;
                                p1one=false;
                                p1two=false;
                                p1three=false;
                                p1four=false;
                                p1five=false;
                            }
                            else if(p1b6check)
                            {
                                p1score=p1score+1;
                            }
                            else if(p1b2check)
                            {
                                p1score=p1score+5;
                            }
                            else if(p1b3check)
                            {
                                p1score=p1score+4;
                            }
                            else if(p1b4check)
                            {
                                p1score=p1score+3;
                            }
                            else if(p1b5check)
                            {
                                p1score=p1score+2;
                            }
                            position();
                            p1b2check=true;
                            p1b6check=false;
                            p1b3check=false;
                            p1b4check=false;
                            p1b5check=false;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                            p1exceed();
                        }

                        break;
                    case 3:
                     //   Toast.makeText(MainActivity.this,"3",Toast.LENGTH_SHORT).show();
                        if(p1score<70)
                        {
                            p1color.setBackgroundResource(R.drawable.bg3);
                            if(p1three)
                            {
                                p1score=p1score+3;
                                p1one=false;
                                p1two=false;
                                p1three=false;
                                p1four=false;
                                p1five=false;
                            }
                            else if(p1b6check)
                            {
                                p1score=p1score+2;
                            }
                            else if(p1b2check)
                            {
                                p1score=p1score+1;
                            }
                            else if(p1b3check)
                            {
                                p1score=p1score+5;
                            }
                            else if(p1b4check)
                            {
                                p1score=p1score+4;
                            }
                            else if(p1b5check)
                            {
                                p1score=p1score+3;
                            }
                            position();
                            p1b2check=false;
                            p1b6check=false;
                            p1b3check=true;
                            p1b4check=false;
                            p1b5check=false;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                            p1exceed();
                        }

                        break;
                    case 4:

                      //  Toast.makeText(MainActivity.this,"4",Toast.LENGTH_SHORT).show();
                        if(p1score<71)
                        {
                            p1color.setBackgroundResource(R.drawable.bg4);
                            if(p1four)
                            {
                                p1score=p1score+4;
                                p1one=false;
                                p1two=false;
                                p1three=false;
                                p1four=false;
                                p1five=false;
                            }
                            if(p1b6check)
                            {
                                p1score=p1score+3;
                            }
                            else if(p1b2check)
                            {
                                p1score=p1score+2;
                            }
                            else if(p1b3check)
                            {
                                p1score=p1score+1;
                            }
                            else if(p1b4check)
                            {
                                p1score=p1score+5;
                            }
                            else if(p1b5check)
                            {
                                p1score=p1score+4;
                            }
                            position();
                            p1b2check=false;
                            p1b6check=false;
                            p1b3check=false;
                            p1b4check=true;
                            p1b5check=false;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                            p1exceed();
                        }
                        break;
                    case 5:

                    //    Toast.makeText(MainActivity.this,"5",Toast.LENGTH_SHORT).show();
                        if(p1score<72)
                        {
                            p1color.setBackgroundResource(R.drawable.bg5);
                            if(p1five)
                            {
                                p1score=p1score+5;
                                p1one=false;
                                p1two=false;
                                p1three=false;
                                p1four=false;
                                p1five=false;
                            }
                            if(p1b6check)
                            {
                                p1score=p1score+4;
                            }
                            else if(p1b2check)
                            {
                                p1score=p1score+3;
                            }
                            else if(p1b3check)
                            {
                                p1score=p1score+2;
                            }
                            else if(p1b4check)
                            {
                                p1score=p1score+1;
                            }
                            else if(p1b5check)
                            {
                                p1score=p1score+5;
                            }
                            position();
                            p1b2check=false;
                            p1b6check=false;
                            p1b3check=false;
                            p1b4check=false;
                            p1b5check=true;
                            SystemClock.sleep(500);
                        }
                        else
                        {
                            p1color.setBackgroundResource(R.drawable.p1_btn_bg1);
                            p1exceed();
                        }
                        break;
                }

                p2color.setVisibility(View.VISIBLE);
                p2hand.setVisibility(View.VISIBLE);

                p2checker=true;
                p1checker=false;

                fun2();

            }


        });



    }

    private void p1exceed() {

        String temp=player1name.getText().toString();

        dialog.setContentView(R.layout.winninglayout);
        winningname=dialog.findViewById(R.id.winningname);
        replay=dialog.findViewById(R.id.replaybtn);
        winningname.setText(temp);
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,avatar_selection.class);
                startActivity(intent);
                finish();

            }
        });
        dialog.show();
        dialog.setCancelable(false);
    }

    private void position() {

        reset();

       // String temp=String.valueOf(p2score);
       // Toast.makeText(MainActivity.this,temp,Toast.LENGTH_SHORT).show();


        if(p1score==1)
        {
            c1.setBackgroundResource(R.drawable.p1_btn_bg);
        }
        if(p1score==2)
        {
            c2.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==3)
        {
            c3.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==4)
        {
            c4.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==5)
        {
            c5.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==6)
        {
            c6.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==7)
        {
            c7.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==8)
        {
            c8.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==9)
        {
            c9.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==10)
        {
            c10.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==11)
        {
            c11.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==12)
        {
            c12.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==13)
        {
            c13.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==14)
        {
            c14.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==15)
        {
            c15.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==16)
        {
            c16.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==17)
        {
            c17.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==18)
        {
            c18.setBackgroundResource(R.drawable.da5);
        }
        if(p1score==19)
        {
            c19.setBackgroundResource(R.drawable.da5);
        }
        if(p1score==20)
        {
            c20.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==21)
        {
            c21.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==22)
        {
            c22.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==23)
        {
            c23.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==24)
        {
            c24.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==25)
        {
            c25.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==26)
        {
            c26.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==27)
        {
            c27.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==28)
        {
            c28.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==29)
        {
            c29.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==30)
        {
            c30.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==31)
        {
            c31.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==32)
        {
            c32.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==33)
        {
            c33.setBackgroundResource(R.drawable.da5);
        }
        if(p1score==34)
        {
            c34.setBackgroundResource(R.drawable.da5);
        }
        if(p1score==35)
        {
            c35.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==36)
        {
            c36.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==37)
        {
            c37.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==38)
        {
            c38.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==39)
        {
            c39.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==40)
        {
            c40.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==41)
        {
            c41.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==42)
        {
            c42.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==43)
        {
            c43.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==44)
        {
            c44.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==45)
        {
            c45.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==46)
        {
            c46.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==47)
        {
            c47.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==48)
        {
            c48.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==49)
        {
            c49.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==50)
        {
            c50.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==51)
        {
            c51.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==52)
        {
            c52.setBackgroundResource(R.drawable.da5);
        }
        if(p1score==53)
        {
            c53.setBackgroundResource(R.drawable.da5);
        }
        if(p1score==54)
        {
            c54.setBackgroundResource(R.drawable.da5);
        }
        if(p1score==55)
        {
            c55.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==56)
        {
            c56.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==57)
        {
            c57.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==58)
        {
            c58.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==59)
        {
            c59.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==60)
        {
            c60.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==61)
        {
            c61.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==62)
        {
            c62.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==63)
        {
            c63.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==64)
        {
            c64.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==65)
        {
            c65.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==66)
        {
            c66.setBackgroundResource(R.drawable.da3);
        }
        if(p1score==67)
        {
            c67.setBackgroundResource(R.drawable.da7);
        }
        if(p1score==68)
        {
            c68.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==69)
        {
            c69.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==70)
        {
            c70.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==71)
        {
            c71.setBackgroundResource(R.drawable.da1);
        }
        if(p1score==72)
        {
            c72.setBackgroundResource(R.drawable.da1);
        }


        if(p2score==5)
        {
            c35.setBackgroundResource(R.drawable.p2_btn_bg);
        }
        if(p2score==6)
        {
            c36.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==7)
        {
            c37.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==8)
        {
            c38.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==9)
        {
            c39.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==10)
        {
            c40.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==11)
        {
            c41.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==12)
        {
            c42.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==13)
        {
            c43.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==14)
        {
            c44.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==15)
        {
            c45.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==16)
        {
            c46.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==17)
        {
            c47.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==18)
        {
            c48.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==19)
        {
            c49.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==20)
        {
            c50.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==21)
        {
            c51.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==22)
        {
            c52.setBackgroundResource(R.drawable.da6);
        }
        if(p2score==23)
        {
            c53.setBackgroundResource(R.drawable.da6);
        }
        if(p2score==24)
        {
            c54.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==25)
        {
            c55.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==26)
        {
            c56.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==27)
        {
            c57.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==28)
        {
            c58.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==29)
        {
            c59.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==30)
        {
            c60.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==31)
        {
            c61.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==32)
        {
            c62.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==33)
        {
            c63.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==34)
        {
            c64.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==35)
        {
            c65.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==36)
        {
            c66.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==37)
        {
            c67.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==38)
        {
            c68.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==39)
        {
            c1.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==40)
        {
            c2.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==41)
        {
            c3.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==42)
        {
            c4.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==43)
        {
            c5.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==44)
        {
            c6.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==45)
        {
            c7.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==46)
        {
            c8.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==47)
        {
            c9.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==48)
        {
            c10.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==49)
        {
            c11.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==50)
        {
            c12.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==51)
        {
            c13.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==52)
        {
            c14.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==53)
        {
            c15.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==54)
        {
            c16.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==55)
        {
            c17.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==56)
        {
            c18.setBackgroundResource(R.drawable.da6);
        }
        if(p2score==57)
        {
            c19.setBackgroundResource(R.drawable.da6);
        }
        if(p2score==58)
        {
            c20.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==59)
        {
            c21.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==60)
        {
            c22.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==61)
        {
            c23.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==62)
        {
            c24.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==63)
        {
            c25.setBackgroundResource(R.drawable.da8);
        }
        if(p2score==64)
        {
            c26.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==65)
        {
            c27.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==66)
        {
            c28.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==67)
        {
            c29.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==68)
        {
            c30.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==69)
        {
            c31.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==70)
        {
            c32.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==71)
        {
            c33.setBackgroundResource(R.drawable.da4);
        }
        if(p2score==72)
        {
            c34.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==73)
        {
            c73.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==74)
        {
            c74.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==75)
        {
            c75.setBackgroundResource(R.drawable.da2);
        }
        if(p2score==76)
        {
            c76.setBackgroundResource(R.drawable.da2);
        }


    }

    void reset()
    {
        c1.setBackgroundResource(R.drawable.p1_btn_bg);
        c2.setBackgroundResource(R.drawable.bg6);
        c3.setBackgroundResource(R.drawable.bg2);
        c4.setBackgroundResource(R.drawable.bg3);
        c5.setBackgroundResource(R.drawable.bg4);
        c6.setBackgroundResource(R.drawable.bg5);
        c7.setBackgroundResource(R.drawable.bg6);
        c8.setBackgroundResource(R.drawable.bg2);
        c9.setBackgroundResource(R.drawable.bg3);
        c10.setBackgroundResource(R.drawable.bg4);
        c11.setBackgroundResource(R.drawable.bg5);
        c12.setBackgroundResource(R.drawable.bg6);
        c13.setBackgroundResource(R.drawable.bg2);
        c14.setBackgroundResource(R.drawable.bg3);
        c15.setBackgroundResource(R.drawable.bg4);
        c16.setBackgroundResource(R.drawable.bg5);
        c17.setBackgroundResource(R.drawable.bg6);
        c18.setBackgroundResource(R.drawable.bg2);
        c19.setBackgroundResource(R.drawable.bg3);
        c20.setBackgroundResource(R.drawable.bg4);
        c21.setBackgroundResource(R.drawable.bg5);
        c22.setBackgroundResource(R.drawable.bg6);
        c23.setBackgroundResource(R.drawable.bg2);
        c24.setBackgroundResource(R.drawable.bg3);
        c25.setBackgroundResource(R.drawable.bg4);
        c26.setBackgroundResource(R.drawable.bg5);
        c27.setBackgroundResource(R.drawable.bg6);
        c28.setBackgroundResource(R.drawable.bg2);
        c29.setBackgroundResource(R.drawable.bg3);
        c30.setBackgroundResource(R.drawable.bg4);
        c31.setBackgroundResource(R.drawable.bg5);
        c32.setBackgroundResource(R.drawable.bg6);
        c33.setBackgroundResource(R.drawable.bg2);
        c34.setBackgroundResource(R.drawable.bg3);
        c35.setBackgroundResource(R.drawable.p2_btn_bg);
        c36.setBackgroundResource(R.drawable.bg5);
        c37.setBackgroundResource(R.drawable.bg6);
        c38.setBackgroundResource(R.drawable.bg2);
        c39.setBackgroundResource(R.drawable.bg3);
        c40.setBackgroundResource(R.drawable.bg4);
        c41.setBackgroundResource(R.drawable.bg5);
        c42.setBackgroundResource(R.drawable.bg6);
        c43.setBackgroundResource(R.drawable.bg2);
        c44.setBackgroundResource(R.drawable.bg3);
        c45.setBackgroundResource(R.drawable.bg4);
        c46.setBackgroundResource(R.drawable.bg5);
        c47.setBackgroundResource(R.drawable.bg6);
        c48.setBackgroundResource(R.drawable.bg2);
        c49.setBackgroundResource(R.drawable.bg3);
        c50.setBackgroundResource(R.drawable.bg4);
        c51.setBackgroundResource(R.drawable.bg5);
        c52.setBackgroundResource(R.drawable.bg6);
        c53.setBackgroundResource(R.drawable.bg2);
        c54.setBackgroundResource(R.drawable.bg3);
        c55.setBackgroundResource(R.drawable.bg4);
        c56.setBackgroundResource(R.drawable.bg5);
        c57.setBackgroundResource(R.drawable.bg6);
        c58.setBackgroundResource(R.drawable.bg2);
        c59.setBackgroundResource(R.drawable.bg3);
        c60.setBackgroundResource(R.drawable.bg4);
        c61.setBackgroundResource(R.drawable.bg5);
        c62.setBackgroundResource(R.drawable.bg6);
        c63.setBackgroundResource(R.drawable.bg2);
        c64.setBackgroundResource(R.drawable.bg3);
        c65.setBackgroundResource(R.drawable.bg4);
        c66.setBackgroundResource(R.drawable.bg5);
        c67.setBackgroundResource(R.drawable.bg6);
        c68.setBackgroundResource(R.drawable.bg2);
        c69.setBackgroundResource(R.drawable.bg3);
        c70.setBackgroundResource(R.drawable.bg4);
        c71.setBackgroundResource(R.drawable.bg5);
        c72.setBackgroundResource(R.drawable.bg6);
        c73.setBackgroundResource(R.drawable.bg4);
        c74.setBackgroundResource(R.drawable.bg5);
        c75.setBackgroundResource(R.drawable.bg6);
        c76.setBackgroundResource(R.drawable.bg2);
    }

    public static void deleteCache(Context context){
        try {
            File dir = context.getCacheDir();
            if (dir != null && dir.isDirectory()) {
                deleteDir(dir);
            }
        } catch (Exception e) {}
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }
}
