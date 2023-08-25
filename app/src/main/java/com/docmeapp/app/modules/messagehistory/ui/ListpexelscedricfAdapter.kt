package com.docmeapp.app.modules.messagehistory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowListpexelscedricfBinding
import com.docmeapp.app.modules.messagehistory.`data`.model.ListpexelscedricfRowModel
import kotlin.Int
import kotlin.collections.List

class ListpexelscedricfAdapter(
  var list: List<ListpexelscedricfRowModel>
) : RecyclerView.Adapter<ListpexelscedricfAdapter.RowListpexelscedricfVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpexelscedricfVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpexelscedricf,parent,false)
    return RowListpexelscedricfVH(view)
  }

  override fun onBindViewHolder(holder: RowListpexelscedricfVH, position: Int) {
    val listpexelscedricfRowModel = ListpexelscedricfRowModel()
    // TODO uncomment following line after integration with data source
    // val listpexelscedricfRowModel = list[position]
    holder.binding.listpexelscedricfRowModel = listpexelscedricfRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListpexelscedricfRowModel>) {
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
      item: ListpexelscedricfRowModel
    ) {
    }
  }

  inner class RowListpexelscedricfVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpexelscedricfBinding = RowListpexelscedricfBinding.bind(itemView)
  }
}
