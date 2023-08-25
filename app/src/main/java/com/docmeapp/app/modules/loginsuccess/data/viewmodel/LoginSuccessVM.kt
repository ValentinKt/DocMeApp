package com.docmeapp.app.modules.loginsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.loginsuccess.`data`.model.LoginSuccessModel
import org.koin.core.KoinComponent

class LoginSuccessVM : ViewModel(), KoinComponent {
  val loginSuccessModel: MutableLiveData<LoginSuccessModel> = MutableLiveData(LoginSuccessModel())

  var navArguments: Bundle? = null
}
