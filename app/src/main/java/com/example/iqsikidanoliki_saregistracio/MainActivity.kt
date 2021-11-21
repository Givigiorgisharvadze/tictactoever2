package com.example.iqsikidanoliki_saregistracio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var firstPlayerName :EditText

    private lateinit var secondPLayerName : EditText

    private lateinit var btnStart : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.btnStart)

        firstPlayerName = findViewById(R.id.firstPlayerName)

        secondPLayerName = findViewById(R.id.secondPlayerName)

        btnStart.setOnClickListener {

            var p1 = firstPlayerName.text.toString()
            var p2 = secondPLayerName.text.toString()
            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("player1", p1)
            intent.putExtra("player2", p2)
            startActivity(intent)
            firstPlayerName.setText("")
            secondPLayerName.setText("")
            if (firstPlayerName.text.isEmpty()){

                Toast.makeText(this, "შეავსეთ პირველი მოთამაშის სახელის ველი", Toast.LENGTH_SHORT).show()

            }

            if(secondPLayerName.text.isEmpty()) {

                Toast.makeText(this, "შეავსეთ მეორე მოთამაშის სახელის ველი", Toast.LENGTH_SHORT).show()

            }

        }

    }
}