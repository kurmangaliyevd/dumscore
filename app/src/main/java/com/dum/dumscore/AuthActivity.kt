package com.dum.dumscore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dum.dumscore.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {

    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}
