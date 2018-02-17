package com.example.android.catdog;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by UFO_24 on 17-02-2018.
 */

public class PetBioActivity extends AppCompatActivity{

    private ImageView imageView;
    private TextView nameTxtView;
    private TextView bioTxtView;
    private Bundle extras;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         imageView = (ImageView)findViewById(R.id.pet_image_view);
         nameTxtView = (TextView)findViewById(R.id.pet_name_txt_view);
         bioTxtView = (TextView) findViewById(R.id.pet_bio_txt_view);

         extras = getIntent().getExtras();
    }

    
}
