package com.example.zadanie_switch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sortujButt = findViewById<Button>(R.id.Sortuj)
        val losujButt = findViewById<Button>(R.id.Losuj)
        val wynik = findViewById<TextView>(R.id.wynik)
        val listaSwitchy: List<Switch> = listOf(
            findViewById(R.id.liczba1),
            findViewById(R.id.liczba2),
            findViewById(R.id.liczba3),
            findViewById(R.id.liczba4),
            findViewById(R.id.liczba5),
            findViewById(R.id.liczba6),
            findViewById(R.id.liczba7),
            findViewById(R.id.liczba8),
            findViewById(R.id.liczba9)
        )

        losujButt.setOnClickListener {
            for(i in 0..8)
            {
                val liczba = Random.nextInt(0,100)
                listaSwitchy[i].text = liczba.toString()
            }
        sortujButt.setOnClickListener {
            val lista: MutableList<Int> = mutableListOf()
            for (i in 0..8) {
                if (listaSwitchy[i].isChecked)
                    lista.add(listaSwitchy[i].text.toString().toInt())
            }
            for (i in 0 until  lista.size-1)
                for(j in 0 until  lista.size-1)
                    if(lista[j] > lista[j+1])
                    {
                        val pom = lista[j]
                        lista[j] = lista[j+1]
                        lista[j+1] = pom
                    }
            wynik.text = lista.toString()

        }
        }

    }
}