package com.docmeapp.app.modules.location.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.location.`data`.model.LocationModel
import org.koin.core.KoinComponent

class LocationVM : ViewModel(), KoinComponent {
  val locationModel: MutableLiveData<LocationModel> = MutableLiveData(LocationModel())

  var navArguments: Bundle? = null
}
