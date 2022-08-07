package com.tegarpenemuan.viewpagetablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.tegarpenemuan.viewpagetablayout.adapter.ViewPagerAdapter
import com.tegarpenemuan.viewpagetablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var viewPageAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPageAdapter = ViewPagerAdapter(supportFragmentManager,lifecycle)

        binding.viewPager.adapter = viewPageAdapter

        TabLayoutMediator(binding.tabLayout,binding.viewPager) { tab, position ->
            when(position) {
                0 -> tab.text = "Tab Pertama"
                1 -> tab.text = "Tab Kedua"
            }
        }.attach()
    }
}