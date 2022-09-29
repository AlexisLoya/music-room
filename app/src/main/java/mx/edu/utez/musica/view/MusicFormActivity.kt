package mx.edu.utez.musica.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import mx.edu.utez.musica.databinding.ActivityMusicFormBinding
import mx.edu.utez.musica.viewmodel.MusicFormViewModel

class MusicFormActivity : AppCompatActivity() {
    lateinit var binding:ActivityMusicFormBinding
    lateinit var viewModel: MusicFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // view model
        viewModel = ViewModelProvider(this).get(MusicFormViewModel::class.java)

        binding.add.setOnClickListener {

            lifecycleScope.launch {
                viewModel.add(binding.title.text.toString(),
                    binding.artist.text.toString(),
                    binding.year.text.toString())
            }
            initObservers()

        }

    }
    fun initObservers(){
        viewModel.result.observe(this,{
            Toast.makeText(applicationContext,it.toString(), Toast.LENGTH_SHORT).show()
        })
        viewModel.error.observe(this,{
            Toast.makeText(applicationContext,it.toString(), Toast.LENGTH_SHORT).show()
        })
    }
}