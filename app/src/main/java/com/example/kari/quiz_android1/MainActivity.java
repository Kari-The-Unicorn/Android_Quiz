package com.example.kari.quiz_android1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton buttonA, buttonB, buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonA = (ImageButton) findViewById(R.id.imageButton1);
        buttonB = (ImageButton) findViewById(R.id.imageButton2);
        buttonC = (ImageButton) findViewById(R.id.imageButton3);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "A is clicked! Wrong answer!", Toast.LENGTH_SHORT).show();
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "B is clicked! Wrong answer!", Toast.LENGTH_SHORT).show();
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "C is clicked! Wrong answer!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
