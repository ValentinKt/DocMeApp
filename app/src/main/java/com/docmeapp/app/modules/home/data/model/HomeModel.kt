package com.docmeapp.app.modules.home.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindyourdesire: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_your_desir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDoctor: String? = MyApp.getInstance().resources.getString(R.string.lbl_doctor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPharmacy: String? = MyApp.getInstance().resources.getString(R.string.lbl_pharmacy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHospital: String? = MyApp.getInstance().resources.getString(R.string.lbl_hospital)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbulance: String? = MyApp.getInstance().resources.getString(R.string.lbl_ambulance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEarlyprotectionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_early_protectio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopDoctor: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_doctor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
