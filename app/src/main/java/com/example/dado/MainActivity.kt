package com.example.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button= findViewById(R.id.btngirar)
        val imgdado: ImageView = findViewById(R.id.imgdado)
        val imgdado2: ImageView = findViewById(R.id.imgdado2)

        button.setOnClickListener{
            val numal=(1..6).random()
            val numal2=(1..6).random()
            when(numal){
                1 -> imgdado.setImageResource(R.drawable.dice_1)
                2 -> imgdado.setImageResource(R.drawable.dice_2)
                3 -> imgdado.setImageResource(R.drawable.dice_3)
                4 -> imgdado.setImageResource(R.drawable.dice_4)
                5 -> imgdado.setImageResource(R.drawable.dice_5)
                6 -> imgdado.setImageResource(R.drawable.dice_6)
            }
            when(numal2){
                1 -> imgdado2.setImageResource(R.drawable.dice_1)
                2 -> imgdado2.setImageResource(R.drawable.dice_2)
                3 -> imgdado2.setImageResource(R.drawable.dice_3)
                4 -> imgdado2.setImageResource(R.drawable.dice_4)
                5 -> imgdado2.setImageResource(R.drawable.dice_5)
                6 -> imgdado2.setImageResource(R.drawable.dice_6)
            }

        }
    }
}