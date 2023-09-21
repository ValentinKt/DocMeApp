package com.docmeapp.app.modules.schedule.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowScheduleBinding
import com.docmeapp.app.modules.schedule.`data`.model.ScheduleRowModel
import kotlin.Int
import kotlin.collections.List

class ScheduleAdapter(
  var list: List<ScheduleRowModel>
) : RecyclerView.Adapter<ScheduleAdapter.RowScheduleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowScheduleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_schedule,parent,false)
    return RowScheduleVH(view)
  }

  override fun onBindViewHolder(holder: RowScheduleVH, position: Int) {
    val scheduleRowModel = ScheduleRowModel()
    // TODO uncomment following line after integration with data source
    // val scheduleRowModel = list[position]
    holder.binding.scheduleRowModel = scheduleRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ScheduleRowModel>) {
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
      item: ScheduleRowModel
    ) {
    }
  }

  inner class RowScheduleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowScheduleBinding = RowScheduleBinding.bind(itemView)
  }
}
