package com.example.tugasrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugaspsi.CustomAdapter
import com.example.tugaspsi.Nama

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun init(){
        recyclerView = findViewById(R.id.recyclerview)

        var data = ArrayList<Nama>()
        data.add(Nama(R.drawable.foto1, "Ifadatul Khoiroh", "205150207111044", "PSI-E"))
        data.add(Nama(R.drawable.foto2, "Thana Fadhila P", "205150207111043", "PSI-E"))
        data.add(Nama(R.drawable.foto3, "Hani Amany Elisadi", "225150209111005", "PSI-E"))


        adapter = CustomAdapter(data)
    }
}