package com.example.redes.tallerintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private EditText nombretxt, clavetxt, codigotxt;
    private Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnlogin = (Button) findViewById(R.id.btnLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("hola");


                EditText nombretxt = (EditText) (findViewById(R.id.editNombre));
                EditText clavetxt = (EditText) (findViewById(R.id.editClave));
                EditText codigotxt = (EditText) (findViewById(R.id.editCodigo));

                ArrayList<String> data = new ArrayList<String>();

                data.add(nombretxt.getText()+"");
                data.add(clavetxt.getText()+"");
                data.add(codigotxt.getText()+"");

                Intent i = new Intent(MainActivity.this, nuevaVentana.class);
                //i.putExtra("nombre", nombretxt.getText()+"");
                //i.putExtra("clave", clavetxt.getText()+"");
                i.putStringArrayListExtra("data", data);
                startActivity(i);
            }
        });
    }
}
