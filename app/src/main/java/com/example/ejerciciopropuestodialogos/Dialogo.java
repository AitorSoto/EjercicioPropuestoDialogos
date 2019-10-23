package com.example.ejerciciopropuestodialogos;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class Dialogo extends AppCompatActivity {

    private Button crearCuenta;
    private Button iniciarSesion;
    private TextInputEditText textoNombre;
    private TextInputEditText textoContraseña;

    public Dialogo(Context context){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = Dialogo.this.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.inicio_sesion, null));
        builder.show();

        crearCuenta = findViewById(R.id.botonCrear);
        iniciarSesion = findViewById(R.id.botonEntrar);
        textoNombre = findViewById(R.id.tiet_nombre);
        textoContraseña = findViewById(R.id.tiet_contraseña);

        crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textoNombre.getText().toString().equals("")
                        || textoContraseña.getText().toString().equals("")) {
                    Snackbar s = Snackbar.make(findViewById(R.id.contenedorPrincipal), "El campo esta vacio, no se puede llamar",
                            Snackbar.LENGTH_SHORT);
                    s.show();
                }
                //Toast.makeText(getApplicationContext(),textoNombre.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
