package com.docmeapp.app.modules.audiocall.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.audiocall.`data`.model.AudioCallModel
import org.koin.core.KoinComponent

class AudioCallVM : ViewModel(), KoinComponent {
  val audioCallModel: MutableLiveData<AudioCallModel> = MutableLiveData(AudioCallModel())

  var navArguments: Bundle? = null
}
