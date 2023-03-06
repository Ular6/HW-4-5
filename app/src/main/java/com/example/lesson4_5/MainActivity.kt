package com.example.lesson4_5

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson4_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: ActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClick()
        changeTest()
        navigate()
    }

    private fun onClick() = with(binding) {
        binding.btnRequest.setOnClickListener {
            viewModel.makeRequest(firstName.text.toString(), secondName.text.toString())
                .observe(this@MainActivity) {
                    tvResult.text = it.percentage
                }
        }
    }
    private fun navigate() {
        binding.btnNavigate.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    private fun changeTest() {
        binding.btnSaveData.setOnClickListener {
            viewModel.setTest("test2")
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.getTest()
        Log.d("TAG", "onResume: ${viewModel.getTest()}")
    }
}
