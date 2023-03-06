package com.example.lesson4_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson4_5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private var binding: ActivitySecondBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding!!.root)



    }
}