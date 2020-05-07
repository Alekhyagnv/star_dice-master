package com.example.saikumar.star_dice;

import android.app.Dialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.Random;

public class cpu_vs_player extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        deleteCache(this);
        // clearApplicationData();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_cpu_vs_player);

        p1img=findViewById(R.id.cplayer1avt);
        p2img=findViewById(R.id.cplayer2avt);
        p1hand=findViewById(R.id.cp1hand);
        p2hand=findViewById(R.id.cp2hand);

        dialog=new Dialog(this);

        p1color=findViewById(R.id.cp1colorbtn);
        p2color=findViewById(R.id.cp2colorbtn);

        final RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);
        rotate.setInterpolator(new LinearInterpolator());


        p1color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                p1color.startAnimation(rotate);

                MediaPlayer m1= MediaPlayer.create(cpu_vs_player.this,R.raw.dicesound);
                m1.start();

                int dicenumber=random.nextInt(5)+1;
                switch (dicenumber) {
                    case 1:
                        p1color.setBackgroundResource(R.drawable.bg6);
                        break;
                    case 2:
                        p1color.setBackgroundResource(R.drawable.bg2);
                        break;
                    case 3:

                        p1color.setBackgroundResource(R.drawable.bg3);
                        break;
                    case 4:
                        p1color.setBackgroundResource(R.drawable.bg4);
                        break;
                    case 5:
                        p1color.setBackgroundResource(R.drawable.bg5);
                        break;
                }
                fun2();

            }
        });

    }

    private void fun2() {


        final RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);
        rotate.setInterpolator(new LinearInterpolator());


        SystemClock.sleep(2000);

        p2color.startAnimation(rotate);

        MediaPlayer m1= MediaPlayer.create(cpu_vs_player.this,R.raw.dicesound);
        m1.start();

        int dicenumber=random.nextInt(5)+1;
        switch (dicenumber) {
            case 1:
                p2color.setBackgroundResource(R.drawable.bg6);
                break;
            case 2:
                p2color.setBackgroundResource(R.drawable.bg2);
                break;
            case 3:

                p2color.setBackgroundResource(R.drawable.bg3);
                break;
            case 4:
                p2color.setBackgroundResource(R.drawable.bg4);
                break;
            case 5:
                p2color.setBackgroundResource(R.drawable.bg5);
                break;
        }


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
