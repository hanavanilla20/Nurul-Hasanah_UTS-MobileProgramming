package com.pnj.uts.ti.nurul_hasanah

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FragmentUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fragment_utama)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val home = findViewById<Button>(R.id.buttonHome)
        home.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(this, FragmentUtama::class.java)
            startActivity(intent)
        }

        val berita = findViewById<Button>(R.id.buttonBerita)
        berita.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(this, FragmentBerita::class.java)
            startActivity(intent)
        }

        val profile = findViewById<Button>(R.id.buttonProfile)
        profile.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(this, FragmentProfile::class.java)
            startActivity(intent)
        }
    }
}