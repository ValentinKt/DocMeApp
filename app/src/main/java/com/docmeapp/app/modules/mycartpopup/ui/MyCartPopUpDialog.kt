package com.docmeapp.app.modules.mycartpopup.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseDialogFragment
import com.docmeapp.app.databinding.DialogMyCartPopUpBinding
import com.docmeapp.app.modules.homecontainer.ui.HomeContainerActivity
import com.docmeapp.app.modules.mycartpopup.`data`.viewmodel.MyCartPopUpVM
import kotlin.String
import kotlin.Unit

class MyCartPopUpDialog :
    BaseDialogFragment<DialogMyCartPopUpBinding>(R.layout.dialog_my_cart_pop_up) {
  private val viewModel: MyCartPopUpVM by viewModels<MyCartPopUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.myCartPopUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackhome.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "MY_CART_POP_UP_DIALOG"


    fun getInstance(bundle: Bundle?): MyCartPopUpDialog {
      val fragment = MyCartPopUpDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
