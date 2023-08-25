package com.docmeapp.app.modules.videocall.ui

import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityVideoCallBinding
import com.docmeapp.app.modules.videocall.`data`.viewmodel.VideoCallVM
import kotlin.String
import kotlin.Unit

class VideoCallActivity : BaseActivity<ActivityVideoCallBinding>(R.layout.activity_video_call) {
  private val viewModel: VideoCallVM by viewModels<VideoCallVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.videoCallVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "VIDEO_CALL_ACTIVITY"

  }
}
