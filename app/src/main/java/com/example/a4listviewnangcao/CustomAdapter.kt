package com.example.a4listviewnangcao

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.text.FieldPosition

class CustomAdapter constructor(var context :Activity, var mang : ArrayList<MonAn>) : ArrayAdapter<MonAn>(context, R.layout.dong_monan) {
//    class ViewHolder (row:View){
//        var textviewTenmonan : TextView
//        var imgviewMonan : ImageView
//
//        init{
//            textviewTenmonan = row.findViewById(R.id.tviewMonan)
//            imgviewMonan = row.findViewById(R.id.imgviewHinhmonan)
//        }
//    }


    override fun getCount(): Int {
        return mang.size
        //vẽ lên view hết tất cả các dòng của list
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var context1 = context.layoutInflater
        //layoutInflater là 1 component giúp chuyển layout xml thành view trong android
        var rowView = context1.inflate(R.layout.dong_monan, parent, false)

        var img = rowView.findViewById<ImageView>(R.id.img)
        var name = rowView.findViewById<TextView>(R.id.name)

        name.text = mang.get(position).ten
        img.setImageResource(mang[position].hinhanh)
        return rowView
    }
}