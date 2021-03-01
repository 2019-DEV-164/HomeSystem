package com.home.homesystem.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.home.homesystem.R
import com.home.homesystem.adapter.ChannelListAdapter
import kotlinx.android.synthetic.main.fragment_channels.*

class ChannelListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_channels, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listChannelView.setHasFixedSize(true)
        activity?.let {
            listChannelView.layoutManager = GridLayoutManager(it,2,RecyclerView.HORIZONTAL,false)
        }
        listChannelView.adapter = ChannelListAdapter()


    }
}