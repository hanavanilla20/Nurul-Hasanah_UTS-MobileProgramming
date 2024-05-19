package com.pnj.uts.ti.nurul_hasanah.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.pnj.uts.ti.nurul_hasanah.Data.DataBerita
import com.pnj.uts.ti.nurul_hasanah.R

class BeritaAdapter (
    private val context: Activity,
    private val listBerita: ArrayList<DataBerita>
) : ArrayAdapter<DataBerita>(context, R.layout.komponen_berita, listBerita) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.komponen_berita, null)

        val beritaGambar : ImageView = view.findViewById(R.id.gambarBerita)
        val beritaJudul : TextView = view.findViewById(R.id.judulBerita)
        val beritaDeskripsi : TextView = view.findViewById(R.id.deskripsiBerita)

        beritaGambar.setImageResource(listBerita[position].gambarBerita)
        beritaJudul.text = listBerita[position].judulBerita
        beritaDeskripsi.text = listBerita[position].deskripsiBerita

        return view
    }
}