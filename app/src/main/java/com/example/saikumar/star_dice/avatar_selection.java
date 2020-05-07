package com.example.saikumar.star_dice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

public class avatar_selection extends AppCompatActivity {

    ImageView p1a1,p1a2,p1a3,p1a4,p2a1,p2a2,p2a3,p2a4;
    boolean p1check=false,p2check=false;
    boolean p1a1ch=false,p1a2ch=false,p1a3ch=false,p1a4ch=false,p2a1ch=false,p2a2ch=false,p2a3ch=false,p2a4ch=false;

    Button next;

    Animation atg,atgtwo,atgthree,atgfour,atgfive,atgsix,atgseven,atgeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        deleteCache(this);
        // clearApplicationData();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_avatar_selection);

        p1a1=findViewById(R.id.p1avt1);
        p1a2=findViewById(R.id.p1avt2);
        p1a3=findViewById(R.id.p1avt3);
        p1a4=findViewById(R.id.p1avt4);
        p2a1=findViewById(R.id.p2avt1);
        p2a2=findViewById(R.id.p2avt2);
        p2a3=findViewById(R.id.p2avt3);
        p2a4=findViewById(R.id.p2avt4);

        next=findViewById(R.id.avtbtn);

        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        atgtwo = AnimationUtils.loadAnimation(this, R.anim.atgtwo);
        atgthree = AnimationUtils.loadAnimation(this, R.anim.atgthree);
        atgfour = AnimationUtils.loadAnimation(this, R.anim.atgfour);
        atgfive = AnimationUtils.loadAnimation(this, R.anim.atgfive);
        atgsix = AnimationUtils.loadAnimation(this, R.anim.atgsix);
        atgseven = AnimationUtils.loadAnimation(this, R.anim.atgseven);
        atgeight = AnimationUtils.loadAnimation(this, R.anim.atgeight);

        p1a1.startAnimation(atg);
        p1a2.startAnimation(atgtwo);
        p1a3.startAnimation(atgthree);
        p1a4.startAnimation(atgfour);
        p2a1.startAnimation(atgfive);
        p2a2.startAnimation(atgsix);
        p2a3.startAnimation(atgseven);
        p2a4.startAnimation(atgeight);

