package com.dum.dumscore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.dum.dumscore.databinding.FragmentSignInBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SignInFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initTextChangedListeners()

        binding.signIn.setOnClickListener {
            if (isValidated()) {
                Toast.makeText(activity, getString(R.string.success), Toast.LENGTH_LONG).show()
                findNavController().navigate(R.id.action_signInFragment_to_welcomeFragment)
            }
        }

    }

    private fun isValidated(): Boolean {
        val isEmailOkay = binding.emailEditText.text?.toString()?.isValidEmail() == true
        val isPassOkay =
            binding.passwordEditText.text?.toString()?.length?.let { it >= 8 } ?: false

        if (!isEmailOkay) {
            binding.emailTextField.error = "Please enter a valid email address."
            return false
        }

        if (!isPassOkay) {
            binding.passwordTextField.error =
                "Passwords have at least 8 characters. Please try again"
            return false
        }

        return true
    }

    private fun initTextChangedListeners() {
        binding.emailEditText.addTextChangedListener {
            if (binding.emailTextField.isErrorEnabled) {
                binding.emailTextField.isErrorEnabled = false
            }
        }

        binding.passwordEditText.addTextChangedListener {
            if (binding.passwordTextField.isErrorEnabled) {
                binding.passwordTextField.isErrorEnabled = false
            }
        }
    }


}
