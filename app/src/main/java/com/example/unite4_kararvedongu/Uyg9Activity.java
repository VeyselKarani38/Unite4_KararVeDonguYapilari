package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewAnimator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    EditText editText_Sayilar;
    Button button_TekSyi, button_CiftSayi, button_TumSayi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_layout);
        editText_Sayilar = findViewById(R.id.editText_Sayilar);
        button_CiftSayi = findViewById(R.id.button_CiftSayilar);
        button_TekSyi = findViewById(R.id.button_TekSayilar);
        button_TumSayi = findViewById(R.id.button_Tumliste);
    }
    public void ciftsayilar(View view)
    {
        editText_Sayilar.setText("");
        for (int i=0;i<=15;i++){
            if (i%2!=0){
                editText_Sayilar.setText(editText_Sayilar.getText()+""+1);
            }

    }
    }

    public void TekSayilar(View view) {
        editText_Sayilar.setText("");
        for (int i=0;i<=15;i++){
            if (i%2!=0){
                editText_Sayilar.setText(editText_Sayilar.getText()+""+i);

            }
        }
    }
    public void tumsayi(View view){
        editText_Sayilar.setText("");
        for (int i=0;i<=15;i++){
            editText_Sayilar.setText(editText_Sayilar.getText()+""+i);
        }
    }
}


