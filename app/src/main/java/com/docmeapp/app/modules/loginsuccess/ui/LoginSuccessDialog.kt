package com.docmeapp.app.modules.loginsuccess.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseDialogFragment
import com.docmeapp.app.databinding.DialogLoginSuccessBinding
import com.docmeapp.app.modules.homecontainer.ui.HomeContainerActivity
import com.docmeapp.app.modules.loginsuccess.`data`.viewmodel.LoginSuccessVM
import kotlin.String
import kotlin.Unit

class LoginSuccessDialog :
    BaseDialogFragment<DialogLoginSuccessBinding>(R.layout.dialog_login_success) {
  private val viewModel: LoginSuccessVM by viewModels<LoginSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.loginSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGotohome.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "LOGIN_SUCCESS_DIALOG"


    fun getInstance(bundle: Bundle?): LoginSuccessDialog {
      val fragment = LoginSuccessDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
