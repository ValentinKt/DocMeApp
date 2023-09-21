package com.docmeapp.app.modules.mycartpopup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.mycartpopup.`data`.model.MyCartPopUpModel
import org.koin.core.KoinComponent

class MyCartPopUpVM : ViewModel(), KoinComponent {
  val myCartPopUpModel: MutableLiveData<MyCartPopUpModel> = MutableLiveData(MyCartPopUpModel())

  var navArguments: Bundle? = null
}
