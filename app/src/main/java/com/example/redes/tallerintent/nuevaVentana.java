package com.example.redes.tallerintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class nuevaVentana extends AppCompatActivity {
    private TextView txtnombre, txtclave, txtcodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nueva_ventana);

        //TextView txtnombre = (TextView) findViewById(R.id.lbldata);
        TextView txtnombre= (TextView)(findViewById(R.id.lblnombre));
        TextView txtclave= (TextView)(findViewById(R.id.lblclave));
        TextView txtcodigo= (TextView)(findViewById(R.id.lblcodigo));

        //txtnombre.setText((String)getIntent().getExtras().get("nombre"));
        //txtclave.setText((String)getIntent().getExtras().get("clave"));

        ArrayList <String> data = (ArrayList<String>) getIntent().getStringArrayListExtra("data");

        txtnombre.setText(data.get(0));
        txtclave.setText(data.get(1));
        txtcodigo.setText(data.get(2));

        /*String nombre = getIntent().getStringExtra("nombre");
        String clave = getIntent().getStringExtra("clave");

        txtnombre.setText(nombre + clave);*/

    }

}
