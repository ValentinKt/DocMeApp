package com.docmeapp.app.modules.finddoctors.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class FindDoctorsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindDoctors: String? = MyApp.getInstance().resources.getString(R.string.lbl_find_doctors)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommendedDoctors: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_doc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHorizonOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChardiologist: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_chardiologist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_800m_away)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourRecentDoctors: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_recent_doc)

)
