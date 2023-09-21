package com.docmeapp.app.modules.drugsdetail.ui

import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityDrugsDetailBinding
import com.docmeapp.app.modules.drugsdetail.`data`.viewmodel.DrugsDetailVM
import com.docmeapp.app.modules.mycart.ui.MyCartActivity
import kotlin.String
import kotlin.Unit

class DrugsDetailActivity : BaseActivity<ActivityDrugsDetailBinding>(R.layout.activity_drugs_detail)
    {
  private val viewModel: DrugsDetailVM by viewModels<DrugsDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.drugsDetailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnBuynow.setOnClickListener {
      val destIntent = MyCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCartOne.setOnClickListener {
      val destIntent = MyCartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DRUGS_DETAIL_ACTIVITY"

  }
}
