package com.dum.dumscore

import android.os.Bundle
import com.dum.dumscore.databinding.ActivityAuthBinding


class AuthActivity : BaseActivity() {

    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)

        setContentView(binding.root)


    }
}

