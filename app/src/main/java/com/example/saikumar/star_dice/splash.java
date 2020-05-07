package com.example.saikumar.star_dice;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

import java.io.File;

public class splash extends AppCompatActivity {

    LottieAnimationView view;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        deleteCache(this);
        // clearApplicationData();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splash);


        view=findViewById(R.id.loadinganim);

        start=findViewById(R.id.startbtn);


            startcheckanim();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(splash.this,avatar_selection.class);
                startActivity(intent);
                finish();
            }
        });



    }

    public void startcheckanim()
    {
        final ValueAnimator animator= ValueAnimator.ofFloat(0f,1f).setDuration(8000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                view.setProgress((Float)animation.getAnimatedValue());
            }
        });
        if(view.getProgress()==0f)
        {
            animator.setStartDelay(1000);
            animator.start();

        }
        else
        {
            view.setProgress(0f);
            if(view.getProgress()==0f)
            {
                animator.start();
            }

        }


    }

    @Override
    protected void onStart() {
        super.onStart();
        startcheckanim();
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
