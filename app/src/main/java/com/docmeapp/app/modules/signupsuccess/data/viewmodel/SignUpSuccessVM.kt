package com.docmeapp.app.modules.signupsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.signupsuccess.`data`.model.SignUpSuccessModel
import org.koin.core.KoinComponent

class SignUpSuccessVM : ViewModel(), KoinComponent {
  val signUpSuccessModel: MutableLiveData<SignUpSuccessModel> =
      MutableLiveData(SignUpSuccessModel())

  var navArguments: Bundle? = null
}
