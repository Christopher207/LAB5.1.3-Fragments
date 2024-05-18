package com.example.lab513_fragments.ui.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab513_fragments.R
import com.example.lab513_fragments.ui.model.SongModel
import org.w3c.dom.Text

class SongAdapter(private var lstSong: List<SongModel>):
    RecyclerView.Adapter<SongAdapter.ViewHolder>(){
        class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
            val tvId: TextView = itemView.findViewById(R.id.tvId)
            val ivSong: ImageView = itemView.findViewById(R.id.ivSong)
            val tvSong: TextView = itemView.findViewById(R.id.tvSong)
            val tvArtist: TextView = itemView.findViewById(R.id.tvArtist)
            val tvAlbum: TextView = itemView.findViewById(R.id.tvAlbum)
            val tvNumber: TextView = itemView.findViewById(R.id.tvNumber)
            val tvTime: TextView = itemView.findViewById(R.id.tvTime)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_musica,parent,false))
    }

    override fun getItemCount(): Int {
        return lstSong.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstSong[position]
        holder.tvId.text = itemSong.id.toString()
        holder.tvSong.text = itemSong.songName
        holder.tvArtist.text = itemSong.artist
        holder.tvAlbum.text = itemSong.album
        holder.tvNumber.text = itemSong.numberSong
        holder.tvTime.text = itemSong.songTime
        holder.ivSong.setImageResource(itemSong.image)
    }
}