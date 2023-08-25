package com.docmeapp.app.modules.topdoctor.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowTopdoctorBinding
import com.docmeapp.app.modules.topdoctor.`data`.model.TopdoctorRowModel
import kotlin.Int
import kotlin.collections.List

class TopdoctorAdapter(
  var list: List<TopdoctorRowModel>
) : RecyclerView.Adapter<TopdoctorAdapter.RowTopdoctorVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTopdoctorVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_topdoctor,parent,false)
    return RowTopdoctorVH(view)
  }

  override fun onBindViewHolder(holder: RowTopdoctorVH, position: Int) {
    val topdoctorRowModel = TopdoctorRowModel()
    // TODO uncomment following line after integration with data source
    // val topdoctorRowModel = list[position]
    holder.binding.topdoctorRowModel = topdoctorRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TopdoctorRowModel>) {
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
      item: TopdoctorRowModel
    ) {
    }
  }

  inner class RowTopdoctorVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTopdoctorBinding = RowTopdoctorBinding.bind(itemView)
  }
}
