package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final EditText sayi1 = findViewById(R.id.editTextSayı1);
        final EditText sayi2 = findViewById(R.id.editTextSayı2);
        final TextView sonuc = findViewById(R.id.textViewSonuc);

        Button topla = findViewById(R.id.buttonTopla);
        Button cikarma = findViewById(R.id.buttonCıkarma);
        Button bolum = findViewById(R.id.buttonBolum);
        Button carpim = findViewById(R.id.buttonCarpma);

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Sonuc = Double.parseDouble(sayi1.getText().toString())+Double.parseDouble(sayi2.getText().toString());
                sonuc.setText(String.valueOf(Sonuc));
            }
        });
        cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Sonuc = Double.parseDouble(sayi1.getText().toString())-Double.parseDouble(sayi2.getText().toString());
                sonuc.setText(String.valueOf(Sonuc));

            }
        });
        bolum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Sonuc = Double.parseDouble(sayi1.getText().toString())/Double.parseDouble(sayi2.getText().toString());
                sonuc.setText(String.valueOf(Sonuc));

            }
        });
        carpim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Sonuc = Double.parseDouble(sayi1.getText().toString())*Double.parseDouble(sayi2.getText().toString());
                sonuc.setText(String.valueOf(Sonuc));

            }
        });


    }
}
