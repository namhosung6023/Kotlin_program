package com.example.test06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var parent = Parent()
        parent.sayHello()
        var child = Child()
        child.myHello()
    }

    open class Parent() {
        var hello: String = "안녕하세요"
        fun sayHello() {
            Log.d("Extension", "${hello}")
        }
    }
    class Child: Parent() {
        fun myHello() {
            hello = "Hello"
            sayHello()
        }
    }
}