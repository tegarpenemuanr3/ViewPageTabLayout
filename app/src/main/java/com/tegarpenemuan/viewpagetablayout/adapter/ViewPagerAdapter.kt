package com.tegarpenemuan.viewpagetablayout.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tegarpenemuan.viewpagetablayout.fragment.FirstFragment
import com.tegarpenemuan.viewpagetablayout.fragment.SecondFragment

/**
 * com.tegarpenemuan.viewpagetablayout
 *
 * Created by Tegar Penemuan on 29/06/2022.
 * https://github.com/tegarpenemuanr3
 *
 */

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 7
    }

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment() //fragment kosong
        when(position) {
            0 -> fragment = FirstFragment()
            1 -> fragment = SecondFragment()
            2 -> fragment = FirstFragment()
            3 -> fragment = SecondFragment()
            4 -> fragment = FirstFragment()
            5 -> fragment = SecondFragment()
            6 -> fragment = FirstFragment()
            7 -> fragment = SecondFragment()
        }
        return fragment
    }
}