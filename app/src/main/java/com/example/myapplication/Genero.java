package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Genero extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genero_activity);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    public void aceptarBoton(View view) {
        try {
            Intent inte = new Intent(this, MainActivity.class);
            Bundle ext = new Bundle();
            int selectedId = radioGroup.getCheckedRadioButtonId();


            radioButton = (RadioButton) findViewById(selectedId);
            ext.putString("GENERO", (String) radioButton.getText());
            inte.putExtras(ext);
            setResult(RESULT_OK, inte);
            Log.i("SUCCESS","Datos introducidos correctamente");
        }catch(Exception e){
            Log.i("SUCCESS","ERROR: Datos introducidos incorrectamente");
        }
        finish();
    }
    public void cancelarBoton(View v) {
        finish();
    }
}