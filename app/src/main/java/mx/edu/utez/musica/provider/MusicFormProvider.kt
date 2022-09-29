package mx.edu.utez.musica.provider

class MusicFormProvider {
    companion object{

        fun check(artist:String,title:String,year: String):Boolean{
            return checkArtist(artist) && checkTitle(title) && checkYear(year)
        }
        fun checkArtist(artist:String):Boolean{
            return !artist.isNullOrEmpty()
        }
        fun checkTitle(title:String):Boolean{
            return !title.isNullOrEmpty()
        }
        fun checkYear(year:String):Boolean{
            try {
                val range = 1..2022
                return (Integer.parseInt(year) in range)
            }catch (e:NumberFormatException){
                return false
            }

        }
    }
}