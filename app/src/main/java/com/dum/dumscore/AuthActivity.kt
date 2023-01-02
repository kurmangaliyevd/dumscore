package com.dum.dumscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.dum.dumscore.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {

    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val welcomeFragment = WelcomeFragment()
        val fm: FragmentManager = supportFragmentManager
        fm.beginTransaction().add(R.id.activity_auth, welcomeFragment).commit()

    }
}
