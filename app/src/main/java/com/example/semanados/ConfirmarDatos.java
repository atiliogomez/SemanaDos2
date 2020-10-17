package com.example.semanados;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;

    String nombre;
    String fecha;
    String telefono;
    String email;
    String descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvFecha = (TextView) findViewById(R.id.tvFecha);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);

        nombre = getIntent().getStringExtra("nombre");
        fecha = getIntent().getStringExtra("fecha");
        telefono = getIntent().getStringExtra("telefono");
        email = getIntent().getStringExtra("email");
        descripcion = getIntent().getStringExtra("descripcion");

        tvNombre.setText("Nombre Completo: " + nombre);
        tvFecha.setText("Fecha de Nacimiento: " + fecha);
        tvTelefono.setText("Télefono: " + telefono);
        tvEmail.setText("Email: " + email);
        tvDescripcion.setText("Descripción del contacto: " + descripcion);
    }

    public void editarDatos(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        intent2.putExtra("nombre", nombre);
        intent2.putExtra("fecha", fecha);
        intent2.putExtra("telefono", telefono);
        intent2.putExtra("email", email);
        intent2.putExtra("descripcion", descripcion);
        finish();
        startActivity(intent2);
    }
}