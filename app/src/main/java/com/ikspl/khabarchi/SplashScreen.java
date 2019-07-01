package com.ikspl.khabarchi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        logo = findViewById(R.id.logo);

        AnimationSet mset = new AnimationSet(false);
        Animation fadein = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.fade_in);
        Animation fadeout = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.fade_out);
        mset.addAnimation(fadein);
        mset.addAnimation(fadeout);
        mset.addAnimation(fadein);

        logo.startAnimation(mset);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over
                Intent ii = new Intent(SplashScreen.this,Dashboardd.class);
                startActivity(ii);
                finish();
            }
        }, 3000);

            }
}
