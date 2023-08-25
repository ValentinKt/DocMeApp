package com.docmeapp.app.modules.resetpasswordverifycode.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordVerifyCodeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterVerification: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_verificat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_enter_code_that)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidntreceivetheOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_receive_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResend: String? = MyApp.getInstance().resources.getString(R.string.lbl_resend)

)
