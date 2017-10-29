package com.example.pc1.ejemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Secundaria extends AppCompatActivity {

    private Adaptador myAdapter;
    public ArrayList<Datos> ArrayDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        ArrayDatos = Principal.ListaDatos;
        myAdapter = new Adaptador(this, ArrayDatos);
        ListView ltsDatos = (ListView)findViewById(R.id.idLista);
        ltsDatos.setAdapter(myAdapter);

        myAdapter.notifyDataSetChanged();
    }
}
