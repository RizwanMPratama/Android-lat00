package com.poliban.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan view dengan source code kita
        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThird = findViewById(R.id.btThird);
        Button btForth = findViewById(R.id.btForth);

        //Interface onClickListener merupakan interFace yg ada dikelas view

        //berikut kode memasang event listener onclick pada object Button
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda telah menekan tombol First", Toast.LENGTH_SHORT).show();
            }
        });

        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda telah menekan tombol Second", Toast.LENGTH_SHORT).show();
            }
        });

        btThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda telah menekan tombol Third", Toast.LENGTH_SHORT).show();
            }
        });

        btForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda telah menekan tombol Forth", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
