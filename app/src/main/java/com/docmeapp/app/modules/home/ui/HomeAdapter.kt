package com.docmeapp.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowHomeBinding
import com.docmeapp.app.modules.home.`data`.model.HomeRowModel
import kotlin.Int
import kotlin.collections.List

class HomeAdapter(
  var list: List<HomeRowModel>
) : RecyclerView.Adapter<HomeAdapter.RowHomeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home,parent,false)
    return RowHomeVH(view)
  }

  override fun onBindViewHolder(holder: RowHomeVH, position: Int) {
    val homeRowModel = HomeRowModel()
    // TODO uncomment following line after integration with data source
    // val homeRowModel = list[position]
    holder.binding.homeRowModel = homeRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeRowModel>) {
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
      item: HomeRowModel
    ) {
    }
  }

  inner class RowHomeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomeBinding = RowHomeBinding.bind(itemView)
  }
}
