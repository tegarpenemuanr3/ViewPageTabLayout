package com.tegarpenemuan.viewpagetablayout.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.tegarpenemuan.viewpagetablayout.adapter.FragmentViewPagerAdapter
import com.tegarpenemuan.viewpagetablayout.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewPageAdapter: FragmentViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        viewPageAdapter = FragmentViewPagerAdapter(this)

        binding.viewPager.adapter = viewPageAdapter

        TabLayoutMediator(binding.tabLayout,binding.viewPager) { tab, position ->
            when(position) {
                0 -> tab.text = "UMKM"
                1 -> tab.text = "Lokasi"
                2 -> tab.text = "Pemilik"
                3 -> tab.text = "Tukang"
                4 -> tab.text = "Coba"
                5 -> tab.text = "Jel"
                6 -> tab.text = "persib"
                7 -> tab.text = "kucing"
                8 -> tab.text = "hayam"
            }
        }.attach()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}