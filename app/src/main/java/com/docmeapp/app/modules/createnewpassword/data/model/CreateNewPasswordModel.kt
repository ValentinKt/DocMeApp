package com.docmeapp.app.modules.createnewpassword.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class CreateNewPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNewPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyournew: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputOneValue: String? = null
)
