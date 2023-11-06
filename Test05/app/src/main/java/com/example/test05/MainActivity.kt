package com.example.test05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Pig.name = "hosung"
        Pig.printName()
    }
    /*
    // 컴패니언 오브젝트를 사용하지 않은 경우
    object Pig {
        var name: String = "Pinky"
        fun printName() {
            Log.d("class", "Pig의 이름은 ${name}입니다")
        }
    }

     */



    //컴패니언 오브젝트를 사용한 경우
    class Pig {

        companion object {

            var name : String = "None"
            fun printName() {
                Log.d("class", "Pig의 이름은 ${name}")
            }
        }
    }

}