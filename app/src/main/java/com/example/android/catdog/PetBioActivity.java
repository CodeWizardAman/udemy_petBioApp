package com.example.android.catdog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by UFO_24 on 17-02-2018.
 */

public class PetBioActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView nameTxtView;
    private TextView bioTxtView;
    private Bundle extras;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        imageView = (ImageView) findViewById(R.id.pet_image_view);
        nameTxtView = (TextView) findViewById(R.id.pet_name_txt_view);
        bioTxtView = (TextView) findViewById(R.id.pet_bio_txt_view);

        extras = getIntent().getExtras();

        if (extras != null) {

            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name, bio);
        }
    }

    private void setUp(String name, String bio) {
        if (name.equals("Chatori")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.cat));


        } else if (name.equals("lucky")) {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.dog));

        }

        nameTxtView.setText(name);
        bioTxtView.setText(bio);
    }


}
