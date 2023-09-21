package com.docmeapp.app.modules.messagehistory.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListpexelscedricfRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSymptoms: String? = MyApp.getInstance().resources.getString(R.string.msg_i_don_t_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTemperature: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeverity: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
