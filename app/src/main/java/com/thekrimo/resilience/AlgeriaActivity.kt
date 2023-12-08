package com.thekrimo.resilience

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.thekrimo.resilience.databinding.ActivityAlgeriaBinding

class AlgeriaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlgeriaBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAlgeriaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

binding.back.setOnClickListener{
    val intent = Intent(this, SelectActivity::class.java)
    startActivity(intent)
    finish()
}





        //function to open the location of the associations on google maps
        fun map1 (link: String){
            val gmmIntentUri = Uri.parse(link)
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)

            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            } else {
                Toast.makeText(baseContext, "Google Maps is not available on this device.",
                    Toast.LENGTH_SHORT).show()
            }
        }




        val maplinkbaraka = "https://maps.app.goo.gl/r8THTB3meG1zX9W67"
        binding.loc1.setOnClickListener { map1(maplinkbaraka) }
        binding.locc1.setOnClickListener {map1(maplinkbaraka)}





        //function to put the phone number of the association on dial
        fun phone1 (num: String){

            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:$num")

            if (dialIntent.resolveActivity(packageManager) != null) {
                startActivity(dialIntent)
            }
        }


        val num = binding.phone11.text.toString()
        binding.phone1.setOnClickListener { phone1(num) }

        binding.phone11.setOnClickListener { phone1(num) }


        val num2= binding.phone22.text.toString()
        binding.phone2.setOnClickListener{ phone1(num2) }
        binding.phone22.setOnClickListener{ phone1(num2) }

        val maplinkmus = "https://maps.app.goo.gl/DTgmHdyodEhsXTnE8"
        binding.loc2.setOnClickListener{map1(maplinkmus)}
        binding.locc2.setOnClickListener{map1(maplinkmus)}




    }
}