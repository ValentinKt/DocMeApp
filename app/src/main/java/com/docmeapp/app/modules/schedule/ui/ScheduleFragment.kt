package com.docmeapp.app.modules.schedule.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseFragment
import com.docmeapp.app.databinding.FragmentScheduleBinding
import com.docmeapp.app.modules.schedule.`data`.model.ScheduleRowModel
import com.docmeapp.app.modules.schedule.`data`.viewmodel.ScheduleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScheduleFragment : BaseFragment<FragmentScheduleBinding>(R.layout.fragment_schedule) {
  private val viewModel: ScheduleVM by viewModels<ScheduleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val scheduleAdapter = ScheduleAdapter(viewModel.scheduleList.value?:mutableListOf())
    binding.recyclerSchedule.adapter = scheduleAdapter
    scheduleAdapter.setOnItemClickListener(
    object : ScheduleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ScheduleRowModel) {
        onClickRecyclerSchedule(view, position, item)
      }
    }
    )
    viewModel.scheduleList.observe(requireActivity()) {
      scheduleAdapter.updateData(it)
    }
    binding.scheduleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSchedule(
    view: View,
    position: Int,
    item: ScheduleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SCHEDULE_FRAGMENT"

  }
}
