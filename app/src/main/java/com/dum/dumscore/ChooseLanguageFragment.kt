package com.dum.dumscore

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.preference.PreferenceManager
import com.dum.dumscore.databinding.FragmentChooseLanguageBinding


class ChooseLanguageFragment : Fragment() {

    private lateinit var binding: FragmentChooseLanguageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val currentLanguage = PreferenceManager.getDefaultSharedPreferences(requireContext())
            .getString(Languages.languageKey, "")
        if(!currentLanguage.isNullOrEmpty()) {
            findNavController().navigate(R.id.welcomeFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChooseLanguageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButtons()
    }


    private fun setupButtons() = with(binding) {


        val editor = PreferenceManager.getDefaultSharedPreferences(requireContext()).edit()

        uk.setOnClickListener {
            editor.putString(Languages.languageKey, "english").apply()
            restartActivity()
        }

        ru.setOnClickListener {
            editor.putString(Languages.languageKey, "russian").apply()
            restartActivity()
        }
    }

    private fun restartActivity() {
        requireActivity().apply {
            finish()
            startActivity(intent)
        }
    }
}