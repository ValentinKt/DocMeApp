package com.docmeapp.app.modules.signupsuccess.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouraccounthas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_account_ha)

)
