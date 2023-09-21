package com.docmeapp.app.modules.resetpasswordemailtabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.resetpasswordemailtabcontainer.`data`.model.ResetPasswordEmailTabContainerModel
import org.koin.core.KoinComponent

class ResetPasswordEmailTabContainerVM : ViewModel(), KoinComponent {
  val resetPasswordEmailTabContainerModel: MutableLiveData<ResetPasswordEmailTabContainerModel> =
      MutableLiveData(ResetPasswordEmailTabContainerModel())

  var navArguments: Bundle? = null
}
