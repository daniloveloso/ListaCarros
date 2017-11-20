package com.veloso.danilo.listacarros;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.veloso.danilo.listacarros.pacote_carro.Carro;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by danil on 26/10/2017.
 */

public class Adapter extends ArrayAdapter {

    public Adapter(ArrayList<Carro>lista, Context contexto){

        super(contexto, 0, lista);

    }

    public View getView(int pos,View celula, ViewGroup pai){
        Carro carro = (Carro) getItem(pos);
        if (celula == null){
            celula =
                    LayoutInflater.from(getContext()).inflate(R.layout.listacarros, pai, false);
        }

        ImageView imagem = (ImageView) celula.findViewById(R.id.imageView);
        TextView nome = (TextView) celula.findViewById(R.id.NomeCarro);
        TextView latitude = (TextView) celula.findViewById(R.id.Latitude);
        TextView longitude = (TextView) celula.findViewById(R.id.Longitude);

        nome.setText(carro.getNome());

        Bitmap bitmap = buscaImagem(carro.getUrlFoto());
        imagem.setImageBitmap(bitmap);

        return null;
    }

    Bitmap buscaImagem(String ender){
        return null;
    }
}

class BuscaDadosRede extends AsyncTask<URL, Void, ArrayList> {
    // Mpétodo que executa a thread em segunso plano
    public ArrayList<Carro> doInBackground(URL...urls) {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();
        ArrayList<Carro> listaCarros = new ArrayList();


        Request request = new Request.Builder().url(urls[0]).build();
        try{
            Response response = client.newCall(request).execute();
            String json = response.body().string();
            listaCarros = gson.fromJson(json,new TypeToken<ArrayList<Carro>>(){}.getType());

        }catch (IOException e){
            e.printStackTrace();

        }
        return listaCarros;
    }
    //Método que execulta apóos a conclusão da thread
    //Código chamado ja na thread principal
    public void onPostExecute(ArrayList<Carro> carros){

        //PEGAR A REFERENCIA DO LIST VIEW
        //CRIAR O ADAPTER PASSANDO O ARRAYLIST POR PARAMETRO
        //VINCULAR O ADAPTER AO LISTVIEW

    }


}
