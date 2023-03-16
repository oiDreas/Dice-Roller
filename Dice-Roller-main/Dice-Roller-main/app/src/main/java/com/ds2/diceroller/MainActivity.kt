package com.ds2.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Rolou um Dado!", Toast.LENGTH_SHORT) .show()
            val resultTextView: TextView = findViewById(R.id.textView2)
            resultTextView.text = "1"
        }

    }
    fun rollDice(){
        val dice = Dice( 6)
        val resultTextView: TextView = findViewById(R.id.textView2)
        val imageView: ImagineView = findViewById(R.id.//Nome do arquivo)
        imageView.setImageResource(R.drawable.//Resultado da rolagem)
        val diceRoll = dice.roll()
        resultTextView.text = diceRoll.toString()
    }

    class Dice(private val numSides: Int){

        new*
        fun roll() :Int {
            return (1..numSides).random()
        }
    }

}