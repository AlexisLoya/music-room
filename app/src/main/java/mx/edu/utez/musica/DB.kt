package mx.edu.utez.musica

import androidx.room.Database
import androidx.room.RoomDatabase
import mx.edu.utez.musica.models.song.Song
import mx.edu.utez.musica.models.song.SongDao

@Database(
    entities = [Song::class],
    version = 1,
)
abstract class DB:RoomDatabase() {
    abstract fun getSongDao(): SongDao
}