        p1a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1check=true;
                if(p1check)
                {
                    p1a1.setImageResource(R.drawable.boy2);
                    p2a1.setVisibility(View.INVISIBLE);
                    p1a2.setVisibility(View.INVISIBLE);
                    p1a3.setVisibility(View.INVISIBLE);
                    p1a4.setVisibility(View.INVISIBLE);
                    p1a1ch=true;
                }
            }
        });

        p1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1check=true;
                if(p1check)
                {
                    p1a2.setImageResource(R.drawable.boy3);
                    p2a2.setVisibility(View.INVISIBLE);
                    p1a3.setVisibility(View.INVISIBLE);
                    p1a4.setVisibility(View.INVISIBLE);
                    p1a1.setVisibility(View.INVISIBLE);
                    p1a2ch=true;
                }
            }
        });

        p1a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1check=true;
                if(p1check)
                {
                    p1a3.setImageResource(R.drawable.woman2);
                    p2a3.setVisibility(View.INVISIBLE);
                    p1a4.setVisibility(View.INVISIBLE);
                    p1a1.setVisibility(View.INVISIBLE);
                    p1a2.setVisibility(View.INVISIBLE);
                    p1a3ch=true;
                }
            }
        });

        p1a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1check=true;
                if(p1check)
                {
                    p1a4.setImageResource(R.drawable.woman3);
                    p2a4.setVisibility(View.INVISIBLE);
                    p1a1.setVisibility(View.INVISIBLE);
                    p1a2.setVisibility(View.INVISIBLE);
                    p1a3.setVisibility(View.INVISIBLE);
                    p1a4ch=true;
                }
            }
        });

        p2a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2check=true;
                if(p2check)
                {
                    p2a1.setImageResource(R.drawable.boy2);
                    p1a1.setVisibility(View.INVISIBLE);
                    p2a2.setVisibility(View.INVISIBLE);
                    p2a3.setVisibility(View.INVISIBLE);
                    p2a4.setVisibility(View.INVISIBLE);
                    p2a1ch=true;
                }
            }
        });

        p2a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2check=true;
                if(p2check)
                {
                    p2a2.setImageResource(R.drawable.boy3);
                    p1a2.setVisibility(View.INVISIBLE);
                    p2a3.setVisibility(View.INVISIBLE);
                    p2a4.setVisibility(View.INVISIBLE);
                    p2a1.setVisibility(View.INVISIBLE);
                    p2a2ch=true;
                }
            }
        });

        p2a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2check=true;
                if(p2check)
                {
                    p2a3.setImageResource(R.drawable.woman2);
                    p1a3.setVisibility(View.INVISIBLE);
                    p2a4.setVisibility(View.INVISIBLE);
                    p2a1.setVisibility(View.INVISIBLE);
                    p2a2.setVisibility(View.INVISIBLE);
                    p2a3ch=true;
                }
            }
        });

        p2a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2check=true;
                if(p2check)
                {
                    p2a4.setImageResource(R.drawable.woman3);
                    p1a4.setVisibility(View.INVISIBLE);
                    p2a1.setVisibility(View.INVISIBLE);
                    p2a2.setVisibility(View.INVISIBLE);
                    p2a3.setVisibility(View.INVISIBLE);
                    p2a4ch=true;
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!p1check)
                {
                    Toast.makeText(avatar_selection.this,"Please select Player1 Avatar",Toast.LENGTH_LONG).show();
                }
                else if(!p2check)
                {
                    Toast.makeText(avatar_selection.this,"Please select Player2 Avatar",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(p1a1ch)
                    {
                        if(p2a1ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a1");
                            intent.putExtra("p2","p2a1");
                            startActivity(intent);
                            finish();
                        }
                        else if(p2a2ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a1");
                            intent.putExtra("p2","p2a2");
                            startActivity(intent);
                            finish();
                        }
                        else if(p2a3ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a1");
                            intent.putExtra("p2","p2a3");
                            startActivity(intent);
                            finish();
                        }
                        else
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a1");
                            intent.putExtra("p2","p2a4");
                            startActivity(intent);
                            finish();
                        }
                    }
                    else if(p1a2ch)
                    {
                        if(p2a1ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a2");
                            intent.putExtra("p2","p2a1");
                            startActivity(intent);
                            finish();
                        }
                        else if(p2a2ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a2");
                            intent.putExtra("p2","p2a2");
                            startActivity(intent);
                            finish();
                        }
                        else if(p2a3ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a2");
                            intent.putExtra("p2","p2a3");
                            startActivity(intent);
                            finish();
                        }
                        else
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a2");
                            intent.putExtra("p2","p2a4");
                            startActivity(intent);
                            finish();
                        }

                    }
                    else if(p1a3ch)
                    {
                        if(p2a1ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a3");
                            intent.putExtra("p2","p2a1");
                            startActivity(intent);
                            finish();
                        }
                        else if(p2a2ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a3");
                            intent.putExtra("p2","p2a2");
                            startActivity(intent);
                            finish();
                        }
                        else if(p2a3ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a3");
                            intent.putExtra("p2","p2a3");
                            startActivity(intent);
                            finish();
                        }
                        else
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a3");
                            intent.putExtra("p2","p2a4");
                            startActivity(intent);
                            finish();
                        }

                    }
                    else
                    {
                        if(p2a1ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a4");
                            intent.putExtra("p2","p2a1");
                            startActivity(intent);
                            finish();
                        }
                        else if(p2a2ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a4");
                            intent.putExtra("p2","p2a2");
                            startActivity(intent);
                            finish();
                        }
                        else if(p2a3ch)
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a4");
                            intent.putExtra("p2","p2a3");
                            startActivity(intent);
                            finish();

                        }
                        else
                        {
                            Intent intent=new Intent(avatar_selection.this,playernames.class);
                            intent.putExtra("p1","p1a4");
                            intent.putExtra("p2","p2a4");
                            startActivity(intent);
                            finish();
                        }

                    }

                }

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
