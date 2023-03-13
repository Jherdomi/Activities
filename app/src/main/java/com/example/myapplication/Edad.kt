package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Edad : AppCompatActivity() {
    var edadSeekBar: SeekBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edad_activity)
        edadSeekBar = findViewById<View>(R.id.edadSeekBar) as SeekBar
        var medidaText = findViewById<View>(R.id.medidaText) as TextView

        edadSeekBar!!.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    var edad = progress.toDouble()/100*70+10
                    medidaText.text = ""+edad.toInt()+" años"
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {

                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {

                }

            })
    }

    fun aceptarBoton(view: View?) {
        val data = Intent(this, MainActivity::class.java)
        var edad = (edadSeekBar?.progress?: 0)
        edad = (edad.toDouble()/100*70+10).toInt()
        val extras = Bundle()
        extras.putString("EDAD", ""+edad+" años")
        data.putExtras(extras)

        setResult(RESULT_OK, data)
        finish()
        Log.i("SUCCESS", "Se ha obtenido la edad correctamente.")
    }

    fun cancelarBoton(v: View?) {
        finish()
    }
}