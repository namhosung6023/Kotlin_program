package com.example.test03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var current = 1

        while (current <= 100) {
            Log.d("while" , "현재 값은 ${current + current} 입니다")

        }
    }
}