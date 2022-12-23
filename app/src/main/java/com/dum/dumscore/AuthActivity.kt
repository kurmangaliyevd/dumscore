package com.dum.dumscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dum.dumscore.databinding.ActivityAuthBinding
import com.dum.dumscore.databinding.ActivityMainBinding

class AuthActivity : AppCompatActivity() {

lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)

        setContentView(binding.root)

        MAIN = this
    }
}