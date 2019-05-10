package com.ghkdrmaskfknaver.ex_lottie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView lottieAnimationView = findViewById(R.id.animation_lottie);
        lottieAnimationView.setAnimation("icecream.json");
        lottieAnimationView.loop(true);
        lottieAnimationView.playAnimation();
    }
}
