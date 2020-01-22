package com.kyawt.shopapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kyawt.shopapp.R
import com.kyawt.shopapp.model.PopularModel

class PopularViewHolder(viewList:View): RecyclerView.ViewHolder(viewList){
    var name = viewList.findViewById<TextView>(R.id.txt_name)
    var brand = viewList.findViewById<TextView>(R.id.txt_brand)
    var discount = viewList.findViewById<TextView>(R.id.txt_discount)
    var old_price = viewList.findViewById<TextView>(R.id.txt_old_price)
    var new_price = viewList.findViewById<TextView>(R.id.txt_new_price)
    var image = viewList.findViewById<ImageView>(R.id.img_popular)
}

class PopularAdapter (var popularList:ArrayList<PopularModel>) : RecyclerView.Adapter<PopularViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false)
        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.name.text = popularList[position].name
        holder.brand.text = popularList[position].brand
        holder.discount.text = popularList[position].discount
        holder.old_price.text = popularList[position].old_price.toString()
        holder.new_price.text = popularList[position].new_price.toString()
        holder.image.setImageResource(popularList[position].image)
    }
}