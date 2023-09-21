package com.docmeapp.app.modules.loginsuccess.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class LoginSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYeayWelcomeBackOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_yeay_welcome_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnceagainyoulogin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_once_again_you)

)
