package com.docmeapp.app.modules.finddoctors.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class DoctorsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_marcus)

)
