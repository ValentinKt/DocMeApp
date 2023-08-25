package com.docmeapp.app.modules.pharmacy.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowListcalciumllysinBinding
import com.docmeapp.app.modules.pharmacy.`data`.model.ListcalciumllysinRowModel
import kotlin.Int
import kotlin.collections.List

class ListcalciumllysinAdapter(
  var list: List<ListcalciumllysinRowModel>
) : RecyclerView.Adapter<ListcalciumllysinAdapter.RowListcalciumllysinVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcalciumllysinVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcalciumllysin,parent,false)
    return RowListcalciumllysinVH(view)
  }

  override fun onBindViewHolder(holder: RowListcalciumllysinVH, position: Int) {
    val listcalciumllysinRowModel = ListcalciumllysinRowModel()
    // TODO uncomment following line after integration with data source
    // val listcalciumllysinRowModel = list[position]
    holder.binding.listcalciumllysinRowModel = listcalciumllysinRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcalciumllysinRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListcalciumllysinRowModel
    ) {
    }
  }

  inner class RowListcalciumllysinVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcalciumllysinBinding = RowListcalciumllysinBinding.bind(itemView)
  }
}
