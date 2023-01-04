package com.dum.dumscore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.dum.dumscore.databinding.FragmentSignInBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SignInFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentSignInBinding
    private val success = "Success"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.signIn.setOnClickListener {
            val isEmailOkay = binding.emailEditText.text?.toString()?.isValidEmail() == true
            val isPassOkay =
                binding.passwordEditText.text?.toString()?.length?.let { it >= 8 } ?: false

            if (isEmailOkay) {
                if (isPassOkay) {
                    val toast = Toast.makeText(activity, success, Toast.LENGTH_LONG)
                    toast.show()
                    findNavController().navigate(R.id.action_signInFragment_to_welcomeFragment)
                } else {
                    binding.passwordTextField.error =
                        "Passwords have at least 8 characters. Please try again"
                }

            } else {
                binding.emailTextField.error = "Please enter a valid email address."

            }


        }
    }


}
