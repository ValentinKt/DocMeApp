package com.docmeapp.app.modules.messagehistory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.messagehistory.`data`.model.ListpexelscedricfRowModel
import com.docmeapp.app.modules.messagehistory.`data`.model.MessageHistoryModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MessageHistoryVM : ViewModel(), KoinComponent {
  val messageHistoryModel: MutableLiveData<MessageHistoryModel> =
      MutableLiveData(MessageHistoryModel())

  var navArguments: Bundle? = null

  val listpexelscedricfList: MutableLiveData<MutableList<ListpexelscedricfRowModel>> =
      MutableLiveData(mutableListOf())
}
