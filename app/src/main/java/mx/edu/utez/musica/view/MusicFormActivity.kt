package mx.edu.utez.musica.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.utez.musica.databinding.ActivityMusicFormBinding

class MusicFormActivity : AppCompatActivity() {
    lateinit var binding:ActivityMusicFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}