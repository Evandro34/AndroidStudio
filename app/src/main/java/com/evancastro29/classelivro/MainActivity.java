package com.evancastro29.classelivro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criarObjetos();
    }

    public void criarObjetos(){

        Livro objLivro = new Livro();
        objLivro.setAutor("Marco Maddo");
        objLivro.setTitulo("POO Encaspsulamento Seguro em Java");
        objLivro.setEditora("Mundial POO");
        objLivro.setPaginas(140);
        objLivro.setLocalizacao("L1L1");

        Log.i("POO","Obj Livro: Autor" + objLivro.getAutor());
        Log.i("POO","Obj Livro: Titulo" + objLivro.getTitulo());
        Log.i("POO","Obj Livro: Editora" + objLivro.getEditora());
        Log.i("POO","Obj Livro: Pagina" + objLivro.getPaginas());
        Log.i("POO","Obj Livro: Localizacao" + objLivro.getLocalizacao());


    }
}