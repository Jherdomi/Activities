package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

public class Valoracion extends AppCompatActivity {
    private RatingBar rating;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valoracion_activity);
        rating = findViewById(R.id.ratingBar);
    }

    public void aceptarBoton(View view) {
        Intent data = new Intent(this, MainActivity.class);
        Bundle extras = new Bundle();
        String puntuacion = rating.getRating()+"";
        extras.putString("VALO", puntuacion);
        data.putExtras(extras);

        setResult(RESULT_OK, data);
        finish();
        Log.i("SUCCESS","Datos introducidos correctamente");
    }
    public void cancelarBoton(View v) {
        finish();
    }
}
