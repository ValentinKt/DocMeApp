package com.docmeapp.app.modules.homecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.homecontainer.`data`.model.HomeContainerModel
import org.koin.core.KoinComponent

class HomeContainerVM : ViewModel(), KoinComponent {
  val homeContainerModel: MutableLiveData<HomeContainerModel> =
      MutableLiveData(HomeContainerModel())

  var navArguments: Bundle? = null
}
