package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class goldsoruActivity extends AppCompatActivity {
    EditText goldsayi1;
    EditText goldsoruMultiText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru_1);

        goldsoruMultiText = findViewById(R.id.editGoldSoru1Multi);
        goldsayi1=findViewById(R.id.editGoldSoru1Sayi);
    }
    public void goldSoruCalisitir (View view){
        int CarpilanSayi=Integer.parseInt(goldsayi1.getText().toString());
        int i=1;
        goldsoruMultiText.setText("");
        for (i=1;i<=10;i++)
        {
            int sonuc=CarpilanSayi*i;
            goldsoruMultiText.setText(goldsoruMultiText.getText().toString() + "\n" + CarpilanSayi+"X" +i+"="+sonuc);
        }
    }
}

