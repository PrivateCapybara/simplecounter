package com.adilbekov.simplecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.app_title)
        findViewById<TextView>(R.id.counter).text=count.toString()
    }

    fun buttonPlus(view: View){
        count++
        findViewById<TextView>(R.id.counter).text=count.toString()
    }

    fun buttonMinus(view: View){
        count--
        findViewById<TextView>(R.id.counter).text=count.toString()
    }

    fun tapReset(view: View){
        count=0;
        findViewById<TextView>(R.id.counter).text=count.toString()
    }

    fun buttonRandom(view: View){
        count=Random().nextInt(1000);
        findViewById<TextView>(R.id.counter).text=count.toString()
    }
}
