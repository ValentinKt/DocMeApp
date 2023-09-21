package com.docmeapp.app.modules.doctordetail.ui

import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityDoctorDetailBinding
import com.docmeapp.app.modules.bookingdoctor.ui.BookingDoctorActivity
import com.docmeapp.app.modules.doctordetail.`data`.viewmodel.DoctorDetailVM
import kotlin.String
import kotlin.Unit

class DoctorDetailActivity :
    BaseActivity<ActivityDoctorDetailBinding>(R.layout.activity_doctor_detail) {
  private val viewModel: DoctorDetailVM by viewModels<DoctorDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.doctorDetailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnBookapointmentOne.setOnClickListener {
      val destIntent = BookingDoctorActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DOCTOR_DETAIL_ACTIVITY"

  }
}
