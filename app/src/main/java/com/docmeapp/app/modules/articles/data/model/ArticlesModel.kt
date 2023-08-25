package com.docmeapp.app.modules.articles.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ArticlesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArticles: String? = MyApp.getInstance().resources.getString(R.string.lbl_articles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularArticlesOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_popular_article)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_covid_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTwentyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_diet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTwentyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_fitness)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingArticles: String? =
      MyApp.getInstance().resources.getString(R.string.msg_trending_articl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRelatedArticlesOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_related_article)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
