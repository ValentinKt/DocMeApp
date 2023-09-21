package com.docmeapp.app.modules.pharmacy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.pharmacy.`data`.model.ListcalciumllysinRowModel
import com.docmeapp.app.modules.pharmacy.`data`.model.Listef58faa9a71e47eRowModel
import com.docmeapp.app.modules.pharmacy.`data`.model.PharmacyModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PharmacyVM : ViewModel(), KoinComponent {
  val pharmacyModel: MutableLiveData<PharmacyModel> = MutableLiveData(PharmacyModel())

  var navArguments: Bundle? = null

  val listef58faa9a71e47eList: MutableLiveData<MutableList<Listef58faa9a71e47eRowModel>> =
      MutableLiveData(mutableListOf())

  val listcalciumllysinList: MutableLiveData<MutableList<ListcalciumllysinRowModel>> =
      MutableLiveData(mutableListOf())
}
