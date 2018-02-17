package com.example.android.catdog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView catView = (ImageView)findViewById(R.id.img_view_cat);
        ImageView dogView = (ImageView) findViewById(R.id.img_view_dog);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.img_view_cat:
                //Toast.makeText(MainActivity.this, "Hey ! I am cat..Meow!", Toast.LENGTH_SHORT).show();

                Intent catIntetnt = new Intent(MainActivity.this, PetBioActivity.class);
                catIntetnt.putExtra("name", "Chatori");
                catIntetnt.putExtra("bio", "Chatori Cat, Eat everything");
                startActivity(catIntetnt);
                break;

            case R.id.img_view_dog:
               // Toast.makeText(MainActivity.this, "Hey ! I am dog..bhow bhow!", Toast.LENGTH_SHORT).show();

                Intent dogIntent = new Intent(MainActivity.this, PetBioActivity.class);
                dogIntent.putExtra("name", "lucky");
                dogIntent.putExtra("bio", "Barks too much, over protective");
                startActivity(dogIntent);
                break;
        }
    }

}
