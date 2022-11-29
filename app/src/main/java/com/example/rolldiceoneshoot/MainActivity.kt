package com.example.rolldiceoneshoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  rollButton: Button =findViewById(R.id.button)
        rollButton.setOnClickListener{
            val toast = Toast.makeText(this,"بختك يا ابوبخيت",Toast.LENGTH_SHORT)
            toast.show()

            val randomNo = Dice().roll()
            println("called the dice.roll and returned  $randomNo")

        }

    }

    class Dice(){
        fun roll():Int{
            val randomNumber = (1..6).random()
            println(randomNumber)
            return randomNumber
        }
    }
}