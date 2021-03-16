package com.nombreempresa.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);


        Intent i = getIntent();
        String apellido = i.getStringExtra("apellido");
        int dni = i.getIntExtra("dni", -1);
        Log.d("datos", apellido + " " + dni);
    }
}