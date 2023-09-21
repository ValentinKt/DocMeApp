package com.docmeapp.app.modules.profile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.docmeapp.app.R
import com.docmeapp.app.databinding.RowProfileBinding
import com.docmeapp.app.modules.profile.`data`.model.ProfileRowModel
import kotlin.Int
import kotlin.collections.List

class ProfileAdapter(
  var list: List<ProfileRowModel>
) : RecyclerView.Adapter<ProfileAdapter.RowProfileVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfileVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profile,parent,false)
    return RowProfileVH(view)
  }

  override fun onBindViewHolder(holder: RowProfileVH, position: Int) {
    val profileRowModel = ProfileRowModel()
    // TODO uncomment following line after integration with data source
    // val profileRowModel = list[position]
    holder.binding.profileRowModel = profileRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProfileRowModel>) {
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
      item: ProfileRowModel
    ) {
    }
  }

  inner class RowProfileVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowProfileBinding = RowProfileBinding.bind(itemView)
  }
}
