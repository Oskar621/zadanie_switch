package com.example.zadanie_switch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    }
}