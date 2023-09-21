package com.docmeapp.app.modules.profile.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAmeliaRenata: String? = MyApp.getInstance().resources.getString(R.string.lbl_amelia_renata)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMySaved: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_saved)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppointmnet: String? = MyApp.getInstance().resources.getString(R.string.lbl_appointmnet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFAQs: String? = MyApp.getInstance().resources.getString(R.string.lbl_faqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout2)

)
