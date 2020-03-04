package com.eme.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.eme.fragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    BlankFragment f = BlankFragment.newInstance("Hola","Chao");
    BlankFragment2 f2 = BlankFragment2.newInstance("Hola","Chao");

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        init();
    }


    private void init() {

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("bla", "creando fragmento");

                getSupportFragmentManager().beginTransaction().add(R.id.con_tenedor, f, "BLANK").commit();
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("bla", "creando fragmento");

                getSupportFragmentManager().beginTransaction().add(R.id.con_cuchillo, f2, "BLANK2").commit();
            }
        });
    }
}
