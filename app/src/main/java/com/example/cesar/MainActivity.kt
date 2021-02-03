package com.example.cesar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buscador = findViewById<EditText>(R.id.buscador).text
        val btnEncriptar = findViewById<Button>(R.id.btn_encriptar)
        val btnDesencriptar = findViewById<Button>(R.id.btn_desencriptar)

        btnEncriptar.setOnClickListener {
            des_en(buscador.toString(), 1)
        }

        btnDesencriptar.setOnClickListener {
            des_en(buscador.toString(), 2)
        }
    }

    private fun des_en(buscador: String, opcion: Int){
        var tipoTitulo: String
        var tipoMensaje: String
        var pass: String

        if (buscador.isNotEmpty()) {
            val desencriptado = calcular(buscador, opcion)
            pass = desencriptado()
            if (pass == "Error"){
                tipoTitulo = pass
                tipoMensaje = "Porfavor, ingrese caracteres validos"
                showMensaje(tipoTitulo, tipoMensaje)
            }else{
                tipoTitulo = "Su codigo desencriptado es: "
                tipoMensaje = pass
                showMensaje(tipoTitulo, tipoMensaje)
            }

        } else{
            tipoTitulo = "Error"
            tipoMensaje = "Porfavor, llene todos los campos"
            showMensaje(tipoTitulo, tipoMensaje)
        }
    }

    private fun showMensaje(titulo:String, mensaje: String){
        val builder = AlertDialog.Builder(this)
        builder.setTitle(titulo)
        builder.setMessage(mensaje)
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}