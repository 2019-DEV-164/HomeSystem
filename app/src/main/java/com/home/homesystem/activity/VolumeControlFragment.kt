package com.home.homesystem.activity

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.home.homesystem.R
import com.home.homesystem.databinding.ViewVolumeControlBinding
import com.home.homesystem.viewModel.VolumeControlViewModel

class VolumeControlFragment(var mActivity: Activity) : Fragment() {
    lateinit var mBinding: ViewVolumeControlBinding
    private lateinit var viewModel: VolumeControlViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.view_volume_control, container, false)

        return mBinding.root
    }
}