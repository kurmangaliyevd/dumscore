package com.dum.dumscore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dum.dumscore.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}