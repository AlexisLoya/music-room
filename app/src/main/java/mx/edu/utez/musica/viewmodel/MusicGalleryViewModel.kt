package mx.edu.utez.musica.viewmodel

import androidx.lifecycle.MutableLiveData

class MusicGalleryViewModel {
    var result: MutableLiveData<String> = MutableLiveData()
    var error: MutableLiveData<String> = MutableLiveData()
}