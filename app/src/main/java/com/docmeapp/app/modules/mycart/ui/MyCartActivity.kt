package com.docmeapp.app.modules.mycart.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityMyCartBinding
import com.docmeapp.app.modules.mycart.`data`.model.MycartRowModel
import com.docmeapp.app.modules.mycart.`data`.viewmodel.MyCartVM
import com.docmeapp.app.modules.mycartpopup.ui.MyCartPopUpDialog
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyCartActivity : BaseActivity<ActivityMyCartBinding>(R.layout.activity_my_cart) {
  private val viewModel: MyCartVM by viewModels<MyCartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val mycartAdapter = MycartAdapter(viewModel.mycartList.value?:mutableListOf())
    binding.recyclerMycart.adapter = mycartAdapter
    mycartAdapter.setOnItemClickListener(
    object : MycartAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MycartRowModel) {
        onClickRecyclerMycart(view, position, item)
      }
    }
    )
    viewModel.mycartList.observe(this) {
      mycartAdapter.updateData(it)
    }
    binding.myCartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCheckout.setOnClickListener {
      val destFragment = MyCartPopUpDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, MyCartPopUpDialog.TAG)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerMycart(
    view: View,
    position: Int,
    item: MycartRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_CART_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyCartActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
