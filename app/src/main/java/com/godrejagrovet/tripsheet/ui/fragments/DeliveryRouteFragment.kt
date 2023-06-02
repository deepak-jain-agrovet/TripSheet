package com.godrejagrovet.tripsheet.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.godrejagrovet.tripsheet.databinding.FragmentDeliveryRouteBinding

class DeliveryRouteFragment : Fragment() {

    private var deliveryRouteBinding: FragmentDeliveryRouteBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        deliveryRouteBinding = FragmentDeliveryRouteBinding.inflate(inflater)
        return deliveryRouteBinding!!.root
//        return inflater.inflate(R.layout.fragment_delivery_route, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        deliveryRouteBinding = null
    }

}