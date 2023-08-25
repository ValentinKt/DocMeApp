package com.docmeapp.app.modules.pharmacy.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class PharmacyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPharmacy: String? = MyApp.getInstance().resources.getString(R.string.lbl_pharmacy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductonSale: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_product_on_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
