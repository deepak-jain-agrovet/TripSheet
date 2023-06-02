package com.godrejagrovet.tripsheet.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.godrejagrovet.tripsheet.R
import com.godrejagrovet.tripsheet.databinding.ActivityRouteSpecificDetailsBinding
import com.godrejagrovet.tripsheet.ui.adapters.RoutePageAdapter
import com.google.android.material.tabs.TabLayoutMediator

class RouteSpecificDetailsActivity : AppCompatActivity() {

    private var routeSpecificDetailsBinding: ActivityRouteSpecificDetailsBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        routeSpecificDetailsBinding = ActivityRouteSpecificDetailsBinding.inflate(layoutInflater)
        setContentView(routeSpecificDetailsBinding!!.root)

        routeSpecificDetailsBinding!!.routeDetailPager.adapter = RoutePageAdapter(this)

        TabLayoutMediator(routeSpecificDetailsBinding!!.routeDetailTab, routeSpecificDetailsBinding!!.routeDetailPager) { tab, pos ->
            when(pos) {
                0 -> {
                    tab.text = resources.getStringArray(R.array.route_headers)[0].toString()
                }
                1 -> {
                    tab.text = resources.getStringArray(R.array.route_headers)[1].toString()
                }
            }
        }.attach()
    }

    override fun onDestroy() {
        super.onDestroy()
        routeSpecificDetailsBinding = null
    }
}