package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    String correo ="";
    String fecha = "";
    String nombre ="";
    String genero = "";
    String edad = "";
    String valoracion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((resultCode == RESULT_OK)) {
            switch(requestCode) {
                case 1: {
                    correo = data.getExtras().getString("EMAIL");
                    fecha = data.getExtras().getString("FECHA");
                    nombre = data.getExtras().getString("NOMBRE");
                }
                case 2: {
                    genero = data.getExtras().getString("GENERO");
                }
                case 3: {
                    edad = data.getExtras().getString("EDAD");
                }
                case 4: {
                    valoracion = data.getExtras().getString("VALO");
                }
                default: {

                }
            }
        }
    }

    public void altasBoton(View v) {
        Intent intent = new Intent(MainActivity.this, Alta.class);

        startActivityForResult(intent, 1);
    }

    public void verBoton(View v) {
        Intent intent = new Intent(MainActivity.this, Listado.class);

        intent.putExtra("EMAIL", correo);
        intent.putExtra("FECHA", fecha);
        intent.putExtra("NOMBRE", nombre);
        intent.putExtra("GENERO", genero);
        intent.putExtra("EDAD", edad);
        intent.putExtra("VALO", valoracion);
        startActivity(intent);
    }

    public void valoracionBoton(View v){
        Intent intent = new Intent(MainActivity.this, Valoracion.class);

        startActivityForResult(intent, 4);
    }

    public void edadBoton(View v){
        Intent intent = new Intent(MainActivity.this, Edad.class);

        startActivityForResult(intent, 3);
    }

    public void salirBoton(View v) {
        finish();
        System.exit(0);
    }

    public void generoBoton(View view) {
        Intent intent = new Intent(MainActivity.this, Genero.class);

        startActivityForResult(intent, 2);
    }
}