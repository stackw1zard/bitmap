package com.stackwizards.custom.graphicutils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.stackwizards.custom.graphiclib.GraphicsUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap defaultProfilPicture = BitmapFactory.decodeResource(this.getResources(), R.drawable.tuxs);
        ((ImageView) findViewById(R.id.imageView)).setImageBitmap(GraphicsUtils.getRoundedCornerBitmap(defaultProfilPicture, 50));

    }
}
