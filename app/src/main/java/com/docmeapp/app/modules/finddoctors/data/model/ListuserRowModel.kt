package com.docmeapp.app.modules.finddoctors.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListuserRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGeneral: String? = MyApp.getInstance().resources.getString(R.string.lbl_general)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLungs: String? = MyApp.getInstance().resources.getString(R.string.lbl_lungs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDentistvalue: String? = MyApp.getInstance().resources.getString(R.string.lbl_dentist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPsychiatristvalue: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_psychiatrist)

)
