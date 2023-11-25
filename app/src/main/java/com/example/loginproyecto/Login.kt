package com.example.loginproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    private val validUsu = "acascoc098"
    private val validContra = "acascoc"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        usernameEditText = findViewById(R.id.usuario);
        passwordEditText = findViewById(R.id.contraseña);
        loginButton = findViewById(R.id.boton)
        setContentView(R.layout.log_in)

        loginButton.setOnClickListener {
            val usernameInput = usernameEditText.text.toString()
            val passwordInput = passwordEditText.text.toString()

            if (usernameInput == validUsu && passwordInput == validContra) {
                Toast.makeText(this, "Acceso correcto", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Principal::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Usuario o contarseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}