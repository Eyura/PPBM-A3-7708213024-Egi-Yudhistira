package com.example.tubes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import androidx.appcompat.app.AppCompatActivity

class ContactUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_us)

        val email = findViewById<EditText>(R.id.email)
        val message = findViewById<EditText>(R.id.message)
        val send = findViewById<Button>(R.id.send)
        val rating = findViewById<RatingBar>(R.id.rating)

        send.setOnClickListener {
            // Handle the button click here
            val emailValue = email.text.toString()
            val messageValue = message.text.toString()
            val ratingValue = rating.rating

            // You can now send these values to your server or handle them as needed
        }
    }
}
