package com.evancastro29.classelivro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

    }
}