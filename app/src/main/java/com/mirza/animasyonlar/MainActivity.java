package com.mirza.animasyonlar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAplhaArttir = (Button) findViewById(R.id.btnAlphaArttir);
        Button btnAplhaAzalt = (Button) findViewById(R.id.btnAlphaAzalt);
        Button btnBlink = (Button) findViewById(R.id.btnBlink);
        final TextView txtYazi =(TextView) findViewById(R.id.txtYazi);


        final Animation animAlphaArttir = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha_arttir);
        final Animation animAlphaAzalt = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha_azalt);
        final Animation animBlink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);

        btnAplhaArttir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtYazi.startAnimation(animAlphaArttir);
            }
        });

        btnAplhaAzalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtYazi.startAnimation(animAlphaAzalt);
            }
        });

        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtYazi.startAnimation(animBlink);
            }
        });

    }
}
