package com.veloso.danilo.listacarros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.URL;

public class ActivityLista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listacarros);

        BuscaDadosRede buscaDados = new BuscaDadosRede();

        try {
            buscaDados.execute(new URL("http://www.livroandroid.com.br/livro/carros/v2/carros_classicos.json"));
        } catch (Exception e){}
    }
}
