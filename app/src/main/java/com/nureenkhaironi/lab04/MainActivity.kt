package com.nureenkhaironi.lab04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nureenkhaironi.lab04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout and set the content view
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Handle window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Listeners for the buttons
        binding.buttonPlus.setOnClickListener {
            val num1 = binding.Number1.text.toString().toDoubleOrNull()
            val num2 = binding.Number2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val sum = num1 + num2
                binding.resultTextView.text = "The sum of $num1 and $num2 is $sum"
            } else {
                binding.resultTextView.text = "Please enter valid numbers"
            }
        }

        binding.buttonMinus.setOnClickListener {
            val num1 = binding.Number1.text.toString().toDoubleOrNull()
            val num2 = binding.Number2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val minus = num1 - num2
                binding.resultTextView.text = "The difference of $num1 and $num2 is $minus"
            } else {
                binding.resultTextView.text = "Please enter valid numbers"
            }
        }

        binding.buttonProduct.setOnClickListener {
            val num1 = binding.Number1.text.toString().toDoubleOrNull()
            val num2 = binding.Number2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val product = num1 * num2
                binding.resultTextView.text = "The product of $num1 and $num2 is $product"
            } else {
                binding.resultTextView.text = "Please enter valid numbers"
            }
        }

        binding.buttonDivide.setOnClickListener {
            val num1 = binding.Number1.text.toString().toDoubleOrNull()
            val num2 = binding.Number2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val divide = num1 / num2
                    binding.resultTextView.text = "The division of $num1 by $num2 is $divide"
                } else {
                    binding.resultTextView.text = "Cannot divide by zero"
                }
            } else {
                binding.resultTextView.text = "Please enter valid numbers"
            }
        }
    }
}
