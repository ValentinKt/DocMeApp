package com.docmeapp.app.modules.onboardingfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityOnboardingFourBinding
import com.docmeapp.app.modules.login.ui.LoginActivity
import com.docmeapp.app.modules.onboardingfour.`data`.viewmodel.OnboardingFourVM
import com.docmeapp.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class OnboardingFourActivity :
    BaseActivity<ActivityOnboardingFourBinding>(R.layout.activity_onboarding_four) {
  private val viewModel: OnboardingFourVM by viewModels<OnboardingFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignup.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
