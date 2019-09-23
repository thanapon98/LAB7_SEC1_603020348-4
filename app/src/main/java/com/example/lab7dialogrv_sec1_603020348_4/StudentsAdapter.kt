package com.example.lab7dialogrv_sec1_603020348_4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.std_item_layout.view.*

class StudentsAdapter (val items:List<Student>, val context: Context) : RecyclerView.Adapter <ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view_item = LayoutInflater.from(parent.context).inflate(R.layout.std_item_layout, parent, false)
        return ViewHolder(view_item)//To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return items.size//To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvID?.text = "ID : "+items[position].id
        holder.tvName?.text = "Name : "+items[position].name
        holder.tvAge?.text = "Age : "+items[position].age.toString()//To change body of created functions use File | Settings | File Templates.
    }
}
class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
    val  tvID : TextView = view.tv_id
    val tvName : TextView = view.tv_name
    val tvAge : TextView = view.tv_age
}