package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ncorti.slidetoact.SlideToActView

class slide_act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.slide_art)

        val slideToActView= findViewById<SlideToActView>(R.id.geser)
        slideToActView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                Log.d("Egi Yudhistira", "slide1: " + view.text + ", id: " + view.id)

                val _intent = Intent(
                    this@slide_act, StartActivity::class.java
                )

                startActivity(_intent)

            }
        }
    }
}
