package mx.edu.utez.musica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.utez.musica.databinding.ActivityMainBinding
import mx.edu.utez.musica.view.MusicFormActivity
import mx.edu.utez.musica.view.MusicGalleryActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.add.setOnClickListener {
            startActivity(Intent(this, MusicFormActivity::class.java))
        }
        binding.get.setOnClickListener {
            startActivity(Intent(this, MusicGalleryActivity::class.java))
        }
    }
}