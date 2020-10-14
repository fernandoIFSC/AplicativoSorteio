package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtResultado;
EditText txtValorInicial,txtValorFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Sorteio");

        txtValorInicial = (EditText)findViewById(R.id.txtValorInicial);
        txtValorFinal = (EditText)findViewById(R.id.txtValorFinal);
        txtResultado = (TextView)findViewById(R.id.txtResultado);

    }

    public void Sortear(View v){
        int valorInicial,valorFinal,resultado;
        valorInicial = (Integer.parseInt(txtValorInicial.getText().toString()));
        valorFinal = Integer.parseInt(txtValorFinal.getText().toString());
        resultado = (int) ((Math.random()*(valorFinal-valorInicial))+valorInicial);
        txtResultado.setText("Resultado = "+resultado);
    }
}
