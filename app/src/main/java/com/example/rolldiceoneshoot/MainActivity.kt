package com.example.rolldiceoneshoot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  rollButton: Button =findViewById(R.id.button)
        rollButton.setOnClickListener{
           // make a toast
            val toast = Toast.makeText(this,"بختك يا ابوبخيت",Toast.LENGTH_SHORT)
            toast.show()
            // initiat auctall dice
            val randomNo = Dice().roll()
            val  resutTextView: TextView =findViewById(R.id.ResultView)
            // initiat a pic and put it after click
            resutTextView.text = randomNo.toString()
            val diceImage: ImageView = findViewById(R.id.resultpPic)

            if (randomNo==1) {
                diceImage.setImageResource(R.drawable.dice_1)
            } else if (randomNo==2){
                diceImage.setImageResource(R.drawable.dice_2)
            }else if (randomNo==3){
                diceImage.setImageResource(R.drawable.dice_3)
            }else if (randomNo==4){
                diceImage.setImageResource(R.drawable.dice_4)
            }else if (randomNo==5){
                diceImage.setImageResource(R.drawable.dice_5)
            }else   {
                diceImage.setImageResource(R.drawable.dice_6)
            }
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
