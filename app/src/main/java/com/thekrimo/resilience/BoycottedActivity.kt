package com.thekrimo.resilience

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thekrimo.resilience.databinding.ActivityBarcodeBinding
import com.thekrimo.resilience.databinding.ActivityBoycottedBinding

class BoycottedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBoycottedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBoycottedBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}