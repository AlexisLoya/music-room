package mx.edu.utez.musica.models.song

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "songs")
data class Song (
    @PrimaryKey(autoGenerate = true)
    var id:Int?,
    var artist:String?,
    var gender:String?,
    var year:Int?
)