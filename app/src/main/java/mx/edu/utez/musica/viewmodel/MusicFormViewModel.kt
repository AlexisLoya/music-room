package mx.edu.utez.musica.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mx.edu.utez.musica.MusicApplication
import mx.edu.utez.musica.models.song.Song
import mx.edu.utez.musica.provider.MusicFormProvider

class MusicFormViewModel:ViewModel() {
    var result:MutableLiveData<String> = MutableLiveData()
    var error:MutableLiveData<String> = MutableLiveData()

    suspend fun add(artist:String, title:String, year: String){
        if(MusicFormProvider.check(artist,title,year)){
            MusicApplication.room.getSongDao().insert(
                Song(
                    null,
                    title,
                    artist,
                    Integer.parseInt(year)
                )
            )
            result.postValue("Song Added")
        }else{
            error.postValue("Try to completed the form first")
        }
    }

}