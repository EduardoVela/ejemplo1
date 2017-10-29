package com.example.pc1.ejemplo1;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by pc1 on 28/10/2017.
 */

public class Adaptador extends ArrayAdapter<Datos>  {


    public Adaptador( Context context, List<Datos> objects) {
        super(context,0 , objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        Datos obj2 = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_resultado,parent, false);

        }

        TextView textoNombre = (TextView) convertView.findViewById(R.id.txtnombre);
        TextView textoApellido = (TextView) convertView.findViewById(R.id.txtapellido);


        //Mostrar los datos

        textoNombre.setText(obj2.Nombre);
        textoApellido.setText(obj2.Apellido);

        return convertView;
    }
}

