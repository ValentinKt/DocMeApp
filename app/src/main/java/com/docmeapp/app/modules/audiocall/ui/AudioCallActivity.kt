package com.docmeapp.app.modules.audiocall.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityAudioCallBinding
import com.docmeapp.app.modules.audiocall.`data`.viewmodel.AudioCallVM
import kotlin.String
import kotlin.Unit

class AudioCallActivity : BaseActivity<ActivityAudioCallBinding>(R.layout.activity_audio_call) {
  private val viewModel: AudioCallVM by viewModels<AudioCallVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.audioCallVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AUDIO_CALL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AudioCallActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
