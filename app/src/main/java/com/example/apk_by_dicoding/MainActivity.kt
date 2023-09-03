package com.example.apk_by_dicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.apk_by_dicoding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   /* private lateinit var edtWidth: EditText
    private lateinit var edtHeight: EditText
    private lateinit var edtLength: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView*/


   /* private  fun InitComponents(){
        edtWidth = findViewById(R.id.edt_width)
        edtHeight = findViewById(R.id.edt_height)
        edtLength = findViewById(R.id.edt_length)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)
    }*/

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener(this)
       // InitComponents()

        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT)
            binding.tvResult.text = result
        }
/*
        btnCalculate.setOnClickListener {
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()
            var IsEmptyFields = false
            if (inputLength.isEmpty()){
                IsEmptyFields = true
                edtLength.error = "please fill this length"
            }
            if (inputWidth.isEmpty()){
                IsEmptyFields = true
                edtWidth.error = "please fill this Width"
            }
            if (inputHeight.isEmpty()){
                IsEmptyFields = true
                edtHeight.error = "please fill this heigh"
            }
            if(!IsEmptyFields) {
                val volume = inputLength.toDouble() * inputWidth.toDouble() * inputHeight.toDouble()
                tvResult.text = volume.toString()
            }
        }*/
    }

    private fun setContentView(root: Any) {
        TODO("Not yet implemented")
    }
}

private fun Button.setOnClickListener(mainActivity: MainActivity) {

}

