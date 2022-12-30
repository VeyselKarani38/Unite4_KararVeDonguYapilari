package com.example.unite4_kararvedongu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoldSoru2Activity extends AppCompatActivity {
    EditText GoldSoru2SayıGiriniz;
    EditText GoldSoru2MultiText;
    EditText GoldSoru2MultiText2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru_2);

        try {
            GoldSoru2MultiText  = findViewById(R.id.edittextmulti1);
            GoldSoru2MultiText2 = findViewById(R.id.edittextmulti2);
            GoldSoru2SayıGiriniz = findViewById(R.id.editGoldSoru2sayi);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public void GoldSoru2Calistir(View view)
    {
        int sayi =Integer.parseInt(GoldSoru2SayıGiriniz.getText().toString());
        int sayac =0;
        int sonucteksayi = 0;
        int sonuciftsayi = 0;
        while (sayac <= sayi)
        {
            if (sayac % 2==1)
            {
                sonucteksayi = sayac + sonucteksayi;
                GoldSoru2MultiText.setText(GoldSoru2MultiText.getText().toString()+sonucteksayi+"\n");

            }
            else
            {
                sonuciftsayi = sayac + sonuciftsayi;
                GoldSoru2MultiText2.setText(GoldSoru2MultiText2.getText().toString()+sonuciftsayi+"\n");
            }
            sayac++;
        }

    }
}
