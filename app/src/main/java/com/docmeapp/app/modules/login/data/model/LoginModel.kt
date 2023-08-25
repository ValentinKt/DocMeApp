package com.docmeapp.app.modules.login.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGoogle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithAppleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_ap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithFacebook: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
