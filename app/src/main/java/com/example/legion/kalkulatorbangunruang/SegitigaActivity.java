package com.example.legion.kalkulatorbangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegitigaActivity extends AppCompatActivity {

    private Button btnHasil;
    private TextView tvSegitiga;
    private EditText etAlas, etTinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        btnHasil = findViewById(R.id.btn_hasil_segitiga);
        tvSegitiga = findViewById(R.id.tv_hasil_segitiga);
        etTinggi = findViewById(R.id.et_tinggi_segitiga);
        etAlas = findViewById(R.id.et_alas_segitiga);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sAlas = etAlas.getText().toString();
                    String sTinggi = etTinggi.getText().toString();

                    double alas = Double.parseDouble(sAlas);
                    double tinggi = Double.parseDouble(sTinggi);

                    double hasil = 0.5 * alas * tinggi;
                    String sHasil = String.valueOf(hasil);
                    tvSegitiga.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
