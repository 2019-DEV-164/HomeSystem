package com.home.homesystem.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.home.homesystem.R
import com.home.homesystem.adapter.MenuListAdapter
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        listMenu?.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        listMenu?.setHasFixedSize(true)
        listMenu?.adapter = MenuListAdapter()
    }
}