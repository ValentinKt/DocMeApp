package com.docmeapp.app.modules.onboardingtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.onboardingtwo.`data`.model.OnboardingTwoModel
import org.koin.core.KoinComponent

class OnboardingTwoVM : ViewModel(), KoinComponent {
  val onboardingTwoModel: MutableLiveData<OnboardingTwoModel> =
      MutableLiveData(OnboardingTwoModel())

  var navArguments: Bundle? = null
}
