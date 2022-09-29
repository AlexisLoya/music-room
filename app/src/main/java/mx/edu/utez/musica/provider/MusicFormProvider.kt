package mx.edu.utez.musica.provider

class MusicFormProvider {
    companion object{

        fun check(artist:String,title:String,year: Int):Boolean{
            return checkArtist(artist) && checkTitle(title) && checkYear(year)
        }
        fun checkArtist(artist:String):Boolean{
            return !artist.isNullOrEmpty()
        }
        fun checkTitle(title:String):Boolean{
            return !title.isNullOrEmpty()
        }
        fun checkYear(year:Int):Boolean{
            val range = 1..2022
            return (year in range)
        }
    }
}