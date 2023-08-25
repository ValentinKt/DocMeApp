package com.docmeapp.app.modules.createnewpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityCreateNewPasswordBinding
import com.docmeapp.app.modules.createnewpassword.`data`.viewmodel.CreateNewPasswordVM
import com.docmeapp.app.modules.createnewpasswordsuccess.ui.CreateNewPasswordSuccessDialog
import kotlin.String
import kotlin.Unit

class CreateNewPasswordActivity :
    BaseActivity<ActivityCreateNewPasswordBinding>(R.layout.activity_create_new_password) {
  private val viewModel: CreateNewPasswordVM by viewModels<CreateNewPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createNewPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCreatepasswordOne.setOnClickListener {
      val destFragment = CreateNewPasswordSuccessDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, CreateNewPasswordSuccessDialog.TAG)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CREATE_NEW_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateNewPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
