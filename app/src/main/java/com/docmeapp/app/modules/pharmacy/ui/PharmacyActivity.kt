package com.docmeapp.app.modules.pharmacy.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityPharmacyBinding
import com.docmeapp.app.modules.pharmacy.`data`.model.ListcalciumllysinRowModel
import com.docmeapp.app.modules.pharmacy.`data`.model.Listef58faa9a71e47eRowModel
import com.docmeapp.app.modules.pharmacy.`data`.viewmodel.PharmacyVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PharmacyActivity : BaseActivity<ActivityPharmacyBinding>(R.layout.activity_pharmacy) {
  private val viewModel: PharmacyVM by viewModels<PharmacyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listef58faa9a71e47eAdapter =
    Listef58faa9a71e47eAdapter(viewModel.listef58faa9a71e47eList.value?:mutableListOf())
    binding.recyclerListef58faa9a71e47e.adapter = listef58faa9a71e47eAdapter
    listef58faa9a71e47eAdapter.setOnItemClickListener(
    object : Listef58faa9a71e47eAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listef58faa9a71e47eRowModel) {
        onClickRecyclerListef58faa9a71e47e(view, position, item)
      }
    }
    )
    viewModel.listef58faa9a71e47eList.observe(this) {
      listef58faa9a71e47eAdapter.updateData(it)
    }
    val listcalciumllysinAdapter =
    ListcalciumllysinAdapter(viewModel.listcalciumllysinList.value?:mutableListOf())
    binding.recyclerListcalciumllysin.adapter = listcalciumllysinAdapter
    listcalciumllysinAdapter.setOnItemClickListener(
    object : ListcalciumllysinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcalciumllysinRowModel) {
        onClickRecyclerListcalciumllysin(view, position, item)
      }
    }
    )
    viewModel.listcalciumllysinList.observe(this) {
      listcalciumllysinAdapter.updateData(it)
    }
    binding.pharmacyVM = viewModel
    setUpWebViewCta()
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListef58faa9a71e47e(
    view: View,
    position: Int,
    item: Listef58faa9a71e47eRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListcalciumllysin(
    view: View,
    position: Int,
    item: ListcalciumllysinRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpWebViewCta(): Unit {
    binding.webViewCta.loadUrl("")
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
      const val TAG: String = "PHARMACY_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, PharmacyActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
