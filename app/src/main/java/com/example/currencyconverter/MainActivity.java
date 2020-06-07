package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view) {
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);
        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());
        Double poundAmount = dollarAmountDouble * 0.75;
        Toast.makeText(MainActivity.this, "£" + String.format("%.2f",poundAmount), Toast.LENGTH_SHORT).show();

        Log.i("amount",dollarAmountEditText.getText().toString());

    }
    private void login(String username,String password){
        if(username.equals("alp")&&password.equals("1234"))
        {
            Toast.makeText(MainActivity.this, "hosgeldiniz " + username, Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this , HomeActivity.class);
            startActivity(myIntent);
        }
        else {
            Toast.makeText(MainActivity.this, "giris basarısız", Toast.LENGTH_SHORT).show();

        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convertButton = findViewById(R.id.buttonConvert);
        final EditText usernameText = findViewById(R.id.usernameText);
        final EditText passwordText = findViewById(R.id.passwordText);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login(usernameText.getText().toString(),passwordText.getText().toString());


            }
        });
    }
}


