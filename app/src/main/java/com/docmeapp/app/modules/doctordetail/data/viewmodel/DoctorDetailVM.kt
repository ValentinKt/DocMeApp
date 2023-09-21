package com.docmeapp.app.modules.doctordetail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.doctordetail.`data`.model.DoctorDetailModel
import org.koin.core.KoinComponent

class DoctorDetailVM : ViewModel(), KoinComponent {
  val doctorDetailModel: MutableLiveData<DoctorDetailModel> = MutableLiveData(DoctorDetailModel())

  var navArguments: Bundle? = null
}
