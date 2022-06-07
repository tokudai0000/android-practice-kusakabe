package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {//画面の初期設定するところ
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//ここでactivity_main.xmlに接続している

        var buttonCheck = 0
        val buttonTest = findViewById<Button>(R.id.button_test)
        val textView   = findViewById<TextView>(R.id.textView)
        buttonTest.setOnClickListener {
            if(buttonCheck == 0) {
                textView.text = "こんにちは"
                buttonCheck += 1
            } else {
                textView.text = "Hello World"
                buttonCheck = 0
            }
        }
    }
}