package com.docmeapp.app.modules.schedule.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ScheduleRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDoctorname: String? = MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpecialty: String? = MyApp.getInstance().resources.getString(R.string.lbl_chardiologist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_26_06_2022)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_30_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStatus: String? = MyApp.getInstance().resources.getString(R.string.lbl_confirmed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup126: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup127: String? = MyApp.getInstance().resources.getString(R.string.lbl_reschedule)

)
