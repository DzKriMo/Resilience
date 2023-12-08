package com.thekrimo.resilience

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thekrimo.resilience.databinding.ActivitySelectBinding

class SelectActivity : AppCompatActivity (){

    private lateinit var binding: ActivitySelectBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySelectBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.pray.setOnClickListener(){
            val intent = Intent(this , PrayActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.donate.setOnClickListener(){
            val intent = Intent(this, PredonateActivity::class.java)
            startActivity(intent)
            finish()
        }


        binding.back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.boycott.setOnClickListener{
            val intent = Intent(this , BarcodeActivity::class.java)
            startActivity(intent)
            finish()
        }









    }

}