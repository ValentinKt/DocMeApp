package com.docmeapp.app.modules.resetpasswordemail.ui

import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseFragment
import com.docmeapp.app.databinding.FragmentResetPasswordEmailBinding
import com.docmeapp.app.modules.resetpasswordemail.`data`.viewmodel.ResetPasswordEmailVM
import kotlin.String
import kotlin.Unit

class ResetPasswordEmailFragment :
    BaseFragment<FragmentResetPasswordEmailBinding>(R.layout.fragment_reset_password_email) {
  private val viewModel: ResetPasswordEmailVM by viewModels<ResetPasswordEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.resetPasswordEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RESET_PASSWORD_EMAIL_FRAGMENT"

  }
}
