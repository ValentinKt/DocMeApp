package com.docmeapp.app.modules.messagehistory.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseFragment
import com.docmeapp.app.databinding.FragmentMessageHistoryBinding
import com.docmeapp.app.modules.messagehistory.`data`.model.ListpexelscedricfRowModel
import com.docmeapp.app.modules.messagehistory.`data`.viewmodel.MessageHistoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessageHistoryFragment :
    BaseFragment<FragmentMessageHistoryBinding>(R.layout.fragment_message_history) {
  private val viewModel: MessageHistoryVM by viewModels<MessageHistoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listpexelscedricfAdapter =
    ListpexelscedricfAdapter(viewModel.listpexelscedricfList.value?:mutableListOf())
    binding.recyclerListpexelscedricf.adapter = listpexelscedricfAdapter
    listpexelscedricfAdapter.setOnItemClickListener(
    object : ListpexelscedricfAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpexelscedricfRowModel) {
        onClickRecyclerListpexelscedricf(view, position, item)
      }
    }
    )
    viewModel.listpexelscedricfList.observe(requireActivity()) {
      listpexelscedricfAdapter.updateData(it)
    }
    binding.messageHistoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListpexelscedricf(
    view: View,
    position: Int,
    item: ListpexelscedricfRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MESSAGE_HISTORY_FRAGMENT"

  }
}
