package com.docmeapp.app.modules.pharmacy.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class ListcalciumllysinRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProductname: String? = MyApp.getInstance().resources.getString(R.string.lbl_obh_combi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeasurement: String? = MyApp.getInstance().resources.getString(R.string.lbl_75ml)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_99)

)
