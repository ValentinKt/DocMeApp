package com.docmeapp.app.modules.finddoctors.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.finddoctors.`data`.model.DoctorsRowModel
import com.docmeapp.app.modules.finddoctors.`data`.model.FindDoctorsModel
import com.docmeapp.app.modules.finddoctors.`data`.model.ListuserRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FindDoctorsVM : ViewModel(), KoinComponent {
  val findDoctorsModel: MutableLiveData<FindDoctorsModel> = MutableLiveData(FindDoctorsModel())

  var navArguments: Bundle? = null

  val listuserList: MutableLiveData<MutableList<ListuserRowModel>> =
      MutableLiveData(mutableListOf())

  val doctorsList: MutableLiveData<MutableList<DoctorsRowModel>> = MutableLiveData(mutableListOf())
}
