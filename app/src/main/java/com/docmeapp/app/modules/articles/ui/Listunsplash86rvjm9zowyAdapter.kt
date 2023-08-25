package com.docmeapp.app.modules.articles.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowListunsplash86rvjm9zowyBinding
import com.docmeapp.app.modules.articles.`data`.model.Listunsplash86rvjm9zowyRowModel
import kotlin.Int
import kotlin.collections.List

class Listunsplash86rvjm9zowyAdapter(
  var list: List<Listunsplash86rvjm9zowyRowModel>
) : RecyclerView.Adapter<Listunsplash86rvjm9zowyAdapter.RowListunsplash86rvjm9zowyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListunsplash86rvjm9zowyVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listunsplash86rvjm9zowy,parent,false)
    return RowListunsplash86rvjm9zowyVH(view)
  }

  override fun onBindViewHolder(holder: RowListunsplash86rvjm9zowyVH, position: Int) {
    val listunsplash86rvjm9zowyRowModel = Listunsplash86rvjm9zowyRowModel()
    // TODO uncomment following line after integration with data source
    // val listunsplash86rvjm9zowyRowModel = list[position]
    holder.binding.listunsplash86rvjm9zowyRowModel = listunsplash86rvjm9zowyRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listunsplash86rvjm9zowyRowModel>) {
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
      item: Listunsplash86rvjm9zowyRowModel
    ) {
    }
  }

  inner class RowListunsplash86rvjm9zowyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListunsplash86rvjm9zowyBinding =
        RowListunsplash86rvjm9zowyBinding.bind(itemView)
  }
}
