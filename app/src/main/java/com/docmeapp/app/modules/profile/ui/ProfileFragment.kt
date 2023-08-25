package com.docmeapp.app.modules.profile.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseFragment
import com.docmeapp.app.appcomponents.views.ImagePickerFragmentDialog
import com.docmeapp.app.databinding.FragmentProfileBinding
import com.docmeapp.app.modules.logoutpopup.ui.LogOutPopUpDialog
import com.docmeapp.app.modules.profile.`data`.model.ProfileRowModel
import com.docmeapp.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileFragment : BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val profileAdapter = ProfileAdapter(viewModel.profileList.value?:mutableListOf())
    binding.recyclerProfile.adapter = profileAdapter
    profileAdapter.setOnItemClickListener(
    object : ProfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileRowModel) {
        onClickRecyclerProfile(view, position, item)
      }
    }
    )
    viewModel.profileList.observe(requireActivity()) {
      profileAdapter.updateData(it)
    }
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(childFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.linearLogout.setOnClickListener {
      val destFragment = LogOutPopUpDialog.getInstance(null)
      destFragment.show(requireActivity().supportFragmentManager, LogOutPopUpDialog.TAG)
    }
  }

  fun onClickRecyclerProfile(
    view: View,
    position: Int,
    item: ProfileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ProfileFragment {
      val fragment = ProfileFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
