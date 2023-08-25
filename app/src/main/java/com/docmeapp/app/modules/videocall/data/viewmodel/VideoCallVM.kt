package com.docmeapp.app.modules.videocall.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.videocall.`data`.model.VideoCallModel
import org.koin.core.KoinComponent

class VideoCallVM : ViewModel(), KoinComponent {
  val videoCallModel: MutableLiveData<VideoCallModel> = MutableLiveData(VideoCallModel())

  var navArguments: Bundle? = null
}
