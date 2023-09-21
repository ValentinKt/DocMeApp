package com.docmeapp.app.modules.videocall.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class VideoCallModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHorizonOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_00_05_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSwipebacktomenuOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swipe_back_to_m)

)
