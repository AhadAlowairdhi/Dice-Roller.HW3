package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user
 * to interact with the screen (UI)
 * */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // must
        setContentView(R.layout.activity_main)
        //declare & initialize UI
        val rollBtn = findViewById<Button>(R.id.btn1)


        rollBtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice(){
        // create object
        val dice = Dice(6)
        // save the result number
        val diceRoll = dice.roll()

        // reference to imageView
        val diceImage : ImageView = findViewById(R.id.img_dice)

        // check number and update screen (UI)
        when(diceRoll){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        } // End when
    } // End rollDice() function
}