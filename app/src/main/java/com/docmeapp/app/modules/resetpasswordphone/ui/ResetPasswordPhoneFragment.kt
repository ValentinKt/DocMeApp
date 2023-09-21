package com.docmeapp.app.modules.resetpasswordphone.ui

import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseFragment
import com.docmeapp.app.databinding.FragmentResetPasswordPhoneBinding
import com.docmeapp.app.modules.resetpasswordphone.`data`.viewmodel.ResetPasswordPhoneVM
import com.docmeapp.app.modules.resetpasswordverifycode.ui.ResetPasswordVerifyCodeActivity
import kotlin.String
import kotlin.Unit

class ResetPasswordPhoneFragment :
    BaseFragment<FragmentResetPasswordPhoneBinding>(R.layout.fragment_reset_password_phone) {
  private val viewModel: ResetPasswordPhoneVM by viewModels<ResetPasswordPhoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.resetPasswordPhoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSendotp.setOnClickListener {
      val destIntent = ResetPasswordVerifyCodeActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "RESET_PASSWORD_PHONE_FRAGMENT"

  }
}
