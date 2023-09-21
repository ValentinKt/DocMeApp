package com.docmeapp.app.modules.logoutpopup.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseDialogFragment
import com.docmeapp.app.databinding.DialogLogOutPopUpBinding
import com.docmeapp.app.modules.logoutpopup.`data`.viewmodel.LogOutPopUpVM
import kotlin.String
import kotlin.Unit

class LogOutPopUpDialog :
    BaseDialogFragment<DialogLogOutPopUpBinding>(R.layout.dialog_log_out_pop_up) {
  private val viewModel: LogOutPopUpVM by viewModels<LogOutPopUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.logOutPopUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOG_OUT_POP_UP_DIALOG"


    fun getInstance(bundle: Bundle?): LogOutPopUpDialog {
      val fragment = LogOutPopUpDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
