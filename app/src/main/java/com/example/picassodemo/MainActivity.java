package com.example.picassodemo;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.radioGroup);
        Resources resources = getResources();
        String[] images = resources.getStringArray(R.array.images);

        radioGroup.setOnCheckedChangeListener((radioGroup1, i) -> Picasso.get()
                .load(images[i-1])
                .into(imageView));

    }
}