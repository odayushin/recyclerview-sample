package com.example.recyclerviewsample

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val data: List<ListItemData>, val context: Context): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val root = LayoutInflater.from(context).inflate(R.layout.layout_my_list_item, parent, false)
        return MyViewHolder(root)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        data[position].let {
            holder.title.text = it.title
            holder.message.text = it.message
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

data class ListItemData(
    val title: String,
    val message: String
)