package com.docmeapp.app.modules.createnewpasswordsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.createnewpasswordsuccess.`data`.model.CreateNewPasswordSuccessModel
import org.koin.core.KoinComponent

class CreateNewPasswordSuccessVM : ViewModel(), KoinComponent {
  val createNewPasswordSuccessModel: MutableLiveData<CreateNewPasswordSuccessModel> =
      MutableLiveData(CreateNewPasswordSuccessModel())

  var navArguments: Bundle? = null
}
