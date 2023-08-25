package com.docmeapp.app.modules.onboardingtwo.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.msg_find_a_lot_of_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)

)
