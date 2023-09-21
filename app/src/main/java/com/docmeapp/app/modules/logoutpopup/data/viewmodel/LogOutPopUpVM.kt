package com.docmeapp.app.modules.logoutpopup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.logoutpopup.`data`.model.LogOutPopUpModel
import org.koin.core.KoinComponent

class LogOutPopUpVM : ViewModel(), KoinComponent {
  val logOutPopUpModel: MutableLiveData<LogOutPopUpModel> = MutableLiveData(LogOutPopUpModel())

  var navArguments: Bundle? = null
}
