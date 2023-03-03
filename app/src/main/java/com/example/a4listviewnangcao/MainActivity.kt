package com.example.a4listviewnangcao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    //lateinit var: biến khởi tạo muộn: không cần gán giá trị
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //khai báo danh sách item
        var arrayMonan : ArrayList<MonAn> = ArrayList()
        arrayMonan.add(MonAn("I am strong",R.drawable.h7))
        arrayMonan.add(MonAn("I believe in myself",R.drawable.h6))
        arrayMonan.add(MonAn("I choose my choice",R.drawable.h5))
        arrayMonan.add(MonAn("I see my goals clearly",R.drawable.h4))
        arrayMonan.add(MonAn("I trust my journey",R.drawable.h3))
        arrayMonan.add(MonAn("I am smart",R.drawable.h1))
        arrayMonan.add(MonAn("I love myself",R.drawable.h2))

        customAdapter = CustomAdapter(this, arrayMonan)
        listView.adapter = customAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            //adapterView:AdapterView nơi nhấp chuột xảy ra
            //view:View chế độ xem trong chế độ xem bộ điều hợp đã được nhấp(là chế độ xem do bộ điều hợp cung cấp)
            //i:Int vị trí của khung nhìn trong bộ điều hợp
            //l:long id hàng của mục mà bạn đã nhấp
            Toast.makeText(this,customAdapter.mang[i].ten,Toast.LENGTH_SHORT).show()

        }
    }
}