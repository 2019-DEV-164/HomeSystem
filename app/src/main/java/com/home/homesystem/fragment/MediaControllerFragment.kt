package com.home.homesystem.fragments

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.home.homesystem.R
import com.home.homesystem.databinding.FragmentMediaControllerBinding
import com.home.homesystem.viewModel.MediaControllerViewModel

class MediaControllerFragment(var mActivity: Activity) : Fragment() {

    lateinit var mBinding: FragmentMediaControllerBinding
    private lateinit var viewModel: MediaControllerViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_media_controller, container, false)

        return mBinding.root
    }
}