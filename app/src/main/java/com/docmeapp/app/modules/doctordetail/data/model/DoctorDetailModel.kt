package com.docmeapp.app.modules.doctordetail.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class DoctorDetailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDoctorDetail: String? = MyApp.getInstance().resources.getString(R.string.lbl_doctor_detail)
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
  var txtAbout: String? = MyApp.getInstance().resources.getString(R.string.lbl_about)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMon: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_21)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTue: String? = MyApp.getInstance().resources.getString(R.string.lbl_tue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWed: String? = MyApp.getInstance().resources.getString(R.string.lbl_wed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThu: String? = MyApp.getInstance().resources.getString(R.string.lbl_thu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFri: String? = MyApp.getInstance().resources.getString(R.string.lbl_fri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSat: String? = MyApp.getInstance().resources.getString(R.string.lbl_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_26)

)
