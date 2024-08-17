package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding
    var number : String? = null

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

    }

    fun onNumberCLicked(clickedNumber : String) {

        if (number == null) {
            number = clickedNumber
        } else {
            number += clickedNumber
        }

        mainBinding.textViewResult.text = number

    }
}