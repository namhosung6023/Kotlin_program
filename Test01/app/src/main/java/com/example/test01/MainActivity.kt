package com.example.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ageOfHosung = 23
        when (ageOfHosung) {
            in 10..19 -> {
                Log.d("when", "당신은 10대 입니다 ")
            }
            in 20..23 -> {
                Log.d("when ", " 당신은 20대 입니다")
            }
            in 30..39 -> {
                Log.d("when", "당신은 30대 입니다")
            }
            in 40..49 -> {
                Log.d("when", "당신은 40대 입니다")
            }
            in 50..59 -> {
                Log.d("when", "당신은 50대 입니다")
            }
            else ->  {
                Log.d("when", "당신의 나이를 알 수 없습니다")
            }
        }
    }
}