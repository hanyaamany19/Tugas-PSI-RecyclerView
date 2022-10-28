package com.example.tugaspsi

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsViewModel(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card_view_design, parent, false)){

    private var imgView: ImageView? = null
    private var txtTitle: TextView? = null
    private var txtSubTitle: TextView? = null
    private var txtClass: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.image)
        txtTitle = itemView.findViewById(R.id.nama)
        txtSubTitle = itemView.findViewById(R.id.nim)
        txtClass = itemView.findViewById(R.id.kelas)
    }

    fun bind(data: Nama){
        imgView?.setImageResource(data.imgView)
        txtTitle?.text = data.txtTitle
        txtSubTitle?.text = data.txtSubTitle
        txtClass?.text  = data.txtClass
    }

}
