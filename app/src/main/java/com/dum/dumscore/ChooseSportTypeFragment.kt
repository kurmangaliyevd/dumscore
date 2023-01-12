package com.dum.dumscore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.dum.dumscore.databinding.FragmentChooseSportTypeBinding

class ChooseSportTypeFragment : Fragment() {

    private lateinit var binding: FragmentChooseSportTypeBinding

    private lateinit var sportTypeAdapter: SportTypeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChooseSportTypeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        sportTypeAdapter = SportTypeAdapter(SportTypeDataProvider.sportTypes)
        binding.sportTypeRv.layoutManager = GridLayoutManager(requireContext(),3)
        binding.sportTypeRv.adapter = sportTypeAdapter
    }

}