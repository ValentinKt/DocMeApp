package com.docmeapp.app.modules.resetpasswordphone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.resetpasswordphone.`data`.model.ResetPasswordPhoneModel
import org.koin.core.KoinComponent

class ResetPasswordPhoneVM : ViewModel(), KoinComponent {
  val resetPasswordPhoneModel: MutableLiveData<ResetPasswordPhoneModel> =
      MutableLiveData(ResetPasswordPhoneModel())

  var navArguments: Bundle? = null
}
