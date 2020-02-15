package com.example.legion.kalkulatorbangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Persegi extends AppCompatActivity {

    private Button btnHasilPersegi;
    private TextView hasilPersegi;
    private EditText etSisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        btnHasilPersegi = findViewById(R.id.btn_hasil_persegi);
        hasilPersegi = findViewById(R.id.tv_hasil_persegi);
        etSisi = findViewById(R.id.et_sisi_persegi);

        btnHasilPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSisi = etSisi.getText().toString();

                    double sisi = Double.parseDouble(sSisi);

                    double persegiHasil = sisi * sisi;

                    String sHasil = String.valueOf(persegiHasil);
                    hasilPersegi.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
