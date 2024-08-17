package com.example.calculator

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding
    var number : String? = null

    var firstNumber : Double = 0.0
    var lastNumber : Double = 0.0

    var status : String? = null
    var operator : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.textViewResult.text = "0"

        mainBinding.btnZero.setOnClickListener {
            onNumberCLicked("0")
        }
        mainBinding.btnOne.setOnClickListener {
            onNumberCLicked("1")
        }
        mainBinding.btnTwo.setOnClickListener {
            onNumberCLicked("2")
        }
        mainBinding.btnThree.setOnClickListener {
            onNumberCLicked("3")
        }
        mainBinding.btnFour.setOnClickListener {
            onNumberCLicked("4")
        }
        mainBinding.btnFive.setOnClickListener {
            onNumberCLicked("5")
        }
        mainBinding.btnSix.setOnClickListener {
            onNumberCLicked("6")
        }
        mainBinding.btnSeven.setOnClickListener {
            onNumberCLicked("7")
        }
        mainBinding.btnEight.setOnClickListener {
            onNumberCLicked("8")
        }
        mainBinding.btnNine.setOnClickListener {
            onNumberCLicked("9")
        }

        mainBinding.btnAC.setOnClickListener {

        }
        mainBinding.btnDel.setOnClickListener {

        }
        mainBinding.btnDivide.setOnClickListener {

            if (operator) {
                when (status) {

                    "multiplication" -> multiply()
                    "division" -> divide()
                    "subtraction" -> minus()
                    "addition" -> plus()
                    else -> firstNumber = mainBinding.textViewResult.text.toString().toDouble()

                }
            }

            status = "division"
            operator = false
            number = null

        }
        mainBinding.btnMulti.setOnClickListener {

            if (operator) {
                when (status) {

                    "multiplication" -> multiply()
                    "division" -> divide()
                    "subtraction" -> minus()
                    "addition" -> plus()
                    else -> firstNumber = mainBinding.textViewResult.text.toString().toDouble()

                }
            }

            status = "multiplication"
            operator = false
            number = null

        }
        mainBinding.btnMinus.setOnClickListener {

            if (operator) {
                when (status) {

                    "multiplication" -> multiply()
                    "division" -> divide()
                    "subtraction" -> minus()
                    "addition" -> plus()
                    else -> firstNumber = mainBinding.textViewResult.text.toString().toDouble()

                }
            }

            status = "subtraction"
            operator = false
            number = null

        }
        mainBinding.btnPlus.setOnClickListener {

            if (operator) {
                when (status) {

                    "multiplication" -> multiply()
                    "division" -> divide()
                    "subtraction" -> minus()
                    "addition" -> plus()
                    else -> firstNumber = mainBinding.textViewResult.text.toString().toDouble()

                }
            }

            status = "addition"
            operator = false
            number = null

        }
        mainBinding.btnEquals.setOnClickListener {

        }
        mainBinding.btnDot.setOnClickListener {

        }

    }

    fun onNumberCLicked(clickedNumber : String) {

        if (number == null) {
            number = clickedNumber
        } else {
            number += clickedNumber
        }

        mainBinding.textViewResult.text = number

        operator = true

    }

    fun plus() {

        lastNumber = mainBinding.textViewResult.text.toString().toDouble()
        firstNumber += lastNumber
        mainBinding.textViewResult.text = firstNumber.toString()

    }

    fun minus() {

        lastNumber = mainBinding.textViewResult.text.toString().toDouble()
        firstNumber -= lastNumber
        mainBinding.textViewResult.text = firstNumber.toString()

    }

    fun multiply() {

        lastNumber = mainBinding.textViewResult.text.toString().toDouble()
        firstNumber *= lastNumber
        mainBinding.textViewResult.text = firstNumber.toString()

    }

    fun divide() {

        lastNumber = mainBinding.textViewResult.text.toString().toDouble()

        if (lastNumber == 0.0) {
            Toast.makeText(applicationContext, "The divisor cannot be zero", Toast.LENGTH_LONG).show()
        } else {
            firstNumber /= lastNumber
            mainBinding.textViewResult.text = firstNumber.toString()
        }

    }

}