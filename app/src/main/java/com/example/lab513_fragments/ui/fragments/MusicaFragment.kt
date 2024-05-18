package com.example.lab513_fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab513_fragments.R
import com.example.lab513_fragments.ui.adapter.SongAdapter
import com.example.lab513_fragments.ui.model.SongModel

class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view : View = inflater.inflate(R.layout.fragment_musica, container, false)
        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)

        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(PlayList())

        return view
    }
    private fun PlayList(): List<SongModel>{
        var lstSong: ArrayList<SongModel> = ArrayList()
        lstSong.add(
            SongModel(1,R.drawable.cover1,"House of Memories","Death of a Bachelor","812,543","Panic!","3:28")
        )
        lstSong.add(
            SongModel(2,R.drawable.cover2,"Who's ready for tomorrow?","Cyberpunk: Edgerunners","654,546","Ratboy, IBDY!","1:56")
        )
        lstSong.add(
            SongModel(3,R.drawable.cover3,"Theatre of Life","Ultra Flash","744,543","Konomi Suzuki","4:45")
        )
        lstSong.add(
            SongModel(4,R.drawable.cover4,"The Pretender","Army of Mushrooms","142,543","Infected Mushrooms","6:34")
        )
        lstSong.add(
            SongModel(5,R.drawable.cover5,"Naraku no Hana","Hikarinadeshiko","823,582","Eiko Shimamiya","5:00")
        )
        return lstSong
    }
}