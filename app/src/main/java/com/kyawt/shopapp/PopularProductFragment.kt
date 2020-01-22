package com.kyawt.shopapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.shopapp.adapter.PopularAdapter
import com.kyawt.shopapp.model.PopularModel

/**
 * A simple [Fragment] subclass.
 */
class PopularProductFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_popular_product, container, false)

        var popularRecycler = view.findViewById<RecyclerView>(R.id.recycler_popular)

        var popularList = ArrayList<PopularModel>()
        popularList.add(PopularModel("I Phone 11 Pro Max", "Apple", "30% off", 98000000, 1100000, R.drawable.iphone))
        popularList.add(PopularModel("Bed", "GhostBed", "34% off", 325000, 495000, R.drawable.bed))
        popularList.add(PopularModel("Camera", "Leica", "20% off", 540000, 680000, R.drawable.camera))
        popularList.add(PopularModel("MacBook Pro", "Apple", "30% off", 3000000, 3200000, R.drawable.macbook))


        var popularAdapter = PopularAdapter(popularList)
        popularRecycler.layoutManager = LinearLayoutManager(context)
        popularRecycler.adapter = popularAdapter
        return view
    }


}
