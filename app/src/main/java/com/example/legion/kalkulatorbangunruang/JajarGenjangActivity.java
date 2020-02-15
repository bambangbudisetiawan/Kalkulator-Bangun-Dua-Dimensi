package com.example.legion.kalkulatorbangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JajarGenjangActivity extends AppCompatActivity {

    private Button btnHasilJajargenjang;
    private TextView tvjajarGenjang;
    private EditText etAlas,etTinggi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

            btnHasilJajargenjang = findViewById(R.id.btn_hasil_jajargenjang);
            tvjajarGenjang = findViewById(R.id.tv_hasil_jajargenjang);
            etTinggi = findViewById(R.id.et_tinggi_jajargenjang);
            etAlas = findViewById(R.id.et_alas_jajargenjang);

            btnHasilJajargenjang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        String sAlas = etAlas.getText().toString();
                        String sTinggi = etTinggi.getText().toString();

                        double alas = Double.parseDouble(sAlas);
                        double tinggi = Double.parseDouble(sTinggi);

                        double hasil = alas * tinggi;
                        String sHasil = String.valueOf(hasil);
                        tvjajarGenjang.setText(sHasil);
                    }catch (NumberFormatException nfe){
                        Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }
}
