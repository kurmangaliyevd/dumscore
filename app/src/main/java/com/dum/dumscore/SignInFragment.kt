package com.dum.dumscore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dum.dumscore.databinding.FragmentSignInBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class SignInFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(inflater,container,false)
        return binding.root
    }


     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)

         binding.signIn.setOnClickListener {
             val isEmailOkay = binding.emailEditText.text?.toString()?.isValidEmail() == true
             val isPassOkay = binding.passwordEditText.text?.toString()?.length?.let { it>=8 } ?: false
             if(isEmailOkay && isPassOkay) {
                 //navigate next, authorization successful
             } else {
                 //show error
             }
         }
     }


}
