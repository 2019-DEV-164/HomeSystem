package com.home.homesystem.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.home.homesystem.R
import com.home.homesystem.adapter.MenuListAdapter
import com.home.homesystem.extension.replaceFragment
import com.home.homesystem.fragment.ChannelControlFragment
import com.home.homesystem.fragment.NavigationControlFragment
import com.home.homesystem.fragment.VolumeControlFragment
import com.home.homesystem.fragments.ChannelListFragment
import com.home.homesystem.fragments.MediaControllerFragment
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        listMenu?.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        listMenu?.setHasFixedSize(true)
        listMenu?.adapter = MenuListAdapter()

        replaceFragment(containerChannelList.id,supportFragmentManager, ChannelListFragment(),false)
        replaceFragment(containerMediaController.id, supportFragmentManager,
            MediaControllerFragment(),false)
        //replaceFragment(otherControllers.id, supportFragmentManager,
           // OtherMediaControllerFragment(),false)
        replaceFragment(soundController.id, supportFragmentManager,
            VolumeControlFragment(this),false)
        replaceFragment(navigationController.id, supportFragmentManager,
            NavigationControlFragment(this),false)
        replaceFragment(channelController.id, supportFragmentManager,
            ChannelControlFragment(this),false)
    }
}