package com.docmeapp.app.modules.topdoctor.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityTopDoctorBinding
import com.docmeapp.app.modules.topdoctor.`data`.model.TopdoctorRowModel
import com.docmeapp.app.modules.topdoctor.`data`.viewmodel.TopDoctorVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TopDoctorActivity : BaseActivity<ActivityTopDoctorBinding>(R.layout.activity_top_doctor) {
  private val viewModel: TopDoctorVM by viewModels<TopDoctorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val topdoctorAdapter = TopdoctorAdapter(viewModel.topdoctorList.value?:mutableListOf())
    binding.recyclerTopdoctor.adapter = topdoctorAdapter
    topdoctorAdapter.setOnItemClickListener(
    object : TopdoctorAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TopdoctorRowModel) {
        onClickRecyclerTopdoctor(view, position, item)
      }
    }
    )
    viewModel.topdoctorList.observe(this) {
      topdoctorAdapter.updateData(it)
    }
    binding.topDoctorVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerTopdoctor(
    view: View,
    position: Int,
    item: TopdoctorRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TOP_DOCTOR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TopDoctorActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
