package com.example.kotlin_hw01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 변수 연습 하기
        /* var myName = "홍길동"
        var myAge: Int
        myAge = 27
        myAge = myAge + 1
        Log.d("BasicSyntax", "myName = $myName, myAge = $myAge")*/

        //if ~ else 문 연습하기
        /*var ball = 4
        if (ball > 3) {          //ball이 3보다 크면 여기 블록의 코드가 실행된다.
            Log.d ( "ControlFlow", "4볼로 출루 합니다 ")
        } else {                 // 그렇지 않으면 else 다음에 있는 블록의 코드가 실행된다.
            Log.d ( "ControlFlow", "타석에서 다음 타구를 기다립니다")
        } */

        // 03. 다중 if 문과 else if 문 비교하기
        /*var a = 1
        var b = 2
        var c = 3

        // if 문 두번 사용하기
        if  ( a < b ) {
            Log.d ( "ControFlow", " 1 : a는 b보다 작습니다")
        }
        if ( a < c ) {
            Log.d ( "ControFlow ", " 1 : a는 c보다 작습니다 ")
        }

        //else if 문 사용 하기
        if (a < b ) {
            Log.d ( " ControlFlow ", " 2: a는 b 보다 작습니다. ")
        }else if ( a < c) {
            Log.d ("ControlFlow ", " 2: a는 c보다 작습니다")
        }*/

        // 04. if문의 마지막 값을 반한값으로 사용하기
        /*var a = 5
        var b = 3
        var bigger = if ( a > b ) {
            var c = 30
            a  // 마지막 줄의 a 값이 변수 bigger에 저장된다.
        } else {
            b
        }*/

        //05. 변수에 직접 if문 사용해보기
        /*var eraOfRyu = 2.23
        var eraOfDegron = 2.43

        val era = if (eraOfRyu < eraOfDegron) {
            Log.d("MLB_Result", "2019 류현진이 디그롬을 이겼습니다. ")
            eraOfRyu
        }else {
            Log.d ( "MLB_Result", "2019 디그롬이 류현진을 이겼습니다")
            eraOfDegron
        }

        Log.d("MLB_Result", "2019에서 가장 높은 ERA는 ${era} 입니다. ") */

        // 06. 일반적인 방법으로 when 사용 하기
        /*var now = 10
        when (now) {
            8 -> {
                Log.d("when", "현재 사간은 8시 입니다. ")
            }
            9-> {
                Log.d ("when ", "현재 시간은 9시 입니다. ")
            }
            else -> {
                Log.d ("when", "현재 시간은 9시가 아닙니다")
            }
        } */

        //실습 07. 콤마로 구분해서 when 사용하기
        /*var now = 9
        when (now) {
            8,9 -> {
                Log.d ("when", "현재 시간은 8시 또는 9시 입니다. ")
            }
            else -> {
                Log.d ("when", " 현재 시간은 9시가 아닙니다. ")
            }
        } */

        //실습 08. in 으로 범위 값 비교 하기
        /* var ageOfMichael = 19
        when (ageOfMichael ) {
            in 10..19 -> {
                Log.d ( "when", "마이클은 10대 입니다. ")
            }
            !in 10..19 -> {
                Log.d("when", "마이클은 10대가 아닙니다")
            }
            else -> {
                Log.d ("when", "마이클의 나이를 알 수 없습니다" )
            }
        } */

        //실습 09. 파라미터 없이 if문 사용 하기
        /*var currentTime = 6
        when {
            currentTime == 5 -> {
                Log.d ("when", "현재 시간은 5시 입니다.")
            }
            currentTime > 5 -> {
                Log.d ( " when ", " 현재 시간은 5 시가 넘었습니다. ")
            }
            else -> {
                Log.d ("when", " 현재 시간은 5시 이전 입니다. ")
            }
        } */

        // 실습 10. 배열 사용 하기
        // 1. 기본 타입 배열 선언하기 - 각 기본 타입별로 10 개의 빈 공간이 할당된다.
        /* var student = IntArray(10)
        var longArray = LongArray(10)
        var CharArray = CharArray(10)
        var FloatArray = FloatArray(10)
        var DoubleArray = DoubleArray(10)

        //arrayOf를 사용하면 선언과 동시에 값을 입력할 수 있다.
        var intArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
        //intarray 변수에는 1부터 10까지의 각각의 배열 공간이 저장되어 있다.

        //문자열 타입 배열 선언하기
        var stringArray = Array(10, {item->""})
        // arrayOf 함수로 값을 직접 입력해서 배열을 생성할 수 있다.
        var dayArray = arrayOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

        //앞에서 선언한 students 변수에 값 넣기
        // 대괄호 사용하는 방법
        student[0] = 90
        student[1] = 91
        student[2] = 92
        student[3] = 93
        student[4] = 94
        // set함수를 사용하는 방법
        student.set(5, 95)
        student.set(6, 96)
        student.set(7, 97)
        student.set(8, 98)
        student.set(9, 99)

        //값 변경해 보기
        intArray[6] = 137 // 6번 인덱스만 값 7이 137로 변경된다.
        intArray.set(9, 200) // 9번 인덱스만 열번쨰 값 99가 200으로 변경된다.

        // 배열 값 사용하기
        var seventhValue = intArray[6]
        Log.d( "Array" , "여덟번쨰 intArray의 값은 ${seventhValue} 입니다 ")
        var tenthValue = intArray.get(9)
        Log.d("Array", "열번쨰 intArray 값은 ${tenthValue}")
        // 변수에 담지 않고 직접 사용해도 된다.
        Log.d ("Array", "첫번째 dayarray의 값은 ${dayArray[0]}입니다. ")
        Log.d("Array", "여섯 번쨰 dayArray의 값은 ${dayArray.get(5)}입니다") */

        // 실습 11. 리스트 다루기
        // 값으로 컬렉션 생성 하기
        /* var mutableList = mutableListOf("MOM", "TUE", "WED")
        //값을 추가 한다.rkqt
        mutableList.add("THU")
        //값을 꺼낸다
        Log.d("Collection", "mutableList의 첫 번쨰 값은 ${mutableList.get(0)}입니다")
        Log.d("collection", "mutableList의 두 번째 값은 ${mutableList.get(1)}입니다")

        //빈 컬렉션 생성하기
        var StringList = mutableListOf<String>()
        //값을 추가 한다.
        StringList.add ("월")
        StringList.add ("화")
        StringList.add ("수")
        //값을 변경한다.
        StringList.set(1, "요일 변경 ")
        //사용
        Log.d("Collection", "StringList에 입력된 두 번째 값은 ${StringList.get(1)}입니다")
        //삭제
        StringList.removeAt(1)
        Log.d("Collection", "StringList에 입력된 두 번쨰 값은 ${StringList.get(1)}입니다")
        //갯수를 출력 합니다
        Log.d ("Collection ", "StringList에는 ${StringList.size}개의 값이 있습니다") */

        // 실습 12. 셋 다루기
        /* var set = mutableSetOf<String>()
        set.add("JAN")
        set.add("FEB")
        set.add("MAR")
        set.add("JAN")

        //전체 데이터 출력해보기
        Log.d("Collection", " Set 전체 출력 = ${set}")

        //특정 값 삭제하기
        set.remove("FEB")
        Log.d("Collection", "Set 전체 출력 = ${set}") */

        // 실습 13. 맴 다루기
        var map = mutableMapOf<String, String>()

        //값 넣기
        map.put("키1", "값2")
        map.put("키2", "값2")
        map.put("키3", "값3")

        //값 사용하기
        var variable = map.get("키2")
        Log.d("Collection", "키2의 값은 ${variable}")

        //값 수정하기
        map.put("키2", "두번쨰 값 수정")
        Log.d ("Collection", "키2의 값은 ${map.get("키2")}입니다")

        //값 삭제하기
        map.remove("키2")
        //없는 값을 불러오면 null 값이 출력된다.
        Log.d("Collection", "키2의 값은 ${map.get("키2")}입니다")
    }
}

