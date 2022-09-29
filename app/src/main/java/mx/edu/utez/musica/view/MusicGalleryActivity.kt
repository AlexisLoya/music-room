package mx.edu.utez.musica.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.launch
import mx.edu.utez.musica.MusicApplication.Companion.room
import mx.edu.utez.musica.R
import mx.edu.utez.musica.databinding.ActivityMusicGalleryBinding
import mx.edu.utez.musica.models.song.Song
import mx.edu.utez.musica.models.song.SongAdapter

class MusicGalleryActivity : AppCompatActivity(), SongAdapter.Events {
    lateinit var binding:ActivityMusicGalleryBinding
    lateinit var adapter :SongAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            if(checkSize())setData()


        }

    }
    suspend fun checkSize():Boolean{
        var empty = false
        empty = room.getSongDao().getAll().size > 0
        return empty
    }
    suspend fun setData(){
        binding.items.layoutManager = LinearLayoutManager(this)
        // define adapter
        adapter = SongAdapter(this,this)
        //
        binding.items.adapter = adapter
        adapter.submitList(room.getSongDao().getAll())
        adapter.notifyDataSetChanged()
        Toast.makeText(applicationContext,room.getSongDao().getAll().size.toString(),Toast.LENGTH_SHORT).show()
    }

    override fun onItemClick(element: Song, position: Int) {
        Toast.makeText(this,element.title, Toast.LENGTH_LONG).show()
    }
}