package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button = findViewById(R.id.btnClick)
        var flagName : String = "Cat"
        var flagFood : String = "Sea Food"
        val spinnerName : Spinner = findViewById(R.id.SpinName)
        val spinnerFood : Spinner = findViewById(R.id.SpinFood)
        val optionsName = arrayOf("Cat","Dog")
        val optionsFood = arrayOf("Sea Food","Meat")
        spinnerName.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionsName)
        spinnerFood.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionsFood)
        button.setOnClickListener{
            val Result : TextView = findViewById(R.id.txtResult)
            if((flagName == "Cat" && flagFood == "Sea Food") || (flagName == "Dog" && flagFood == "Meat") ){
                Result.text = "True"
            }else{
                Result.text = "False"
            }
            spinnerName.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                   flagName =optionsName.get(p2)
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
            spinnerFood.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    flagFood = optionsFood.get(p2)
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }
    }
}