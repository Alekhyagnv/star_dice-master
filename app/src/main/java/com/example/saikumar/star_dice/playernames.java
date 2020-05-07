package com.example.saikumar.star_dice;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.Random;

public class playernames extends AppCompatActivity {

    Button h1,h2,t1,t2,toss;
    TextView t3;
    EditText p1,p2;
    Animation frombottom,fromleft,fromright;
    ConstraintLayout c1,c2,c3;

    Dialog dialog;
    TextView winnername;
    Button next;

    boolean th1=false,th2=false,tt1=false,tt2=false;
    String choice1,choice2;

    Random random;
    int result;

    ImageView coin,arrow;

    String p1img,p2img;

    int degree = 0, olddegree = 0;

    private static final float FACTOR = 11.25f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        deleteCache(this);
        // clearApplicationData();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_playernames);

        h1=findViewById(R.id.p1h1);
        h2=findViewById(R.id.p2h2);
        t1=findViewById(R.id.p1t1);
        t2=findViewById(R.id.p2t2);
        p1=findViewById(R.id.p1edit);
        p2=findViewById(R.id.p2edit);
        toss=findViewById(R.id.toss);
        c1=findViewById(R.id.c1Layout);
        c2=findViewById(R.id.c1);
        c3=findViewById(R.id.c2);
        t3=findViewById(R.id.rollresult);

        dialog=new Dialog(this);

        coin=findViewById(R.id.rollimg);
        arrow=findViewById(R.id.arrowimg);

        random=new Random();

        frombottom=AnimationUtils.loadAnimation(this,R.anim.bottomup);
        fromleft=AnimationUtils.loadAnimation(this,R.anim.lefttoright);
        fromright=AnimationUtils.loadAnimation(this,R.anim.righttoleft);

        c1.setAnimation(fromleft);
        c2.setAnimation(fromright);
        c3.setAnimation(frombottom);

        p1img=getIntent().getExtras().getString("p1");
        p2img=getIntent().getExtras().getString("p2");


        toss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp1="heads";
                String temp2="tails";

