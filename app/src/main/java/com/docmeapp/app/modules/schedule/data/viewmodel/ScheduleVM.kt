package com.docmeapp.app.modules.schedule.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.schedule.`data`.model.ScheduleModel
import com.docmeapp.app.modules.schedule.`data`.model.ScheduleRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScheduleVM : ViewModel(), KoinComponent {
  val scheduleModel: MutableLiveData<ScheduleModel> = MutableLiveData(ScheduleModel())

  var navArguments: Bundle? = null

  val scheduleList: MutableLiveData<MutableList<ScheduleRowModel>> =
      MutableLiveData(mutableListOf())
}
