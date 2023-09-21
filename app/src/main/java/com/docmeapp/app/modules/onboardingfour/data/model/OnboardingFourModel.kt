package com.docmeapp.app.modules.onboardingfour.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelthio: String? = MyApp.getInstance().resources.getString(R.string.lbl_helthio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.msg_let_s_get_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogintoenjoytheOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_enjoy)

)
