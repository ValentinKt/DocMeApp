package com.docmeapp.app.modules.bookingdoctorsuccess.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class BookingDoctorSuccessModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentSuccess: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourpaymenthas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_payment_ha)

)
