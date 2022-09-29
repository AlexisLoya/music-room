package mx.edu.utez.musica.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicFormViewModel:ViewModel() {
    var result:MutableLiveData<String> = MutableLiveData()
    var error:MutableLiveData<String> = MutableLiveData()

}