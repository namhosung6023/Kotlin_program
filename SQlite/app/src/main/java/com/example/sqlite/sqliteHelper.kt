package com.example.sqlite

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SqliteHelper(context: Context, name: String, version: Int) :
    SQLiteOpenHelper(context, name, null, version) {

    override fun onCreate(db: SQLiteDatabase?) {
        val create = "create table memo (" +
                "no integer primary key, " +
                "content text, " +
                "datetime integer" +
                ")"
        db?.execSQL(create)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun insertMemo(memo:Memo) {
        val values = ContentValues()
        values.put("content", memo.content)
        values.put("datetime", memo.datetime)

        //p.499   02
        val wd = writableDatabase
        wd.insert("memo", null, values)
        wd.close()
    }

    fun selectMemo(): MutableList<Memo> {
        val list = mutableListOf<Memo>()

        //p.500   02 부터 08 까지 여기다가 입력
        val select = "select * from memo"

        //p.500   03
        val rd = readableDatabase

        //p.500   04
        val cursor = rd.rawQuery(select, null)

        //p.501   05
        while (cursor.moveToNext()) {
            // 먼저 컬럼의 이름으로 각각의 위치를 가져온다.
            ////p.501   06, 07 여기다가 입력
            val noIdx = cursor.getColumnIndex("no") // 1 : 테이블에서 no 컬럼의 순서
            val contentIdx = cursor.getColumnIndex("content") // 2
            val dateIdx = cursor.getColumnIndex("datetime") // 3

            val no = cursor.getLong(noIdx) // 값은 위에서 저장해 둔 컬럼의 위치로 가져온다
            val content = cursor.getString(contentIdx)
            val datetime = cursor.getLong(dateIdx)

            //p.502   07
            list.add(Memo(no, content, datetime))
        }

        //p.502   08
        cursor.close()
        rd.close()

        return list   ////p.500 의 01에 있던 문장 누락안되게 주의
    }

    fun updateMemo(memo:Memo) {
        val values = ContentValues()
        values.put("content", memo.content)
        values.put("datetime", memo.datetime)

        //p.503    02 여기다가 입력
        val wd = writableDatabase
        wd.update("memo", values, "no = ${memo.no}", null)
        wd.close()
    }

    fun deleteMemo(memo:Memo) {
        val delete = "delete from memo where no = ${memo.no}"

        //p.504    02 여기다가 입력
        val db = writableDatabase
        db.execSQL(delete)
        db.close()
    }
}

data class Memo(var no:Long?, var content:String, var datetime:Long)