package com.docmeapp.app.modules.articles.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.databinding.ActivityArticlesBinding
import com.docmeapp.app.modules.articles.`data`.model.Listrectangle460RowModel
import com.docmeapp.app.modules.articles.`data`.model.Listunsplash86rvjm9zowyRowModel
import com.docmeapp.app.modules.articles.`data`.viewmodel.ArticlesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ArticlesActivity : BaseActivity<ActivityArticlesBinding>(R.layout.activity_articles) {
  private val viewModel: ArticlesVM by viewModels<ArticlesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangle460Adapter =
    Listrectangle460Adapter(viewModel.listrectangle460List.value?:mutableListOf())
    binding.recyclerListrectangle460.adapter = listrectangle460Adapter
    listrectangle460Adapter.setOnItemClickListener(
    object : Listrectangle460Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle460RowModel) {
        onClickRecyclerListrectangle460(view, position, item)
      }
    }
    )
    viewModel.listrectangle460List.observe(this) {
      listrectangle460Adapter.updateData(it)
    }
    val listunsplash86rvjm9zowyAdapter =
    Listunsplash86rvjm9zowyAdapter(viewModel.listunsplash86rvjm9zowyList.value?:mutableListOf())
    binding.recyclerListunsplash86rvjm9zowy.adapter = listunsplash86rvjm9zowyAdapter
    listunsplash86rvjm9zowyAdapter.setOnItemClickListener(
    object : Listunsplash86rvjm9zowyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listunsplash86rvjm9zowyRowModel) {
        onClickRecyclerListunsplash86rvjm9zowy(view, position, item)
      }
    }
    )
    viewModel.listunsplash86rvjm9zowyList.observe(this) {
      listunsplash86rvjm9zowyAdapter.updateData(it)
    }
    binding.articlesVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListrectangle460(
    view: View,
    position: Int,
    item: Listrectangle460RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListunsplash86rvjm9zowy(
    view: View,
    position: Int,
    item: Listunsplash86rvjm9zowyRowModel
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
      const val TAG: String = "ARTICLES_ACTIVITY"

    }
  }
