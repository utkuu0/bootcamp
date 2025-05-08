package com.utkuaksu.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.utkuaksu.odev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonMaintoA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.aGecis)
        }

        binding.buttonMaintoX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.xGecis)
        }

        return binding.root
    }
}