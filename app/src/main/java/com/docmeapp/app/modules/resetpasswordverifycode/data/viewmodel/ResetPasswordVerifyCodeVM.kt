package com.docmeapp.app.modules.resetpasswordverifycode.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.resetpasswordverifycode.`data`.model.ResetPasswordVerifyCodeModel
import org.koin.core.KoinComponent

class ResetPasswordVerifyCodeVM : ViewModel(), KoinComponent {
  val resetPasswordVerifyCodeModel: MutableLiveData<ResetPasswordVerifyCodeModel> =
      MutableLiveData(ResetPasswordVerifyCodeModel())

  var navArguments: Bundle? = null
}
