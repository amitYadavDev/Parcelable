package amitapps.media.parcelable

import amitapps.media.parcelable.databinding.ActivityMain2Binding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

class MainActivity2 : AppCompatActivity() {
    private var _binding: ActivityMain2Binding? = null
    val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        binding?.textView?.text = intent.getParcelableExtra<DataParcelable>("data").toString()
    }
}