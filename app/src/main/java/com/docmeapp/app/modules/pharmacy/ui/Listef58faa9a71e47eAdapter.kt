package com.docmeapp.app.modules.pharmacy.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowListef58faa9a71e47eBinding
import com.docmeapp.app.modules.pharmacy.`data`.model.Listef58faa9a71e47eRowModel
import kotlin.Int
import kotlin.collections.List

class Listef58faa9a71e47eAdapter(
  var list: List<Listef58faa9a71e47eRowModel>
) : RecyclerView.Adapter<Listef58faa9a71e47eAdapter.RowListef58faa9a71e47eVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListef58faa9a71e47eVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listef58faa9a71e47e,parent,false)
    return RowListef58faa9a71e47eVH(view)
  }

  override fun onBindViewHolder(holder: RowListef58faa9a71e47eVH, position: Int) {
    val listef58faa9a71e47eRowModel = Listef58faa9a71e47eRowModel()
    // TODO uncomment following line after integration with data source
    // val listef58faa9a71e47eRowModel = list[position]
    holder.binding.listef58faa9a71e47eRowModel = listef58faa9a71e47eRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listef58faa9a71e47eRowModel>) {
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
      item: Listef58faa9a71e47eRowModel
    ) {
    }
  }

  inner class RowListef58faa9a71e47eVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListef58faa9a71e47eBinding = RowListef58faa9a71e47eBinding.bind(itemView)
  }
}
