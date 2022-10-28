package com.example.tugaspsi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val data: ArrayList<Nama>): RecyclerView.Adapter<ItemsViewModel>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewModel {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return ItemsViewModel(inflater, parent)
    }

    override fun onBindViewHolder(holder: ItemsViewModel, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
