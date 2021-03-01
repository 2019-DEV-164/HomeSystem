package com.home.homesystem.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.home.homesystem.R

class ChannelListAdapter : RecyclerView.Adapter<ChannelListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.getContext())
        val listItem: View = layoutInflater.inflate(R.layout.channel_list_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {

        }

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}