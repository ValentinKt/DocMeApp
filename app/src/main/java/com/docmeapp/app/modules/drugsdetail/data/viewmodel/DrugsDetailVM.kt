package com.docmeapp.app.modules.drugsdetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.drugsdetail.`data`.model.DrugsDetailModel
import org.koin.core.KoinComponent

class DrugsDetailVM : ViewModel(), KoinComponent {
  val drugsDetailModel: MutableLiveData<DrugsDetailModel> = MutableLiveData(DrugsDetailModel())

  var navArguments: Bundle? = null
}
