package com.arturopacheco.miscontactos;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Ivonne MC on 26/05/2017.
 */

public class Agregar_contacto extends AppCompatActivity {

    EditText idNombre;
    EditText idTelefono;
    EditText idCorreo;
    Button   btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_contacto);

    Button Agregar= (Button)findViewById(R.id.btnAgregar);
        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent agregar = new Intent(Agregar_contacto.this,MainActivity.class);
                startActivity(agregar);

            }
        });

        idNombre= (EditText)findViewById(R.id.idNombre);
        idTelefono = (EditText)findViewById(R.id.idTelefono);
        idCorreo = (EditText)findViewById(R.id.idCorreo);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);

        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}


