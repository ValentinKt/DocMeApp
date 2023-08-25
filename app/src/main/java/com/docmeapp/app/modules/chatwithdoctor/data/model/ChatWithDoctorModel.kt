package com.docmeapp.app.modules.chatwithdoctor.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ChatWithDoctorModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHorizonOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsultionStartOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consultion_star)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanconsult: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_consult)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHorizonThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_min_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloHowcani: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_how_can)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_i_have_sufferin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHorizonFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_min_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOkDoyouhave: String? = MyApp.getInstance().resources.getString(R.string.msg_ok_do_you_have)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIdonthaveany: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_don_t_have_an2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHorizonSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_hori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnline: String? = MyApp.getInstance().resources.getString(R.string.lbl_online)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTypemessageValue: String? = null
)
