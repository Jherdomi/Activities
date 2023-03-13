package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Listado extends AppCompatActivity {

    EditText nombreTextView;
    EditText correoTextView;
    EditText fechaTextView;
    EditText generoTextView;
    EditText edadTextView;
    EditText ratingTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos_activity);
        nombreTextView = (EditText) findViewById(R.id.nombreTextView);
        correoTextView = (EditText) findViewById(R.id.emailTextView);
        fechaTextView = (EditText) findViewById(R.id.fechaTextView);
        generoTextView = (EditText) findViewById(R.id.generoTextView);
        edadTextView = (EditText) findViewById(R.id.edadTextView);
        ratingTextView = (EditText) findViewById(R.id.ratingTextView);

        nombreTextView.setText(getIntent().getStringExtra("NOMBRE"));
        correoTextView.setText(getIntent().getStringExtra("EMAIL"));
        fechaTextView.setText(getIntent().getStringExtra("FECHA"));
        generoTextView.setText(getIntent().getStringExtra("GENERO"));
        edadTextView.setText(getIntent().getStringExtra("EDAD"));
        ratingTextView.setText(getIntent().getStringExtra("VALO"));





    }
    public void cancelarBoton(View v) {
        finish();
    }
}