package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val girdi1 = findViewById(R.id.editTextNumberDecimal) as TextView
        val girdi2 = findViewById(R.id.editTextNumberDecimal3) as TextView

        val textSonuc = findViewById(R.id.textSonuc) as TextView
        val btn_click = findViewById(R.id.BtnHesapla) as Button

        btn_click.setOnClickListener {
            var res = (girdi1.text.toString().toDouble() + girdi2.text.toString().toDouble())/2
            when {
                res >= 50 -> {
                    textSonuc.setTextColor(Color.GREEN)
                    textSonuc.text = res.toString() + " Geçtiniz"
                }
                else -> {
                    textSonuc.setTextColor(Color.RED)
                    textSonuc.text = res.toString() + " Kaldınız"
                }
            }
        }

    }

}
