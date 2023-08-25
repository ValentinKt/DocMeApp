package com.docmeapp.app.modules.bookingdoctorsuccess.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.bookingdoctorsuccess.`data`.model.BookingDoctorSuccessModel
import org.koin.core.KoinComponent

class BookingDoctorSuccessVM : ViewModel(), KoinComponent {
  val bookingDoctorSuccessModel: MutableLiveData<BookingDoctorSuccessModel> =
      MutableLiveData(BookingDoctorSuccessModel())

  var navArguments: Bundle? = null
}
