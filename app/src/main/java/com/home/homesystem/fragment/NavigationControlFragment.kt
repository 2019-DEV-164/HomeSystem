package com.home.homesystem.fragment

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.home.homesystem.R
import com.home.homesystem.databinding.ViewNavControlBinding
import com.home.homesystem.viewModel.VolumeControlViewModel

class NavigationControlFragment(var mActivity: Activity) : Fragment() {
    lateinit var mBinding: ViewNavControlBinding
    private lateinit var viewModel: VolumeControlViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.view_nav_control, container, false)

        return mBinding.root
    }
}