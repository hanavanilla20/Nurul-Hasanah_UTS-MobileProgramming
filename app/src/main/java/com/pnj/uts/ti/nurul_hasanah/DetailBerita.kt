package com.pnj.uts.ti.nurul_hasanah

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pnj.uts.ti.nurul_hasanah.databinding.ActivityDetailBeritaBinding

class DetailBerita : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBeritaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val judulBerita = intent.getStringExtra("Judul Berita")
        val deskeripsiBerita = intent.getStringExtra("Deskripsi Berita")
        val gambarBerita = intent.getIntExtra("gambar Berita", R.drawable.berita10)

        binding.textJudul.text = judulBerita
        binding.textDeskripsi.text = deskeripsiBerita
        binding.imageBerita.setImageResource(gambarBerita)
    }
}