package com.kyawt.shopapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.shopapp.adapter.CountryAdapter
import com.kyawt.shopapp.model.CountryModel

/**
 * A simple [Fragment] subclass.
 */
class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_country, container, false)

        var countryRecyclerView = view.findViewById<RecyclerView>(R.id.recycler_country)

        var countryList = ArrayList<CountryModel>()
        countryList.add(CountryModel("Japan", R.drawable.japan))
        countryList.add(CountryModel("Korea", R.drawable.korea))
        countryList.add(CountryModel("China", R.drawable.china))
        countryList.add(CountryModel("International", R.drawable.internation))

        var countryAdapter = CountryAdapter(countryList)

        countryRecyclerView.layoutManager = GridLayoutManager(context, 2)
        countryRecyclerView.adapter = countryAdapter

        return view
    }


}
