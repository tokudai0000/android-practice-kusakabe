package com.example.mycaliculation

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //計算結果の一次的な保管場所
        var calNum: Int = 0;

        // 演算子が押されてない間、値を足す
        @RequiresApi(Build.VERSION_CODES.R)
        fun numButtonPushed(String : num){
        display.toString().toInt()

    }



        /*
    数字のid　反映
     */
        val zero: Button = findViewById(R.id.zeroButton)//.setOnClickListener(this)
        val one: Button = findViewById(R.id.oneButton)//.setOnClickListener(this)
        val two: Button = findViewById(R.id.twoButton)//.setOnClickListener(this)
        val three: Button = findViewById(R.id.threeButton)//.setOnClickListener(this)
        val four: Button = findViewById(R.id.fourButton)//.setOnClickListener(this)
        val five: Button = findViewById(R.id.fiveButton)//.setOnClickListener(this)
        val six: Button = findViewById(R.id.sixButton)//.setOnClickListener(this)
        val seven: Button = findViewById(R.id.sevenButton)//.setOnClickListener(this)
        val eight: Button = findViewById(R.id.eightButton)//.setOnClickListener(this)
        val nine: Button = findViewById(R.id.nineButton)//.setOnClickListener(this)

        zero.setOnClickListener{
            //display = "0"
        }
        one.setOnClickListener{

        }
        two.setOnClickListener{

        }
        three.setOnClickListener{

        }
        four.setOnClickListener{

        }
        five.setOnClickListener{

        }
        six.setOnClickListener{

        }
        seven.setOnClickListener{

        }
        eight.setOnClickListener{

        }
        nine.setOnClickListener{

        }


        //ドットのid反映
        val dott: Button = findViewById(R.id.dottButton)
        //%　のid反映
        val ratio: Button = findViewById(R.id.percentButton)

        //四則演算のid反映
        val equal: Button = findViewById(R.id.equalButton)
        val multi: Button = findViewById(R.id.multipleButton)
        val minus: Button = findViewById(R.id.minusButton)
        val plus: Button = findViewById(R.id.plusButton)
        //クリアーボタンのid反映
        val cButton: Button = findViewById(R.id.clearButton)
        //表示
        val display: TextView = findViewById(R.id.calResult)


    }
}