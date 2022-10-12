package com.example.newuppgift

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //skapar variabler för de olika textfälten
        val username = findViewById<EditText>(R.id.name)
        val password = findViewById<EditText>(R.id.pass)
        val loginBtn = findViewById<Button>(R.id.button2)

        //skapar en variabel för att skicka till nästa aktivitet om inloggningen lyckas med hjälp av en intent
        loginBtn.setOnClickListener {
            if (username.text.toString() == "admin" && password.text.toString() == "admin") {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
            //om inloggningen misslyckas visas ett toast meddelande som säger att inloggningen misslyckades
            else {
                val toast = Toast.makeText(this, "Wrong username or password", Toast.LENGTH_LONG)
                toast.show()
            }

        }
    }
}