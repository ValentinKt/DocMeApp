package com.docmeapp.app.modules.onboardingthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.onboardingthree.`data`.model.OnboardingThreeModel
import org.koin.core.KoinComponent

class OnboardingThreeVM : ViewModel(), KoinComponent {
  val onboardingThreeModel: MutableLiveData<OnboardingThreeModel> =
      MutableLiveData(OnboardingThreeModel())

  var navArguments: Bundle? = null
}
