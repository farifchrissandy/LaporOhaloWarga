package com.lapo.pengaduan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

/**
 * Created by MRX on 25/01/2018.
 */

public class home_layout_java extends AppCompatActivity {

    ViewFlipper v_flipper;
    CardView mycard ;

    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        int images [] = {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
        v_flipper = (ViewFlipper) findViewById(R.id.v_flipper);


        for (int image: images){
            flipperImages(image);
        }

        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.sayur);

        mycard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new
                        Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });


        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.laporgambar);

        mycard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new
                        Intent(getApplicationContext(),MainActivity_upload_gambar_lapor.class);
                startActivity(i);
            }
        });

        ll = (LinearLayout) findViewById(R.id.ll);
        mycard = (CardView) findViewById(R.id.sembako);

        mycard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new
                        Intent(getApplicationContext(),MainActivity_tambah_sambat.class);
                startActivity(i);
            }
        });



    }

    public void flipperImages (int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        //animation

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

}