package com.example.a4listviewnangcao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arrayMonan : ArrayList<MonAn> = ArrayList()
        arrayMonan.add(MonAn("A",R.drawable.mat1))
        arrayMonan.add(MonAn("B",R.drawable.mat2))
        arrayMonan.add(MonAn("C",R.drawable.mat3))
        arrayMonan.add(MonAn("D",R.drawable.mat4))
        arrayMonan.add(MonAn("E",R.drawable.mat5))
        arrayMonan.add(MonAn("F",R.drawable.mat6))
        var listview  = findViewById<ListView>(R.id.listView)
        listview.adapter = CustomAdapter(this@MainActivity, arrayMonan)
    }
}