package com.docmeapp.app.modules.messagehistorytabcontainer.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class MessageHistoryTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMessage: String? = MyApp.getInstance().resources.getString(R.string.lbl_message)

)
