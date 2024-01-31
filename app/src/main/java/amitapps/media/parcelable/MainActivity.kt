package amitapps.media.parcelable

import amitapps.media.parcelable.R.id.btn
import amitapps.media.parcelable.databinding.ActivityMainBinding
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("data", DataParcelable("Amit", 24))
            startActivity(intent)
        }
    }
}