package com.corth.enjoymeal

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onClick(p0: View?) {
        val orderIntent = Intent(this, OrderActivity::class.java)
        startActivity(orderIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_title.text = getText(R.string.title)
        println( getGreeting("Hello", "Simon") )
        println( getGreeting2("Hello", "Simon") )
        sayGreeting("Hello", "Simon")
        sayGreeting2("Hello", "Simon")

        main_order.setOnClickListener(this);
    }

    fun add( a: Int, b: Int, c: Int, addOp: Boolean): Int {
        when (addOp) {
            true -> return a + b + c
            false -> return a - b - c
        }
    }

    // 宣告一個接收兩個字串參數，執行後回傳字串的函式
    fun getGreeting(greet: String, name: String): String {
        return greet + ", " + name + "!"
    }

    // 如果函式只有一個回傳的敘述，可以簡化成這樣
    fun getGreeting2(greet: String, name: String) =
            greet + ", " + name + "!"

    // 沒有回傳值的函式，把回傳值宣告為「Unit」
    fun sayGreeting(greet: String, name: String): Unit {
        println(greet + ", " + name + "!")
    }

    // 沒有回傳值的函式，也可以省略「:Unit」
    fun sayGreeting2(greet: String, name: String) {
        println(greet + ", " + name + "!")
    }

}
