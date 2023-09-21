package com.docmeapp.app.modules.messagehistorytabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import com.docmeapp.app.modules.messagehistory.ui.MessageHistoryFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class MessageHistoryTabContainerFragmentPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_all),MyApp.getInstance().resources.getString(R.string.lbl_group),MyApp.getInstance().resources.getString(R.string.lbl_private))

        val viewPages: List<Fragment> =
                listOf(MessageHistoryFragment(),MessageHistoryFragment(),MessageHistoryFragment())

    }
}
