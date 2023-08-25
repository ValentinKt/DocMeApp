package com.docmeapp.app.modules.resetpasswordemailtabcontainer.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordEmailTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotYourPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_your_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryouremail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_emai2)

)
