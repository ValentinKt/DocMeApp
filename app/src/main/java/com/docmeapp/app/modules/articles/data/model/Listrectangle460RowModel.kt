package com.docmeapp.app.modules.articles.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class Listrectangle460RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup144: String? = MyApp.getInstance().resources.getString(R.string.lbl_covid_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComparingtheAstraZeneca: String? =
      MyApp.getInstance().resources.getString(R.string.msg_comparing_the_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJun122021: String? = MyApp.getInstance().resources.getString(R.string.lbl_jun_12_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_min_read)

)
