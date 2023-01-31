package com.dum.dumscore

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.preference.PreferenceManager


class ChooseLanguageFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_choose_language)
        btn.si.setOnClickListener {
            PreferenceManager(this).updateLanguage("ta")
            startActivity(Intent(this, AuthActivity::class.java))
            finish()
        }

        english_bt.setOnClickListener {
            PreferenceManager(this).updateLanguage("en")
            startActivity(Intent(this, AuthActivity::class.java))
            finish()
        }
    }
}