package com.docmeapp.app.modules.location.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class LocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbulance: String? = MyApp.getInstance().resources.getString(R.string.lbl_ambulance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1111abcdRd102: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1111_abcd_rd_102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup2238Value: String? = null
)
