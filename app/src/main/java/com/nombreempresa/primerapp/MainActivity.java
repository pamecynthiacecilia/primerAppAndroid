package com.nombreempresa.primerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mensaje", "estoy en onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mensaje", "estoy en onStart");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mensaje", "estoy en onStop");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mensaje", "estoy en onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mensaje", "estoy en onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mensaje", "estoy en onDestroy");
    }

    public void siguiente(View v ){
        Intent i= new Intent(this,SegundaActividad .class);
        i.putExtra("apellido", "Faure");
        i.putExtra("dni", 123);
        startActivity(i);
    }

}