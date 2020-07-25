package com.example.recyclerviewboilerplate

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewboilerplate.adapter.ListAdapter
import com.example.recyclerviewboilerplate.model.DataList

class MainActivity : AppCompatActivity() {

    lateinit var dataLists: ArrayList<DataList>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        dataLists = DataList.createUsersList(20)
        val adapter = ListAdapter(dataLists)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}