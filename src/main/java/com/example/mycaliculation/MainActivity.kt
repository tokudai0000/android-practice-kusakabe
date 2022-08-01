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
        var value: Int = 0;

        /*
        clear にするか否か

         */
        var clear : Boolean = false
        /*
        計算処理をおこなうか否ぁ
         */
        var calc : Boolean = false
        /*
        setup
         */
        var  SetupFlg : Boolean = true

        /*
        演算子の記録
         */
        var operator : String? = null





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
        /*
        演算子
         */
        //ドットのid反映
        val dott: Button = findViewById(R.id.dottButton)
        //%　のid反映
        val ratio: Button = findViewById(R.id.percentButton)
        //四則演算のid反映
        val equal: Button = findViewById(R.id.equalButton)
        val minus: Button = findViewById(R.id.minusButton)
        val plus: Button = findViewById(R.id.plusButton)
        val multi:Button = findViewById(R.id.multipleButton)
        val divi : Button = findViewById(R.id.divideButton)

        //クリアーボタンのid反映
        val cButton: Button = findViewById(R.id.clearButton)
        //表示
        val display: TextView = findViewById(R.id.calResult)

        /*
        数字を押されたときの関数
         */
        fun numBottunAction(num:String){
            SetupFlg = false
            if(display.text == "HelloFriend"){
                display.text = "0"
            }

            if( display.text.toString() != "0" && !clear){
                display.text = display.text.toString() + num //文字列に追加
            } else {
                clear = false
                display.text = num
            }
            calc = true//演算子を押してもよい
            //value = display.text.toString().toInt()
        }

        cButton.setOnClickListener{
            display.text = "0"
            value = 0
            operator = null
            clear = false
            calc = false
            SetupFlg = true
        }

        zero.setOnClickListener{
            numBottunAction("0")
        }
        one.setOnClickListener{
            numBottunAction("1")
        }
        two.setOnClickListener{
            numBottunAction("2")
        }
        three.setOnClickListener{
            numBottunAction("3")
        }
        four.setOnClickListener{
            numBottunAction("4")
        }
        five.setOnClickListener{
            numBottunAction("5")
        }
        six.setOnClickListener{
            numBottunAction("6")
        }
        seven.setOnClickListener{
            numBottunAction("7")
        }
        eight.setOnClickListener{
            numBottunAction("8")
        }
        nine.setOnClickListener{
            numBottunAction("9")
        }

        /*
        演算処理
            value：演算子の前の値
            display.text.toString().toInt()：画面に表示されている値
            return = value - display //
         */
        fun calculation(op : String?):Int{
            var num :Int = 0
            //if(!SetupFlg) {
                when (op) {
                    "+" -> {
                        num = value + display.text.toString().toInt()
                    }
                    "-" -> {
                        num = value - display.text.toString().toInt()
                    }
                    "X" -> {//this X is Large X from Alphabet
                        num = value * display.text.toString().toInt()
                    }
                    "/" -> {
                        num = value / display.text.toString().toInt()
                    }
                    else -> {
                        num = display.text.toString().toInt()
                    }
                }
            //}
            //operator = null
            display.text = "0"
            //value = num
            return num
        }

        /*
        演算子が押されたとき
         */
        fun pushedOperator(op : String?){
            operator = op
            /*
            計算処理
                数字がdisplayにないときを除く
             */
            if(calc){
                value = calculation(operator)
                clear = true
                calc = false
                display.text = value.toString()

            }

        }

        plus.setOnClickListener{
            pushedOperator("+")
        }
        minus.setOnClickListener {
            pushedOperator("-")
        }
        multi.setOnClickListener {
            pushedOperator("X")
        }
        divi.setOnClickListener {
            pushedOperator("/")
        }

        equal.setOnClickListener {
            if(calc){
                value = calculation(operator)
                clear = false
                calc = true
                display.text = value.toString()
                operator = null
            }

        }







    }
}