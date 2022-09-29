package mx.edu.utez.musica.models.song

import androidx.room.*

@Dao
interface SongDao {
    @Insert
    suspend fun insert(song:Song)

    @Query("SELECT * FROM songs")
    suspend fun getAll():List<Song>

    @Query("SELECT * FROM songs WHERE id = :id")
    suspend fun getById(id:Int):Song

    @Update
    suspend fun update(song: Song)

    @Delete
    suspend fun delete(song: Song)

}