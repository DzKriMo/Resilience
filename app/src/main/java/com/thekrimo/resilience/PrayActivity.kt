package com.thekrimo.resilience

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thekrimo.resilience.databinding.ActivityPrayBinding

class PrayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPrayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPrayBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.back.setOnClickListener{
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)

        }


    val p1 = listOf("اللهم انصر ضعفهم وَرُد إلينا المسجد الأقصى ردًا جميلًا.","اللهم احفظهم بحفظك وانصرهم واخذل كل من خذلهم.",
        "اللَّهُمَّ نجِّ المُسْتَضْعَفِينَ مِنَ المُؤْمِنِينَ و المؤمنات.","اللهم احرس أهل فلسطين بعينك التي لا تنام."
    ,"اللهُم كُن لأهل فلسطين عونًا ونصيرًا، وبدّل خوفهم أمنًا.","اللهم اجعل لأهل فلسطين النصرة والعزة والغلبة والقوة والهيبة."
    ,"اللهم انصر أهل فلسطين وثبت أقدامهم.","اللهم حرر المسجد الأقصى، واجبر كسرهم، واشف مرضاهم، وتقبل شهدائهم برحمتك."
    )

    val p2 =listOf("allahuma ansar daefahum warud 'iilayna almasjid al'aqsaa rdan jmylan.",
        "allahuma ahfazhum bihifzik wansarhim wakhadhul kulun man khadhalahum.",
        "alllahumm njj almustadeafin min almuminin w almuminati.",
        "allahuma ahrus 'ahl filastin bieaynik alati la tanamu.",
        "allhum kun li'ahl filastin ewnan wnsyran, wbddl khawfihim amnan.",
        "allahuma ajeal li'ahl filastin alnusrat waleizat walghalbat walquat walhaybata.",
        "allahuma ansar 'ahl falastin wathabit 'aqdamahum.",
        "allahuma harar almasjid al'aqsaa, wajbir kasrahum, washif mardahum, wataqbal shuhadayahum birahmatika.")


    val p3 = listOf("Oh God, help their weakness and return Al-Aqsa Mosque to us in a beautiful way.",
        "Oh God, protect them with your protection, grant them victory, and let down everyone who let them down",
        "Oh God, save the oppressed among the believing men and women.", "Oh God, protect the people of Palestine with your eyes that never sleep",
        "Oh God, be a helper and supporter for the people of Palestine, and replace their fear with security.",
        "Oh God, grant the people of Palestine victory, glory, victory, strength and prestige",
        "Oh God, grant victory to the people of Palestine and make their feet firm.","Oh God, liberate Al-Aqsa Mosque, mend their wounds, heal their patients, and accept their martyrs with your mercy.")





    var i = 0

    binding.generate.setOnClickListener(){
        binding.p1.text = p1[i]
        binding.p2.text = p2[i]
        binding.p3.text = p3[i]
        if (i==(p1.size -1)) i =0
        else i++

    }












    }


}
