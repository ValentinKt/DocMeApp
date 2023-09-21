package com.docmeapp.app.modules.splashscreen.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelthio: String? = MyApp.getInstance().resources.getString(R.string.lbl_helthio)

)
