package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    EditText editTextnot1, editTextnot2, editTextnot3;
    Button buttonOnayla;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);


    }

    public void onayla2(View view) {

        editTextnot1 = findViewById(R.id.txtnumber1);
        editTextnot2 = findViewById(R.id.txtnumber2);
        editTextnot3 = findViewById(R.id.txtnumber3);
        int not1 = Integer.parseInt(editTextnot1.getText().toString());
        int not2 = Integer.parseInt(editTextnot2.getText().toString());
        int not3 = Integer.parseInt(editTextnot3.getText().toString());
        if (not1 > 100 || not2 > 100 || not3 > 100) {Toast.makeText(this, "Yüzden büyük girme", Toast.LENGTH_SHORT).show(); return; }
        float ort = (not1 + not2 + not3) / 3;
        if (ort >= 0 && ort < 25) {
            Toast.makeText(this, "0 ile kaldın. ", Toast.LENGTH_LONG).show();

        } else if (ort >= 25 && ort < 50) {
            Toast.makeText(this, "1 ile kaldın. ", Toast.LENGTH_LONG).show();
        } else if (ort >= 50 && ort < 60) {
            Toast.makeText(this, "2 ile gectin. ", Toast.LENGTH_LONG).show();
        } else if (ort >= 60 && ort < 70) {
            Toast.makeText(this, "3 ile kaldın. ", Toast.LENGTH_LONG).show();
        } else if (ort >= 70 && ort < 85) {
            Toast.makeText(this, "4 ile kaldın. ", Toast.LENGTH_LONG).show();
        } else if (ort >= 85 && ort < 100) {
            Toast.makeText(this, "5 ile kaldın. ", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "girilen mot biligileri hatalıdır. ", Toast.LENGTH_LONG).show();
        }
    }
}