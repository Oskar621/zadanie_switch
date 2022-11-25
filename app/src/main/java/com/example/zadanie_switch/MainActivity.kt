package com.example.zadanie_switch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sortuj_butt = findViewById<Button>(R.id.Sortuj)
        val losuj_butt = findViewById<Button>(R.id.Losuj)
        val ListaSwitchy: List<Switch> = listOf(
            findViewById<Switch>(R.id.liczba1),
            findViewById<Switch>(R.id.liczba2),
            findViewById<Switch>(R.id.liczba3),
            findViewById<Switch>(R.id.liczba4),
            findViewById<Switch>(R.id.liczba5),
            findViewById<Switch>(R.id.liczba6),
            findViewById<Switch>(R.id.liczba7),
            findViewById<Switch>(R.id.liczba8),
            findViewById<Switch>(R.id.liczba9)
        )

        losuj_butt.setOnClickListener {
            for(i in 0..8)
            {
                val liczba = Random.nextInt(0,100)
                 ListaSwitchy[i].text = liczba.toString()
            }


        }

    }
}