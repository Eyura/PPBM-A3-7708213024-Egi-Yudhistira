package com.example.tubes

import ListItem
import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuUtama : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)

        bottomNav = findViewById(R.id.bottom_navigation)
        val listView = findViewById<ListView>(R.id.listview1)
        setListViewData(listView)
    }

    private fun setListViewData(listView: ListView) {
        val listItems = listOf(
            ListItem("Phil Foden", "Midfielder, 2016", R.drawable.gambar1),
            ListItem("Jack Grealish", "Midfielder, 2021", R.drawable.gambar2),
            ListItem("Ruben Dias", "Defender, 2020", R.drawable.gambar3),
            ListItem("Bernardo Silva", "Midfielder, 2017", R.drawable.gambar4),
            ListItem("Kevin De Bruyne", "Midfielder, 2015", R.drawable.gambar5),
            ListItem("Julian Alvarez", "Forward, 2022", R.drawable.gambar6),
            ListItem("Erling Haaland", "Forward, 2023", R.drawable.gambar7),
            ListItem("Rodri", "Midfielder, 2018", R.drawable.gambar8),
            ListItem("John Stones", "Defender, 2016", R.drawable.gambar9),
            ListItem("Kyle Walker", "Defender, 2017", R.drawable.gambar10),
            ListItem("Ederson Moraes", "Goalkeeper, 2017", R.drawable.gambar11)
        )

        val adapter = ListItemAdapter(this, listItems)
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedItem = listItems[position]

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("itemName", selectedItem.name)
            intent.putExtra("itemDescription", selectedItem.description)
            intent.putExtra("itemImage", selectedItem.imageResource)
            startActivity(intent)
        }
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_nav_item_home -> {
                    startActivity(Intent(this, MenuUtama::class.java))
                    true
                }
                R.id.bottom_nav_item_dashboard -> {
                    startActivity(Intent(this, InstagramActivity::class.java))
                    true
                }
                R.id.bottom_nav_item_notifications -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    true
                }
                else -> false
            }
        }

    }
}
