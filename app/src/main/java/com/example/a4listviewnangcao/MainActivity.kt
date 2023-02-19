package com.example.a4listviewnangcao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arrayMonan : ArrayList<MonAn> = ArrayList()
        arrayMonan.add(MonAn("I am strong",R.drawable.h7))
        arrayMonan.add(MonAn("I believe in myself",R.drawable.h6))
        arrayMonan.add(MonAn("I choose my choice",R.drawable.h5))
        arrayMonan.add(MonAn("I see my goals clearly",R.drawable.h4))
        arrayMonan.add(MonAn("I trust my journey",R.drawable.h3))
        arrayMonan.add(MonAn("I am smart",R.drawable.h1))
        arrayMonan.add(MonAn("I love myself",R.drawable.h2))

        var listview  = findViewById<ListView>(R.id.listView)
        listview.adapter = CustomAdapter(this@MainActivity, arrayMonan)
    }
}