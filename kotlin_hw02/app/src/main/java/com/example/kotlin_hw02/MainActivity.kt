package com.example.kotlin_hw02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        // 1. 일반적인 반복문 사용으로 열 번 반복하기
        for (index in 1..10) {
            Log.d ("For", "현재 숫자는 ${index}")
        }
        // 2. 마지막 숫자 제외하기
        var array = arrayOf("JAN", "FEB", "MAR", "APR", "JUN")
        for (index in 0 until array.size) {
            Log.d("For", "현재 월은 ${array.get(index)}")
        }
        // 3. 건너뛰기
        for (index in 0..10 step 3) {
            Log.d("For", "건너뛰기: ${index}")
        }
        // 4. 감소시키기
        for (index in 10 downTo 0 ) {
            Log.d("For", " 감소시키기: ${index}")
        }
        //4.1 건너뛰면서 감소시키기
        for (index in 10 downTo 0 step 3) {
            Log.d("For", "건너뛰면서 감소시키기 : ${index}")
        }
        //5.1 배열, 컬렉션 사용하기
        for (month in array) {
            Log.d("For", "현재 월은 ${month}입니다")
        }
         */


        /*
        //일반적인 while 사용하기
        var current = 1
        val until = 12
        while ( current < until) {
            Log.d("while", "현재 값은 ${current}입니다")
            // current를 1씩 증가시켜서 열한 번 반복한 후 while 문을 빠져 나갑니다.
            current = current + 1
        }

        //2. do ~ while 사용하기
        var game = 1
        val match = 6
        do {
            Log.d ("while", "${game}게임 이겼습니다. 우승까지 ${match-game}게임 남았습니다. ")
            game += 1
        }while (game < match)
        // while vs do ~ while
        // while 테스트
        game = 6
        while (game < match ) {
            Log.d("while", "**** do while 테스트 입니다. ****")
            game += 1
        }
        //do ~ while 테스트
        game = 6
        do {
            Log.d("While", "**** do ~ while 테스트 입니다. ****")
            game += 1
        }while (game < match )
        //continue 다음 반복문으로
        for (except in 1..10) {
            //except가 3보다 크고 8보다 작으면 continue 명령으로 로그를 찍지 않고
            //for 문의 처음으로 jump 합니다
            if (except > 3 && except < 8) {
                continue
            }
            //따라서 4, 5, 6, 7은 출력되지 않습니다 .
            Log.d("while", "continue > 현재 index는 $except 입니다")
        }
        //무한루프 테스트
        var a = 1
        while (a == 1 ) {
            Log.d("while", "조건을 만족하면 여기를 출력하세요 ")
            break
        }
         */

        // 반환값이 있는 함수 square 사용하기
        var squareResult = square(30)
        Log.d("fun", "30의 제곱은 ${squareResult}입니다")

        // 반환값이 없는 함수는 그냥 실행한다.
        printSum(3, 5)
        // 입력값이 없는 함수 사용하기
        val PI = getPi()
        Log.d("fun", "지름이 10인 원의 둘레는 ${10 * PI}입니다")
        // 기본값이 있는 함수 사용하기
        newFunction("Hello")

        // 파라미터 이름을 직접 지정하기
        newFunction("Michael", weight = 67.5)
    }
        //반환값이 있는 함수
        fun square(x: Int):Int {
            return x * x // square함수는 입력받은 값에 2를 곱해서 반환한다.
        }
        //반환값이 없는 함수
        fun printSum(x :Int, y : Int) {
            Log.d("fun", "x + y = ${x +y}")
        }
        // 입력값 없이 반환값만 있는 함수
        fun getPi(): Double {
            return 3.14
        }

        // 기본갓을 갖는 함수
        fun newFunction(name: String, age: Int=29, weight: Double = 65.6) {
            Log.d("fun", "name의 값은 ${name}입니다")
            Log.d("fun", "age의 값은 ${age}입니다")
            Log.d("fun", "weight의 값은 ${weight}입니다")
        }

}