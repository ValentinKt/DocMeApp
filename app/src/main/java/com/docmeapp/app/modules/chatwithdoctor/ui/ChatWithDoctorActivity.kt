package com.docmeapp.app.modules.chatwithdoctor.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityChatWithDoctorBinding
import com.docmeapp.app.modules.audiocall.ui.AudioCallActivity
import com.docmeapp.app.modules.chatwithdoctor.`data`.viewmodel.ChatWithDoctorVM
import kotlin.String
import kotlin.Unit

class ChatWithDoctorActivity :
    BaseActivity<ActivityChatWithDoctorBinding>(R.layout.activity_chat_with_doctor) {
  private val viewModel: ChatWithDoctorVM by viewModels<ChatWithDoctorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatWithDoctorVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCall.setOnClickListener {
      val destIntent = AudioCallActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHAT_WITH_DOCTOR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatWithDoctorActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
