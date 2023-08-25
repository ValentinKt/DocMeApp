package com.docmeapp.app.modules.signupsuccess.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseDialogFragment
import com.docmeapp.app.databinding.DialogSignUpSuccessBinding
import com.docmeapp.app.modules.homecontainer.ui.HomeContainerActivity
import com.docmeapp.app.modules.signupsuccess.`data`.viewmodel.SignUpSuccessVM
import kotlin.String
import kotlin.Unit

class SignUpSuccessDialog :
    BaseDialogFragment<DialogSignUpSuccessBinding>(R.layout.dialog_sign_up_success) {
  private val viewModel: SignUpSuccessVM by viewModels<SignUpSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.signUpSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGotohome.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_SUCCESS_DIALOG"


    fun getInstance(bundle: Bundle?): SignUpSuccessDialog {
      val fragment = SignUpSuccessDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
