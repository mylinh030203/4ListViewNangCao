package com.example.a4listviewnangcao

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.text.FieldPosition

class CustomAdapter constructor(var context :Context, var mangmonan : ArrayList<MonAn>) : BaseAdapter() {
    class ViewHolder (row:View){
        var textviewTenmonan : TextView
        var imgviewMonan : ImageView

        init{
            textviewTenmonan = row.findViewById(R.id.tviewMonan)
            imgviewMonan = row.findViewById(R.id.imgviewHinhmonan)
        }
    }

    override fun getCount(): Int {
        return mangmonan.size
        //ve so dong bang so gia tri tra ve
    }

    override fun getItem(position: Int): Any {
        return mangmonan.get(position)
        //chi ra cac thuoc tinh trong doi tuong
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        var view: View?
        var viewHolder : ViewHolder
        if(convertView == null){
            var layinflater :LayoutInflater = LayoutInflater.from(context)
            view = layinflater.inflate(R.layout.dong_monan, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }
        var monan :MonAn = getItem(position) as MonAn
        viewHolder.textviewTenmonan.text = monan.ten
        viewHolder.imgviewMonan.setImageResource(monan.hinhanh)
        return view as View
    }
}