                // Toast.makeText(Names.this,"Please enter player1 name",Toast.LENGTH_LONG).show();
                if(th1 | tt2 |th2  | tt1)
                {
                    final String s1=p1.getText().toString();
                    final String s2=p2.getText().toString();
                    if(TextUtils.isEmpty(s1))
                    {
                        Toast.makeText(playernames.this,"Please enter player1 name",Toast.LENGTH_LONG).show();
                    }
                    else if(TextUtils.isEmpty(s2))
                    {
                        Toast.makeText(playernames.this,"Please enter player2 name",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        int dicenumber=random.nextInt(2)+1;
                        switch (dicenumber)
                        {
                            case 1:
                                String t1=String.valueOf(dicenumber);
                                Toast.makeText(playernames.this,t1,Toast.LENGTH_LONG).show();
                                if(th1)
                                {

                                    String temp3=p1.getText().toString();
                                    String temp4=p2.getText().toString();


                                    dialog.setContentView(R.layout.tosscustom);
                                    winnername=dialog.findViewById(R.id.tosswinningname);
                                    next=dialog.findViewById(R.id.tossnextbtn);
                                    winnername.setText(temp3);
                                    next.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent=new Intent(playernames.this,MainActivity.class);
                                            intent.putExtra("player1",s1);
                                            intent.putExtra("player2",s2);
                                            intent.putExtra("win","p1win");
                                            intent.putExtra("p1",p1img);
                                            intent.putExtra("p2",p2img);
                                            startActivity(intent);
                                            finish();

                                        }
                                    });
                                    dialog.show();
                                    dialog.setCancelable(false);



                                }
                                else if(th2)
                                {
                                    String temp3=p1.getText().toString();
                                    String temp4=p2.getText().toString();


                                    dialog.setContentView(R.layout.tosscustom);
                                    winnername=dialog.findViewById(R.id.tosswinningname);
                                    next=dialog.findViewById(R.id.tossnextbtn);
                                    winnername.setText(temp4);
                                    next.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent=new Intent(playernames.this,MainActivity.class);
                                            intent.putExtra("player1",s1);
                                            intent.putExtra("player2",s2);
                                            intent.putExtra("win","p1win");
                                            intent.putExtra("p1",p1img);
                                            intent.putExtra("p2",p2img);
                                            startActivity(intent);
                                            finish();

                                        }
                                    });
                                    dialog.show();
                                    dialog.setCancelable(false);
                                }
                                else if(tt1)
                                {
                                    String temp3=p1.getText().toString();
                                    String temp4=p2.getText().toString();

                                    dialog.setContentView(R.layout.tosscustom);
                                    winnername=dialog.findViewById(R.id.tosswinningname);
                                    next=dialog.findViewById(R.id.tossnextbtn);
                                    winnername.setText(temp4);
                                    next.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent=new Intent(playernames.this,MainActivity.class);
                                            intent.putExtra("player1",s1);
                                            intent.putExtra("player2",s2);
                                            intent.putExtra("win","p1win");
                                            intent.putExtra("p1",p1img);
                                            intent.putExtra("p2",p2img);
                                            startActivity(intent);
                                            finish();

                                        }
                                    });
                                    dialog.show();
                                    dialog.setCancelable(false);
                                }
                                else
                                {
                                    String temp3=p1.getText().toString();
                                    String temp4=p2.getText().toString();


                                    dialog.setContentView(R.layout.tosscustom);
                                    winnername=dialog.findViewById(R.id.tosswinningname);
                                    next=dialog.findViewById(R.id.tossnextbtn);
                                    winnername.setText(temp3);
                                    next.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent=new Intent(playernames.this,MainActivity.class);
                                            intent.putExtra("player1",s1);
                                            intent.putExtra("player2",s2);
                                            intent.putExtra("win","p1win");
                                            intent.putExtra("p1",p1img);
                                            intent.putExtra("p2",p2img);
                                            startActivity(intent);
                                            finish();

                                        }
                                    });
                                    dialog.show();
                                    dialog.setCancelable(false);
                                }


                                break;
                            case 2:
                                String t2=String.valueOf(dicenumber);
                                Toast.makeText(playernames.this,t2,Toast.LENGTH_LONG).show();
                                if(tt2)
                                {
                                    String temp3=p1.getText().toString();
                                    String temp4=p2.getText().toString();


                                    dialog.setContentView(R.layout.tosscustom);
                                    winnername=dialog.findViewById(R.id.tosswinningname);
                                    next=dialog.findViewById(R.id.tossnextbtn);
                                    winnername.setText(temp4);
                                    next.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent=new Intent(playernames.this,MainActivity.class);
                                            intent.putExtra("player1",s1);
                                            intent.putExtra("player2",s2);
                                            intent.putExtra("win","p1win");
                                            intent.putExtra("p1",p1img);
                                            intent.putExtra("p2",p2img);
                                            startActivity(intent);
                                            finish();

                                        }
                                    });
                                    dialog.show();
                                    dialog.setCancelable(false);
                                }
                                else if(tt1)
                                {
                                    String temp3=p1.getText().toString();
                                    String temp4=p2.getText().toString();


                                    dialog.setContentView(R.layout.tosscustom);
                                    winnername=dialog.findViewById(R.id.tosswinningname);
                                    next=dialog.findViewById(R.id.tossnextbtn);
                                    winnername.setText(temp3);
                                    next.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent=new Intent(playernames.this,MainActivity.class);
                                            intent.putExtra("player1",s1);
                                            intent.putExtra("player2",s2);
                                            intent.putExtra("win","p1win");
                                            intent.putExtra("p1",p1img);
                                            intent.putExtra("p2",p2img);
                                            startActivity(intent);
                                            finish();

                                        }
                                    });
                                    dialog.show();
                                    dialog.setCancelable(false);

                                }
                                else if(th1)
                                {
                                    String temp3=p1.getText().toString();
                                    String temp4=p2.getText().toString();


                                    dialog.setContentView(R.layout.tosscustom);
                                    winnername=dialog.findViewById(R.id.tosswinningname);
                                    next=dialog.findViewById(R.id.tossnextbtn);
                                    winnername.setText(temp4);
                                    next.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent=new Intent(playernames.this,MainActivity.class);
                                            intent.putExtra("player1",s1);
                                            intent.putExtra("player2",s2);
                                            intent.putExtra("win","p1win");
                                            intent.putExtra("p1",p1img);
                                            intent.putExtra("p2",p2img);
                                            startActivity(intent);
                                            finish();

                                        }
                                    });
                                    dialog.show();
                                    dialog.setCancelable(false);
                                }
                                else
                                {
                                    String temp3=p1.getText().toString();
                                    String temp4=p2.getText().toString();


                                    dialog.setContentView(R.layout.tosscustom);
                                    winnername=dialog.findViewById(R.id.tosswinningname);
                                    next=dialog.findViewById(R.id.tossnextbtn);
                                    winnername.setText(temp3);
                                    next.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent=new Intent(playernames.this,MainActivity.class);
                                            intent.putExtra("player1",s1);
                                            intent.putExtra("player2",s2);
                                            intent.putExtra("win","p1win");
                                            intent.putExtra("p1",p1img);
                                            intent.putExtra("p2",p2img);
                                            startActivity(intent);
                                            finish();

                                        }
                                    });
                                    dialog.show();
                                    dialog.setCancelable(false);
                                }

                                break;

                        }


                    }
                }
                else
                {
                    Toast.makeText(playernames.this,"Please select one of the Option",Toast.LENGTH_LONG).show();
                }

            }
        });

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                th1=true;
                choice1="heads";
                choice2="tails";
                h1.setBackgroundResource(R.drawable.greenbg);
                h2.setBackgroundResource(R.drawable.redbg);
                t1.setBackgroundResource(R.drawable.redbg);
                t2.setBackgroundResource(R.drawable.greenbg);
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt1=true;
                choice1="tails";
                choice2="heads";
                h1.setBackgroundResource(R.drawable.redbg);
                h2.setBackgroundResource(R.drawable.greenbg);
                t1.setBackgroundResource(R.drawable.greenbg);
                t2.setBackgroundResource(R.drawable.redbg);
            }
        });

        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                th2=true;
                choice2="heads";
                choice1="tails";
                h1.setBackgroundResource(R.drawable.redbg);
                h2.setBackgroundResource(R.drawable.greenbg);
                t1.setBackgroundResource(R.drawable.greenbg);
                t2.setBackgroundResource(R.drawable.redbg);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt2=true;
                choice2="tails";
                choice1="heads";
                h1.setBackgroundResource(R.drawable.greenbg);
                h2.setBackgroundResource(R.drawable.redbg);
                t1.setBackgroundResource(R.drawable.redbg);
                t2.setBackgroundResource(R.drawable.greenbg);
            }
        });



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
