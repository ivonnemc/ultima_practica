package com.arturopacheco.miscontactos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Ivonne MC on 26/05/2017.
 */

public class Mostrar_datos extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_datos);

        Button Agregarcontacto=(Button)findViewById(R.id.btnAgregarcontacto);
        Agregarcontacto.setOnClickListener(this);
        Agregarcontacto.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Toast.makeText(Mostrar_datos.this,"",Toast.LENGTH_SHORT).show();
            }


        });

        Button Eliminarcontacto=(Button)findViewById(R.id.btnEliminarcontacto);
        Eliminarcontacto.setOnClickListener(this);
        Eliminarcontacto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}