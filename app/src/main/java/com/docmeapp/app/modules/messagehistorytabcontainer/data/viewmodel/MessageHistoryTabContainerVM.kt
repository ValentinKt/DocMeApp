package com.docmeapp.app.modules.messagehistorytabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.messagehistorytabcontainer.`data`.model.MessageHistoryTabContainerModel
import org.koin.core.KoinComponent

class MessageHistoryTabContainerVM : ViewModel(), KoinComponent {
  val messageHistoryTabContainerModel: MutableLiveData<MessageHistoryTabContainerModel> =
      MutableLiveData(MessageHistoryTabContainerModel())

  var navArguments: Bundle? = null
}
