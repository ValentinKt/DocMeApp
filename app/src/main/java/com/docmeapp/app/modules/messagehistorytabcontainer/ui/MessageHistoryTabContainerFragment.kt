package com.docmeapp.app.modules.messagehistorytabcontainer.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseFragment
import com.docmeapp.app.databinding.FragmentMessageHistoryTabContainerBinding
import com.docmeapp.app.modules.messagehistorytabcontainer.`data`.viewmodel.MessageHistoryTabContainerVM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class MessageHistoryTabContainerFragment :
    BaseFragment<FragmentMessageHistoryTabContainerBinding>(R.layout.fragment_message_history_tab_container)
    {
  private val viewModel: MessageHistoryTabContainerVM by viewModels<MessageHistoryTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.messageHistoryTabContainerVM = viewModel
    val adapter = MessageHistoryTabContainerFragmentPagerAdapter(childFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup125,binding.viewPagerTabbarview) { tab, position ->
      tab.text = MessageHistoryTabContainerFragmentPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "MESSAGE_HISTORY_TAB_CONTAINER_FRAGMENT"


      fun getInstance(bundle: Bundle?): MessageHistoryTabContainerFragment {
        val fragment = MessageHistoryTabContainerFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
