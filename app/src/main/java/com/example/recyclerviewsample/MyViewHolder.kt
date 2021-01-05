package com.example.recyclerviewsample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(val v: View): RecyclerView.ViewHolder(v) {
    val title = v.findViewById<TextView>(R.id.title)
    val message = v.findViewById<TextView>(R.id.message)
}