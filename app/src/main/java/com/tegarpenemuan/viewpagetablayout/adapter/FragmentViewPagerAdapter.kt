package com.tegarpenemuan.viewpagetablayout.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tegarpenemuan.viewpagetablayout.fragment.FirstFragment
import com.tegarpenemuan.viewpagetablayout.fragment.SecondFragment
import com.tegarpenemuan.viewpagetablayout.fragment.ThirdFragment

/**
 * com.tegarpenemuan.viewpagetablayout
 *
 * Created by Tegar Penemuan on 29/06/2022.
 * https://github.com/tegarpenemuanr3
 *
 */

class FragmentViewPagerAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 9
    }

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment() //fragment kosong
        when(position) {
            0 -> fragment = FirstFragment()
            1 -> fragment = SecondFragment()
            2 -> fragment = ThirdFragment()
            3 -> fragment = FirstFragment()
            4 -> fragment = SecondFragment()
            5 -> fragment = ThirdFragment()
            6 -> fragment = FirstFragment()
            7 -> fragment = SecondFragment()
            8 -> fragment = ThirdFragment()
        }
        return fragment
    }
}