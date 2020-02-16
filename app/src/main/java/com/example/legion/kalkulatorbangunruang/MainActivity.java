package com.example.legion.kalkulatorbangunruang;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //deklarasi button
    private Button tombolSegitiga,tombolJajarGenjang, tombolPersegi, tombolLingkaran;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombolSegitiga = findViewById(R.id.btn_segitiga);
        tombolJajarGenjang = findViewById(R.id.btn_jajargenjang);
        tombolLingkaran = findViewById(R.id.btn_lingkaran);
        tombolPersegi = findViewById(R.id.btn_persegi);

        // function tombolia
        tombolSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSegitiga = new Intent(MainActivity.this,SegitigaActivity.class);
                startActivity(iSegitiga);
            }
        });

        tombolJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iJajarGenjang = new Intent(MainActivity.this,JajarGenjangActivity.class);
                startActivity(iJajarGenjang);
            }
        });

        tombolPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPersegi = new Intent(MainActivity.this,Persegi.class);
                startActivity(iPersegi);
            }
        });

        tombolLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLingkaran = new Intent(MainActivity.this,LingkaranActivity.class);
                startActivity(iLingkaran);
            }
        });
    }
}
