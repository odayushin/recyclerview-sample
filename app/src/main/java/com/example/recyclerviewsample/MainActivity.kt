package com.example.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun createData(): List<ListItemData> {
        return (1..100).map {
            ListItemData("タイトル${it}", "メッセージ${it}")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.rv_list.layoutManager = LinearLayoutManager(this)
        this.rv_list.adapter = MyAdapter(createData(), this)
    }
}
