package com.home.homesystem.extension

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun AppCompatActivity.replaceFragment(@IdRes container:Int, fragmentManager: FragmentManager,fragment:Fragment,canPopBack:Boolean = false){
    val transaction =  fragmentManager.beginTransaction()
    transaction.replace(container,fragment)
    if(canPopBack) transaction.addToBackStack(null)
    transaction.commitNow();
}