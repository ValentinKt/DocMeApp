package com.docmeapp.app.modules.articles.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.docmeapp.app.modules.articles.`data`.model.ArticlesModel
import com.docmeapp.app.modules.articles.`data`.model.Listrectangle460RowModel
import com.docmeapp.app.modules.articles.`data`.model.Listunsplash86rvjm9zowyRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ArticlesVM : ViewModel(), KoinComponent {
  val articlesModel: MutableLiveData<ArticlesModel> = MutableLiveData(ArticlesModel())

  var navArguments: Bundle? = null

  val listrectangle460List: MutableLiveData<MutableList<Listrectangle460RowModel>> =
      MutableLiveData(mutableListOf())

  val listunsplash86rvjm9zowyList: MutableLiveData<MutableList<Listunsplash86rvjm9zowyRowModel>> =
      MutableLiveData(mutableListOf())
}
