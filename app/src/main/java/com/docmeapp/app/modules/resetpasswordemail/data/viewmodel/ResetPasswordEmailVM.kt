package com.docmeapp.app.modules.resetpasswordemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.resetpasswordemail.`data`.model.ResetPasswordEmailModel
import org.koin.core.KoinComponent

class ResetPasswordEmailVM : ViewModel(), KoinComponent {
  val resetPasswordEmailModel: MutableLiveData<ResetPasswordEmailModel> =
      MutableLiveData(ResetPasswordEmailModel())

  var navArguments: Bundle? = null
}
