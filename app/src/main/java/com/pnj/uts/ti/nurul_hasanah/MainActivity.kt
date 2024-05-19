package com.pnj.uts.ti.nurul_hasanah

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val email = findViewById<TextInputEditText>(R.id.inputEmail)
        val password = findViewById<TextInputEditText>(R.id.inputPassword)
        val login = findViewById<Button>(R.id.btnLogin)

        login.setOnClickListener {
            val myEmail = "nurul.hasanah.tik22@mhsw.pnj.ac.id"
            val myPassword = "vanilla"
            val myNIM = "2207411036"
            val myName = "Nurul Hasanah"
            val myKelas = "TI 4B"

            val data = getSharedPreferences("myPreference", Context.MODE_PRIVATE)
            val editor = data.edit()
            editor.putString("Email", myEmail)
            editor.putString("Password", myPassword)
            editor.putString("NIM", myNIM)
            editor.putString("Nama", myName)
            editor.putString("Kelas", myKelas)
            editor.apply()

            val Email = email.text.toString()
            val Password = password.text.toString()

            if (Email == myEmail && Password == myPassword) {
                val intent = Intent(this, FragmentUtama::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Password salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}