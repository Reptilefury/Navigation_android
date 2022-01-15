package com.reptilefury.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.reptilefury.navigation.databinding.FragmentHomeBinding
import android.view.View
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Button_login.setOnClickListener {
            val action = fragment_homeDirections.actionFragmentHomeToLoginFragment()
            findNavController().navigate(action)
        }
        binding.TestButton.setOnClickListener {
            val action = fragment_homeDirections.actionFragmentHomeToLoginFragment()
            findNavController().navigate(action)
        }

    }
}