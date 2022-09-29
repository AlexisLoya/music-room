package mx.edu.utez.musica.models.song

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import mx.edu.utez.musica.databinding.SongItemBinding


class SongAdapter (private val events: SongAdapter.Events,context: Context): ListAdapter<Song, SongAdapter.ViewHolder>(DiffUtilCallback) {
    interface Events{
        fun onItemClick(element: Song, position: Int)
    }

    val ctx = context

    inner class ViewHolder(private val binding:SongItemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(element:Song, position:Int) = with(binding){

            binding.title.text = element.title
            binding.artist.text = element.artist
            binding.year.text = element.year.toString()


            binding.root.setOnClickListener{
                this@SongAdapter.events.onItemClick(element,position)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var item = SongItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position),position)
    }

    private object DiffUtilCallback: DiffUtil.ItemCallback<Song>() {
        override fun areItemsTheSame(oldItem: Song, newItem: Song): Boolean {
            return  oldItem.title == newItem.title && oldItem.artist == newItem.title
        }

        override fun areContentsTheSame(oldItem: Song, newItem: Song): Boolean {
            return  newItem == oldItem
        }

    }


}