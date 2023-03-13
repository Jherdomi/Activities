package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Alta extends AppCompatActivity {

    TextView nombreTextView;
    TextView correoTextView;
    TextView fechaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alta_activity);
        nombreTextView = (TextView) findViewById(R.id.nombreTextView);
        correoTextView = (TextView) findViewById(R.id.emailTextView);
        fechaTextView = (TextView) findViewById(R.id.fechaTextView);
    }
    public void cancelarBoton(View v) {
        finish();
    }
    public void aceptarBoton(View v) {
        if(nombreTextView.getText().toString().compareTo("")==0
                ||correoTextView.getText().toString().compareTo("")==0
                ||fechaTextView.getText().toString().compareTo("")==0){
            Log.i("SUCCESS","ERROR: Datos introducidos incorrectamente");
        }
        else {
            Intent inte = new Intent(this, MainActivity.class);
            Bundle ext = new Bundle();
            ext.putString("NOMBRE", nombreTextView.getText().toString());
            ext.putString("EMAIL", correoTextView.getText().toString());
            ext.putString("FECHA", fechaTextView.getText().toString());
            inte.putExtras(ext);

            setResult(RESULT_OK, inte);
            Log.i("SUCCESS","Datos introducidos correctamente");
        }
        finish();
    }
}