package com.docmeapp.app.modules.profile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.profile.`data`.model.ProfileModel
import com.docmeapp.app.modules.profile.`data`.model.ProfileRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileVM : ViewModel(), KoinComponent {
  val profileModel: MutableLiveData<ProfileModel> = MutableLiveData(ProfileModel())

  var navArguments: Bundle? = null

  val profileList: MutableLiveData<MutableList<ProfileRowModel>> = MutableLiveData(mutableListOf())
}
