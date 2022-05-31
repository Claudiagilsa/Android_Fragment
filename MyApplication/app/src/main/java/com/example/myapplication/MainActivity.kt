package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnIniciarSesion)
        btn.setOnClickListener {

            var User: EditText = findViewById(R.id.edUser)
            var Pass: EditText = findViewById(R.id.edPass)

            if (User.text.toString().equals("HolaTu") and Pass.text.toString().equals("Hola123")) {
                val lanzar = Intent(this, Form::class.java)
                startActivity(lanzar)
            } else {
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_LONG).show()
            }
        }
    }
}



