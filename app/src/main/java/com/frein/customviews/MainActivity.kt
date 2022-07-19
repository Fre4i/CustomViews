package com.frein.customviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frein.customviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        with(binding.bottomButtons) {
            negativeButton.text = "Cancel"
            negativeButton.text = "OK"
        }
    }
}