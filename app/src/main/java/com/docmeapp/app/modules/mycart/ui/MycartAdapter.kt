package com.docmeapp.app.modules.mycart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowMycartBinding
import com.docmeapp.app.modules.mycart.`data`.model.MycartRowModel
import kotlin.Int
import kotlin.collections.List

class MycartAdapter(
  var list: List<MycartRowModel>
) : RecyclerView.Adapter<MycartAdapter.RowMycartVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMycartVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_mycart,parent,false)
    return RowMycartVH(view)
  }

  override fun onBindViewHolder(holder: RowMycartVH, position: Int) {
    val mycartRowModel = MycartRowModel()
    // TODO uncomment following line after integration with data source
    // val mycartRowModel = list[position]
    holder.binding.mycartRowModel = mycartRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MycartRowModel>) {
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
      item: MycartRowModel
    ) {
    }
  }

  inner class RowMycartVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMycartBinding = RowMycartBinding.bind(itemView)
  }
}
