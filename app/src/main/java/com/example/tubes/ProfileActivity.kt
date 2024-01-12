package com.example.tubes

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ProfileActivity : AppCompatActivity() {

    // Mendeklarasikan profileButton
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profil)

        // Gantilah dengan data profil sebenarnya
        val username = "phil Foden"
        val email = "Manchester city Player"

        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val usernameTextView = findViewById<TextView>(R.id.username)
        val emailTextView = findViewById<TextView>(R.id.email)

        usernameTextView.text = username
        emailTextView.text = email

        // Menginisialisasi profileButton
        profileButton = findViewById(R.id.btnEditProfile)

        // Implementasikan logika untuk tombol-tombol di bawahnya
        val editProfileButton = findViewById<Button>(R.id.btnEditProfile)
        val changePasswordButton = findViewById<Button>(R.id.btnChangePassword)
        val privacySettingsButton = findViewById<Button>(R.id.btnPrivacySettings)
        val logoutButton = findViewById<Button>(R.id.btnLogout)

        // Tambahkan logika untuk menangani klik tombol di sini
        // Contoh: untuk tombol edit profile
        editProfileButton.setOnClickListener {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
        }

        profileButton.setOnClickListener {
            val bottomSheetFragment = ProfileBottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager, "ProfileBottomSheetFragment")
        }

        changePasswordButton.setOnClickListener {
            // Implementasikan logika untuk tombol change password di sini
        }

        privacySettingsButton.setOnClickListener {
            val intent = Intent(this, ContactUsActivity::class.java)
            startActivity(intent)
        }

        logoutButton.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }

        // Implementasikan logika untuk tombol-tombol lainnya sesuai kebutuhan Anda
    }
}
