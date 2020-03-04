package com.eme.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonF1;
    Button buttonF2;
    BlankFragment f = BlankFragment.newInstance("Hola","Chao");
    BlankFragment2 f2 = BlankFragment2.newInstance("Hola","Chao");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonF1 = findViewById(R.id.button_1);
        buttonF2 = findViewById(R.id.button_2);
        init();
    }


    private void init() {
        buttonF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("bla", "creando fragmento");

                getSupportFragmentManager().beginTransaction().add(R.id.con_tenedor, f, "BLANK").commit();
            }
        });

        buttonF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("bla", "creando fragmento");

                getSupportFragmentManager().beginTransaction().add(R.id.con_cuchillo, f2, "BLANK2").commit();
            }
        });
    }
}
