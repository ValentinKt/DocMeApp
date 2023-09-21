package com.docmeapp.app.modules.articles.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowListrectangle460Binding
import com.docmeapp.app.modules.articles.`data`.model.Listrectangle460RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle460Adapter(
  var list: List<Listrectangle460RowModel>
) : RecyclerView.Adapter<Listrectangle460Adapter.RowListrectangle460VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle460VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle460,parent,false)
    return RowListrectangle460VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle460VH, position: Int) {
    val listrectangle460RowModel = Listrectangle460RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle460RowModel = list[position]
    holder.binding.listrectangle460RowModel = listrectangle460RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle460RowModel>) {
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
      item: Listrectangle460RowModel
    ) {
    }
  }

  inner class RowListrectangle460VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle460Binding = RowListrectangle460Binding.bind(itemView)
  }
}
