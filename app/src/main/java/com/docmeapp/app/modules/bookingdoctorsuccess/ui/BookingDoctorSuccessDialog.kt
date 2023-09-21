package com.docmeapp.app.modules.bookingdoctorsuccess.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseDialogFragment
import com.docmeapp.app.databinding.DialogBookingDoctorSuccessBinding
import com.docmeapp.app.modules.bookingdoctorsuccess.`data`.viewmodel.BookingDoctorSuccessVM
import com.docmeapp.app.modules.chatwithdoctor.ui.ChatWithDoctorActivity
import kotlin.String
import kotlin.Unit

class BookingDoctorSuccessDialog :
    BaseDialogFragment<DialogBookingDoctorSuccessBinding>(R.layout.dialog_booking_doctor_success) {
  private val viewModel: BookingDoctorSuccessVM by viewModels<BookingDoctorSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bookingDoctorSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnChatwithdoctorOne.setOnClickListener {
      val destIntent = ChatWithDoctorActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "BOOKING_DOCTOR_SUCCESS_DIALOG"


    fun getInstance(bundle: Bundle?): BookingDoctorSuccessDialog {
      val fragment = BookingDoctorSuccessDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
