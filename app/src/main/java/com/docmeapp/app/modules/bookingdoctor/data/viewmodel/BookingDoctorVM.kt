package com.docmeapp.app.modules.bookingdoctor.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.bookingdoctor.`data`.model.BookingDoctorModel
import org.koin.core.KoinComponent

class BookingDoctorVM : ViewModel(), KoinComponent {
  val bookingDoctorModel: MutableLiveData<BookingDoctorModel> =
      MutableLiveData(BookingDoctorModel())

  var navArguments: Bundle? = null
}
