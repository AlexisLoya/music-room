package mx.edu.utez.musica

import android.app.Application
import androidx.room.Room

class MusicApplication: Application() {
    companion object {
        lateinit var room: DB
    }

    override fun onCreate() {
        super.onCreate()
        room = Room.databaseBuilder(
            applicationContext,
            DB::class.java, "music_db"
        ).build()
    }
}