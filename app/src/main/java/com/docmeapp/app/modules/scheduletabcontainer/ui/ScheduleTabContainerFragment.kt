package com.docmeapp.app.modules.scheduletabcontainer.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseFragment
import com.docmeapp.app.databinding.FragmentScheduleTabContainerBinding
import com.docmeapp.app.modules.scheduletabcontainer.`data`.viewmodel.ScheduleTabContainerVM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class ScheduleTabContainerFragment :
    BaseFragment<FragmentScheduleTabContainerBinding>(R.layout.fragment_schedule_tab_container) {
  private val viewModel: ScheduleTabContainerVM by viewModels<ScheduleTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.scheduleTabContainerVM = viewModel
    val adapter = ScheduleTabContainerFragmentPagerAdapter(childFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup125,binding.viewPagerTabbarview) { tab, position ->
      tab.text = ScheduleTabContainerFragmentPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SCHEDULE_TAB_CONTAINER_FRAGMENT"


      fun getInstance(bundle: Bundle?): ScheduleTabContainerFragment {
        val fragment = ScheduleTabContainerFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
