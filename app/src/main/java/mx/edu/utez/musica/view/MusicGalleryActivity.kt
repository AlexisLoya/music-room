package mx.edu.utez.musica.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.utez.musica.R
import mx.edu.utez.musica.databinding.ActivityMusicGalleryBinding

class MusicGalleryActivity : AppCompatActivity() {
    lateinit var binding:ActivityMusicGalleryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}