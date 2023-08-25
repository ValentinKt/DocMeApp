package com.docmeapp.app.modules.mycart.`data`.model

import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import kotlin.String

data class MyCartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentDetail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_subtotal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_98)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaxes: String? = MyApp.getInstance().resources.getString(R.string.lbl_taxes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_26_98)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVISA: String? = MyApp.getInstance().resources.getString(R.string.lbl_visa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_26_982)

)
