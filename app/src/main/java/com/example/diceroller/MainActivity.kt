package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declare & initialize UI
        val rollBtn = findViewById<Button>(R.id.btn1)
        val tvDice = findViewById<TextView>(R.id.tv1)

        rollBtn.setOnClickListener {
            //Show Toast
            val toast = Toast.makeText(this, "Dice rolled",Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}