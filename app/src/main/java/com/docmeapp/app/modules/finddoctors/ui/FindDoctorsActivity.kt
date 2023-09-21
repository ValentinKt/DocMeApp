package com.docmeapp.app.modules.finddoctors.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityFindDoctorsBinding
import com.docmeapp.app.modules.finddoctors.`data`.model.DoctorsRowModel
import com.docmeapp.app.modules.finddoctors.`data`.model.ListuserRowModel
import com.docmeapp.app.modules.finddoctors.`data`.viewmodel.FindDoctorsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FindDoctorsActivity : BaseActivity<ActivityFindDoctorsBinding>(R.layout.activity_find_doctors)
    {
  private val viewModel: FindDoctorsVM by viewModels<FindDoctorsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listuserAdapter = ListuserAdapter(viewModel.listuserList.value?:mutableListOf())
    binding.recyclerListuser.adapter = listuserAdapter
    listuserAdapter.setOnItemClickListener(
    object : ListuserAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListuserRowModel) {
        onClickRecyclerListuser(view, position, item)
      }
    }
    )
    viewModel.listuserList.observe(this) {
      listuserAdapter.updateData(it)
    }
    val doctorsAdapter = DoctorsAdapter(viewModel.doctorsList.value?:mutableListOf())
    binding.recyclerDoctors.adapter = doctorsAdapter
    doctorsAdapter.setOnItemClickListener(
    object : DoctorsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DoctorsRowModel) {
        onClickRecyclerDoctors(view, position, item)
      }
    }
    )
    viewModel.doctorsList.observe(this) {
      doctorsAdapter.updateData(it)
    }
    binding.findDoctorsVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListuser(
    view: View,
    position: Int,
    item: ListuserRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerDoctors(
    view: View,
    position: Int,
    item: DoctorsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "FIND_DOCTORS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, FindDoctorsActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
