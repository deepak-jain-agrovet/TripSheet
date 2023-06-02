package com.godrejagrovet.tripsheet.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.godrejagrovet.tripsheet.ui.fragments.CollectionRouteFragment
import com.godrejagrovet.tripsheet.ui.fragments.DeliveryRouteFragment

class RoutePageAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                DeliveryRouteFragment()
            }

            1 -> {
                CollectionRouteFragment()
            }

            else -> {
                Fragment()
            }
        }
    }
}