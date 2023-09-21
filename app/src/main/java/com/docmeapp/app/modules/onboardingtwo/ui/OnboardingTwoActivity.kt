package com.docmeapp.app.modules.onboardingtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityOnboardingTwoBinding
import com.docmeapp.app.modules.onboardingfour.ui.OnboardingFourActivity
import com.docmeapp.app.modules.onboardingthree.ui.OnboardingThreeActivity
import com.docmeapp.app.modules.onboardingtwo.`data`.viewmodel.OnboardingTwoVM
import kotlin.String
import kotlin.Unit

class OnboardingTwoActivity :
    BaseActivity<ActivityOnboardingTwoBinding>(R.layout.activity_onboarding_two) {
  private val viewModel: OnboardingTwoVM by viewModels<OnboardingTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSkip.setOnClickListener {
      val destIntent = OnboardingFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = OnboardingThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
