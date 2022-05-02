package com.example.imegesexemple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.imageView);

        int[] ids = new int[] {
                R.drawable.kot_korzina,
                R.drawable.kitties,
                R.drawable.kitty
        };

        image.setOnClickListener(new View.OnClickListener() {

            int index = 0;

            @Override
            public void onClick(View view) {
                index++;
                index %= ids.length;
                
                image.setImageResource(ids[index]);
            }
        });
    }
}


//    ImageView imageView = findViewById(R.id.icon);
//
//        int[] imgsID = new int[] {
//                R.drawable.kot_korzina,
//                R.drawable.kitties,
//        };
//
//        imageView.setOnClickListener(new View.OnClickListener() {
//
//            int index = 0;
//
//            @Override
//            public void onClick(View view) {
//                ++index;
//                index %= imgsID.length;
//
//                imageView.setImageResource(imgsID[index]);
//            }
//        });