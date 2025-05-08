package com.utkuaksu.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.utkuaksu.odev4.databinding.FragmentSayfaABinding
import com.utkuaksu.odev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.buttonBtoY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.yGecis)
        }

        return binding.root
    }
}