package com.docmeapp.app.modules.profile.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeartrate: String? = MyApp.getInstance().resources.getString(R.string.lbl_heart_rate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt215bpm: String? = MyApp.getInstance().resources.getString(R.string.lbl_215bpm)

)
