package com.br.frasescomamptyactive;

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

    // Função responsável por gerar a frase
    public void gerarNovaFrase(View view){

        // armazenando as frases que podem ser geradas
        String[] frases = {
                "Vida longa e próspera(Sr. Spock - StarTrek)", // posiçao 0
                "Eu tenho a força!(He-man)", // posiçao 1
                "Que a força esteja com voce! (StarWars)", //posiçao 2
                "Voce não passará!(Gandalf)", // posiçao 3
                "Ao infinito, e além!(BuzzLightyear)", // posiçao 4
                "Com grandes poderes, vem grandes responsabilidades(tion Bem - Spiderman)", // posiçao 5
                "Bazinga!(Shedon copper - The Big Bang theory)", // posiçao 6
                "que pe que há, velhinho? (Pernalonga)", // posiçao 7



        };

        //VAR responsável por gerar os valores aleatórios
        //que serão utilizados para indicar a posiçao no vetor frases(acima)
        int numero = new Random().nextInt( 9 );

        //Mostrando a frase com base na posição soteada
        TextView frase = findViewById(R.id.txtFraseGerada);
        frase.setText(frases[numero]);
    }// Fechamento da função GerarNovaFrase
}

