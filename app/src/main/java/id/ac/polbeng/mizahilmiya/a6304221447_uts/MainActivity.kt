package id.ac.polbeng.mizahilmiya.a6304221447_uts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.mizahilmiya.a6304221447_uts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculateBlock.setOnClickListener {
            calculateBlock()
        }
    }

    private fun calculateBlock() {
        val length = binding.edtLength.text.toString().toDoubleOrNull()
        val width = binding.edtWidth.text.toString().toDoubleOrNull()
        val height = binding.edtHeight.text.toString().toDoubleOrNull()

        if (length != null && width != null && height != null) {
            val volume = length * width * height
            val surfaceArea = 2 * (length * width + length * height + width * height)

            val result = "Volume Balok: $volume cm³\nLuas Permukaan Balok: $surfaceArea cm²"
            navigateToResult(result)
        } else {
            binding.txtResult.text = "Masukkan Panjang, Lebar, dan Tinggi yang Valid"
        }
    }

    private fun navigateToResult(result: String) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("result", result)
        startActivity(intent)
    }
}
