package com.example.legion.kalkulatorbangunruang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LingkaranActivity extends AppCompatActivity {

    private Button btnHasilLingkaran;
    private TextView tvLingkaran;
    private EditText etJarijari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        btnHasilLingkaran = findViewById(R.id.btn_hasil_lingkaran);
        tvLingkaran = findViewById(R.id.tv_hasil_lingkaran);
        etJarijari = findViewById(R.id.et_jarijari_lingkaran);

        btnHasilLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sJarijari = etJarijari.getText().toString();

                    double jarijari = Double.parseDouble(sJarijari);

                    double persegiHasil = 22/7*jarijari*jarijari;

                    String sHasil = String.valueOf(persegiHasil);
                    tvLingkaran.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
