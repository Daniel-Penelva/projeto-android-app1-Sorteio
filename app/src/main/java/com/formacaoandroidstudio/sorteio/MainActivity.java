package com.formacaoandroidstudio.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarSorteio(View view){

        TextView numSorteio = findViewById(R.id.textoResultado);

        int numAleatorio = new Random().nextInt(11);

        numSorteio.setText("Número: " + numAleatorio);
    }
}
