package com.example.pc1.ejemplo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    public TextView editText1;
    public TextView editText2;
    private Button btnGuardar;
    private  Button btnMostrar;
    private  Button btnImagen;
    public static ArrayList <Datos> ListaDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        this.btnGuardar = (Button) findViewById(R.id.btnGuardar);
        this.btnMostrar = (Button) findViewById(R.id.btnMostrar);
        this.btnImagen = (Button) findViewById(R.id.btnImagen);
        this.editText1 = (TextView) findViewById(R.id.editText1);
        this.editText2 = (TextView) findViewById(R.id.editText2);
        ListaDatos = new ArrayList<Datos>();


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText1.getText().length() != 0 && editText2.getText().length() != 0){

                    Datos obj = new Datos();
                    obj.Nombre = editText1.getText().toString();
                    obj.Apellido = editText2.getText().toString();

                    ListaDatos.add(obj);
                    editText1.setText("");
                    editText2.setText("");
                    Toast.makeText(getApplicationContext(),"Datos guardados",Toast.LENGTH_LONG).show();
                }else{

                    Toast.makeText(getApplicationContext(),"Hay campos vacios",Toast.LENGTH_LONG).show();
                }


            }
        });

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ActivityMostrar = new Intent(Principal.this, Secundaria.class);
                startActivity(ActivityMostrar);
            }
        });

        btnImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ActivityImagen = new Intent(Principal.this, Imagen.class);
                startActivity(ActivityImagen);
            }
        });
    }


}
