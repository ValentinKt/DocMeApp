package com.docmeapp.app.modules.bookingdoctor.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityBookingDoctorBinding
import com.docmeapp.app.modules.bookingdoctor.`data`.viewmodel.BookingDoctorVM
import com.docmeapp.app.modules.bookingdoctorsuccess.ui.BookingDoctorSuccessDialog
import kotlin.String
import kotlin.Unit

class BookingDoctorActivity :
    BaseActivity<ActivityBookingDoctorBinding>(R.layout.activity_booking_doctor) {
  private val viewModel: BookingDoctorVM by viewModels<BookingDoctorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookingDoctorVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBooknow.setOnClickListener {
      val destFragment = BookingDoctorSuccessDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, BookingDoctorSuccessDialog.TAG)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BOOKING_DOCTOR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookingDoctorActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
