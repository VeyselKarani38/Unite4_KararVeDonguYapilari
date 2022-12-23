package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    EditText txtFaktoriyel;
    TextView viewSonuc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_layout);

        txtFaktoriyel = findViewById(R.id.txtfak);
        viewSonuc = findViewById(R.id.viewSonuc);

    }

    public void btnhesapla(View view) {
        int faktoriyel = Integer.parseInt(txtFaktoriyel.getText().toString());
        int sayac = 1;
        long sonuc = 1;
        while (sayac <= faktoriyel) {
            sonuc = sonuc * sayac;
            sayac++;
        }
        viewSonuc.setText("sonuc:"+sonuc);
    }
}

