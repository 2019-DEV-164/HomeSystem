package com.home.homesystem.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.home.homesystem.R
import kotlinx.android.synthetic.main.menu_list_item.view.*


class MenuListAdapter : RecyclerView.Adapter<MenuListAdapter.ViewHolder>() {

    private val menuList:MutableList<Int> = mutableListOf(R.drawable.power_in_menu,
        R.drawable.digital_tv,R.drawable.evpad,R.drawable.unblock,R.drawable.now_tv,
        R.drawable.apple_tv,R.drawable.dvd,R.drawable.pc)

    private var selectedItem = 0

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.getContext())
        val listItem: View = layoutInflater.inflate(R.layout.menu_list_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            val previousItem = selectedItem
            selectedItem = position
            notifyItemChanged(previousItem)
            notifyItemChanged(position)
        }
        holder.bind(position,selectedItem,menuList[position])
    }

    class ViewHolder(view:View): RecyclerView.ViewHolder(view){
        fun bind(position: Int,selectedItem:Int,@DrawableRes drawable:Int){
            itemView.imgMenu.setImageResource(drawable)
            itemView.imgMenuSelect.visibility = View.GONE
            if(selectedItem == position){
                itemView.imgMenuSelect.visibility = View.VISIBLE
            }
        }
    }
}