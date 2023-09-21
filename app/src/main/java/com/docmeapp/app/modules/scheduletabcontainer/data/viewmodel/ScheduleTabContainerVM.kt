package com.docmeapp.app.modules.scheduletabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.scheduletabcontainer.`data`.model.ScheduleTabContainerModel
import org.koin.core.KoinComponent

class ScheduleTabContainerVM : ViewModel(), KoinComponent {
  val scheduleTabContainerModel: MutableLiveData<ScheduleTabContainerModel> =
      MutableLiveData(ScheduleTabContainerModel())

  var navArguments: Bundle? = null
}
