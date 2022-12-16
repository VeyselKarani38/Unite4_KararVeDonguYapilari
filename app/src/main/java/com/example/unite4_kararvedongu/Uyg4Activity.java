package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    Switch konumServisleri,konumGonder,konumAl;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);

        konumServisleri=findViewById(R.id.KonumServisi);
        konumAl = findViewById(R.id.KonumAl);
        konumGonder = findViewById(R.id.KonumGonder);


            if (konumServisleri.isChecked()){
                konumAl.setVisibility(View.VISIBLE);
                konumGonder.setVisibility(View.VISIBLE);
            }
            else{
                konumAl.setVisibility(View.GONE);
                konumGonder.setVisibility(View.GONE);
            }

    }

    protected void onResume() {
        super.onResume();
        konumServisleri.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (konumServisleri.isChecked()){
                    konumAl.setVisibility(View.VISIBLE);
                    konumGonder.setVisibility(View.VISIBLE);
                }
                else{
                    konumAl.setVisibility(View.GONE);
                    konumGonder.setVisibility(View.GONE);
                }
            }
        });
    }

    public  void  onayla (View view){
        if (!konumServisleri.isChecked()){
            Toast.makeText(this, "konum sevrileri kapalı",Toast.LENGTH_LONG).show();

        }
        else {
            if (konumAl.isChecked() == true && konumGonder.isChecked() == true) {
                Toast.makeText(this, "Konum Al ve Konum Gönder Acık", Toast.LENGTH_LONG).show();

            }
            if (konumAl.isChecked() == true && konumGonder.isChecked() == false) {
                Toast.makeText(this, "Konum Al Konum Gönder kapalı", Toast.LENGTH_LONG).show();

            }
            if (konumAl.isChecked() == false && konumGonder.isChecked() == true) {
                Toast.makeText(this, "Konum Al Kapalı Konum Gönder Ack", Toast.LENGTH_LONG).show();

            }
            if (konumAl.isChecked() == false && konumGonder.isChecked() == false) {
                Toast.makeText(this, "Konum Al Ve Konum Gönder Kapalı ", Toast.LENGTH_LONG).show();

            }
        }

        }
    }



