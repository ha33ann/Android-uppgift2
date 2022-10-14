package com.example.newuppgift

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //skapar variabler för de olika textfälten
        val username = findViewById<EditText>(R.id.name)
        val age = findViewById<EditText>(R.id.age)
        val switch = findViewById<Switch>(R.id.switch1)
        val food = findViewById<EditText>(R.id.food)
        val maleOrFemale = findViewById<EditText>(R.id.mof)
        val displayBtn = findViewById<Button>(R.id.button3)
        val display = findViewById<TextView>(R.id.result)

        //skapar en button listener för att visa texten från formulären i textfälten
        displayBtn.setOnClickListener{
            display.append("Name?: " + username.text.toString())
            display.append("\n")
            display.append("Age?: " + age.text.toString())
            display.append("\n")
            if (switch.isChecked) {
                display.append("Drivers License?: Yes")
            } else {
                display.append("Drivers License?: No")
            }
            display.append("\n")
            display.append("Favorite food?: " + food.text.toString())
            display.append("\n")
            display.append("Male or Female?: " + maleOrFemale.text.toString())
        }
        //skapar en button listener för att gå tillbaka till första activityn
        val previousBtn = findViewById<Button>(R.id.button4)

        //skapar en intent för att gå tillbaka till första activityn och startar den
        previousBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
