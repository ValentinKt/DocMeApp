package com.docmeapp.app.modules.resetpasswordemailtabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.di.MyApp
import com.docmeapp.app.modules.resetpasswordemail.ui.ResetPasswordEmailFragment
import com.docmeapp.app.modules.resetpasswordphone.ui.ResetPasswordPhoneFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class ResetPasswordEmailTabContainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_email),MyApp.getInstance().resources.getString(R.string.lbl_phone))

        val viewPages: List<Fragment> =
                listOf(ResetPasswordEmailFragment(),ResetPasswordPhoneFragment())

    }
}
