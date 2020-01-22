package com.kyawt.shopapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.shopapp.adapter.LatestAdapter
import com.kyawt.shopapp.model.LatestModel
import kotlinx.android.synthetic.main.fragment_latest_arrival.*

/**
 * A simple [Fragment] subclass.
 */
class LatestArrivalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_latest_arrival, container, false)

        var latestRecycler = view.findViewById<RecyclerView>(R.id.recycler_latest)

        var latestList = ArrayList<LatestModel>()
        latestList.add(LatestModel("Hyde Park","LOUIS VUITTON", 999999, 1200000, R.drawable.bag))
        latestList.add(LatestModel("I Phone 11 Pro Max","Apple", 1200000,1500000, R.drawable.iphone))
        latestList.add(LatestModel("Camera","Leica",1300000, 1500000, R.drawable.camera))
        latestList.add(LatestModel("MacBook Pro","Apple", 2800000,3000000, R.drawable.macbook))


        var latestAdapter = LatestAdapter(latestList)

        latestRecycler.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        latestRecycler.adapter = latestAdapter

        return view
    }


}
