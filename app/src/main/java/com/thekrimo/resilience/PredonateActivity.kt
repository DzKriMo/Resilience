package com.thekrimo.resilience

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thekrimo.resilience.databinding.ActivityPredonateBinding

class PredonateActivity : AppCompatActivity () {
    private lateinit var binding: ActivityPredonateBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPredonateBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.donate.setOnClickListener(){
            val intent = Intent(this, AlgeriaActivity::class.java)
            startActivity(intent)

        }


        binding.back.setOnClickListener{
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)

        }


    }
}