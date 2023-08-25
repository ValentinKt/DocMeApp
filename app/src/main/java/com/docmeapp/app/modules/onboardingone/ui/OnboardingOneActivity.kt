package com.docmeapp.app.modules.onboardingone.ui

import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityOnboardingOneBinding
import com.docmeapp.app.modules.onboardingfour.ui.OnboardingFourActivity
import com.docmeapp.app.modules.onboardingone.`data`.viewmodel.OnboardingOneVM
import com.docmeapp.app.modules.onboardingtwo.ui.OnboardingTwoActivity
import kotlin.String
import kotlin.Unit

class OnboardingOneActivity :
    BaseActivity<ActivityOnboardingOneBinding>(R.layout.activity_onboarding_one) {
  private val viewModel: OnboardingOneVM by viewModels<OnboardingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSkip.setOnClickListener {
      val destIntent = OnboardingFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = OnboardingTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_ONE_ACTIVITY"

  }
}
