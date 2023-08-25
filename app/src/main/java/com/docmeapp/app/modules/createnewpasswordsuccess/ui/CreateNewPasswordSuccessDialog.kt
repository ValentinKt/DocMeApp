package com.docmeapp.app.modules.createnewpasswordsuccess.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseDialogFragment
import com.docmeapp.app.databinding.DialogCreateNewPasswordSuccessBinding
import com.docmeapp.app.modules.createnewpasswordsuccess.`data`.viewmodel.CreateNewPasswordSuccessVM
import com.docmeapp.app.modules.homecontainer.ui.HomeContainerActivity
import kotlin.String
import kotlin.Unit

class CreateNewPasswordSuccessDialog :
    BaseDialogFragment<DialogCreateNewPasswordSuccessBinding>(R.layout.dialog_create_new_password_success)
    {
  private val viewModel: CreateNewPasswordSuccessVM by viewModels<CreateNewPasswordSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.createNewPasswordSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGotohome.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "CREATE_NEW_PASSWORD_SUCCESS_DIALOG"


    fun getInstance(bundle: Bundle?): CreateNewPasswordSuccessDialog {
      val fragment = CreateNewPasswordSuccessDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
