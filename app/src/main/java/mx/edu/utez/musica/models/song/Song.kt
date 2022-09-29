package mx.edu.utez.musica.models.song

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "songs")
data class Song (
    @PrimaryKey(autoGenerate = true)
    var id:Int?,
    var title:String?,
    var artist:String?,
    var year:Int?
)