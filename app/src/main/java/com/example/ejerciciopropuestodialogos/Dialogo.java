package com.example.ejerciciopropuestodialogos;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class Dialogo {
    public Dialogo(final Context context){
        final Dialog dialogo = new Dialog(context);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setCancelable(false);
        dialogo.setContentView(R.layout.inicio_sesion);
        dialogo.show();

        Button crearCuenta = (Button)dialogo.findViewById(R.id.botonCrear);;
        Button iniciarSesion = (Button)dialogo.findViewById(R.id.botonEntrar);
        final TextInputEditText textoNombre = (TextInputEditText)dialogo.findViewById(R.id.tiet_nombre);
        final TextInputEditText textoContraseña = (TextInputEditText)dialogo.findViewById(R.id.tiet_contraseña);

        crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textoNombre.getText().toString().equals("")
                        || textoContraseña.getText().toString().equals("")) {
                    Snackbar s = Snackbar.make(dialogo.findViewById(R.id.contenedorPrincipal), "El nombre o la contraseña están vacias...",
                            Snackbar.LENGTH_LONG);
                    s.show();
                }
                else{
                    dialogo.dismiss();
                    Toast.makeText(context, "Bienvenido "+textoNombre.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textoNombre.getText().toString().equals("")
                        || textoContraseña.getText().toString().equals("")) {
                    Snackbar s = Snackbar.make(dialogo.findViewById(R.id.contenedorPrincipal), "El nombre o la contraseña están vacias...",
                            Snackbar.LENGTH_LONG);
                    s.show();
                }
                else{
                    dialogo.dismiss();
                    Toast.makeText(context, "Bienvenido "+textoNombre.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
