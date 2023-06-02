package com.godrejagrovet.tripsheet.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.godrejagrovet.tripsheet.databinding.FragmentCollectionRouteBinding

class CollectionRouteFragment : Fragment() {

    private var collectionRouteBinding: FragmentCollectionRouteBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        collectionRouteBinding = FragmentCollectionRouteBinding.inflate(inflater)
        return collectionRouteBinding!!.root
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_collection_route, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        collectionRouteBinding = null
    }

}