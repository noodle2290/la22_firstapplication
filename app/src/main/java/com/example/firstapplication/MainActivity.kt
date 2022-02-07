package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var number = 0

        binding = ActivityMainBinding.inflate(layoutInflater).apply{setContentView(this.root)}

        binding.changeTextButton.setOnClickListener{
            if (number == 0) {
                binding.textView.text = "クリックされました"
                binding.textView.textSize = 10F
                number = 1
            }else{
                binding.textView.text = "またクリックされました"
                binding.textView.textSize = 20F
                number = 0
            }
        }


    }
}