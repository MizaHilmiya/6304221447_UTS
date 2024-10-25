package id.ac.polbeng.mizahilmiya.a6304221447_uts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.mizahilmiya.a6304221447_uts.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getStringExtra("result")
        binding.txtResult.text = result
    }
}
