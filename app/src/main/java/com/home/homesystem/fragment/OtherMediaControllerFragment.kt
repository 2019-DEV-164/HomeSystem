package com.home.homesystem.fragments

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.home.homesystem.R
import com.home.homesystem.databinding.FragmentOtherMediaControllerBinding
import com.home.homesystem.viewModel.OtherMediaViewModel

class OtherMediaControllerFragment(var mActivity: Activity) : Fragment() {
    lateinit var mBinding: FragmentOtherMediaControllerBinding
    private lateinit var viewModel: OtherMediaViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_other_media_controller,
            container,
            false
        )

        return mBinding.root
    }
}